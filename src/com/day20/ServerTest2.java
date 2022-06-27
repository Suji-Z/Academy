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
			System.out.println("**���� ����**");
			
			while(true) {
				
				Socket sc = ss.accept();	//�������Ͽ� accept�ϴ� ������ while������ Ŭ���̾�Ʈ�� ������ �� ���� �����Ͽ� holding
				
				WorkerThread th = new WorkerThread(sc);
				th.start();
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		//thread�� socket�� �ʼ�..
	class WorkerThread extends Thread{		//������ Ŭ������ ����� Thread������ �� �� �ֵ��� ���
		
		private Socket sc;					//Ŭ���̾�Ʈ�� ������ �� ���� ������ �����尡 �����Ǿ� ���ϵ� �Բ� ��ü ����
		
		public WorkerThread(Socket sc) {	// ������ �����ε��Ͽ� ������ ��ü ������ �ڵ����� ������ �Բ� ��������� ����
			this.sc = sc;
		}
		
		@Override
		public void run() {

			String ip = null;
			String msg = null;
			
			try {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				ip = sc.getInetAddress().getHostAddress();	//ip �о����
				
				clients.add(sc);	//����Ʈ�� ����� ������(����)�� ���� �ֱ�
				
				//(������ ������)�ٸ� Ŭ���̾�Ʈ���� ���� ����� �˸� 
				
				msg = ip + "] �� �����Ͽ����ϴ�.";
				
				for(Socket s : clients) {
					
					if(s==sc) {		//clients���� ������ ������ s�� ������ sc�� ��ġ�� ���
						continue;	//�̹��� �н�, �ٽ� for������ ȸ��
					}
					
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);		//�̰� ����������...
					
					pw.println(msg);
					
				}
				
				System.out.println(msg);	//������ ��ȭ ����
				
				//�޼��� ���� (���� ����)
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
				
				msg = ip + "] �� �����Ͽ����ϴ�.";
				
				try {					//���� �����ϰ� ���� ������ �ٸ� Ŭ���̾�Ʈ�鿡�� �޼��� �˸�
					
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
