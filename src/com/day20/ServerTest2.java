package com.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {
	
	private ArrayList<Socket> clients = new ArrayList<>();

	public void serverStart() {
		
		try {
			
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("**서버 시작**");
			
			while(true) {
				
				Socket sc = ss.accept();	//서버소켓에 accept하는 과정을 while문으로 클라이언트가 접속할 때 마다 실행하여 holding
				
				WorkerThread th = new WorkerThread(sc);
				th.start();
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		//thread엔 socket이 필수..
	class WorkerThread extends Thread{		//임의의 클래스를 만들어 Thread역할을 할 수 있도록 상속
		
		private Socket sc;					//클라이언트가 접속할 때 마다 각각의 스레드가 생성되어 소켓도 함께 객체 생성
		
		public WorkerThread(Socket sc) {	// 생성자 오버로딩하여 스레드 객체 생성시 자동으로 소켓이 함께 따라오도록 설계
			this.sc = sc;
		}
		
		@Override
		public void run() {

			String ip = null;
			String msg = null;
			
			try {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				ip = sc.getInetAddress().getHostAddress();	//ip 읽어오기
				
				clients.add(sc);	//리스트에 사용자 스레드(소켓)을 전부 넣기
				
				//(본인을 제외한)다른 클라이언트에게 접속 사실을 알림 
				
				msg = ip + "] 가 입장하였습니다.";
				
				for(Socket s : clients) {
					
					if(s==sc) {		//clients에서 꺼내온 데이터 s가 현재의 sc와 일치할 경우
						continue;	//이번만 패스, 다시 for문으로 회귀
					}
					
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);		//이게 무슨말이지...
					
					pw.println(msg);
					
				}
				
				System.out.println(msg);	//서버에 대화 보임
				
				//메세지 전송 (본인 제외)
				while((msg=br.readLine())!=null) {
					
					for(Socket s : clients) {
						
						if(s==sc) {		
							continue;
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);	
						pw.println(msg);
						
					}
					
					System.out.println(msg);
					
				}
				
				
			} catch (Exception e) {
				
				msg = ip + "] 가 퇴장하였습니다.";
				
				try {					//위와 동일하게 나를 제외한 다른 클라이언트들에게 메세지 알림
					
					for(Socket s : clients) {
						
						if(s==sc) {		
							continue;
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						
						pw.println(msg);
						
					}
					
					System.out.println(msg);
					
					sc = null;
					
				} catch (Exception e2) {
			
					
				}
			}
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}

}
