package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest extends Frame implements ActionListener,Runnable{

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;
	
	public ServerTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this); 	// tf에서 엔터를 칠 경우 동작을 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("채팅 서버");
		setSize(300, 400);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//메세지 보내기
		
		String msg = tf.getText();
		
		if(msg.trim().equals("")) {
			
			return;
			
		}
		
		if(sc==null) {
			return;
		}
		
		try {
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);		//연결한 데이터를 printwriter로 출력(내보냄)
			//true : 자동 flush. //마지막 문장이 ㅇㅇ가아니라도 flush없이 자동출력									
			
			pw.println("서버]" + msg);
			ta.append("\r\n서버] " + msg);   //내 창에 메세지 보임
			
			tf.setText("");
			tf.requestFocus();	//tf에 커서 두기
			
			
		} catch (Exception e2) {
			ta.append("\r\n 클라이언트와 연결이 끊겼습니다.");
			sc = null;
		}
		
	}

	@Override
	public void run() {
		//메세지 받기
		
		String msg;
		String ip;
		
		try {
			
			if(sc==null) {
				return;
				
			}
			
			InputStream is = sc.getInputStream();	//소켓의 인풋스트림으로 데이터(메세지) 받기
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//클라이언트의 IP 받기
			ip = sc.getInetAddress().getHostAddress();
			
			
			ta.append("\r\n["+ip+"] 접속하였습니다.");
			
			while((msg = br.readLine())!=null) {
				
				ta.append("\r\n"+msg);
				
			}
			
			
		} catch (Exception e) {
			ta.append("\r\n"+"클라이언트 연결 종료.");
			sc = null;
			ss = null;
		}
		
	}
	
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777);	//소켓으로 열어줌
			ta.setText("서버 시작");
			// 홀딩
			
			sc = ss.accept();	//클라이언트와 연결시켜주는 구간. Block상태로 CPU 대기중
			
			Thread th = new Thread(this);
			th.start();		// 서버가 열려 연결이 된 후 상대가 보낸 데이터를 받는 동작 (thread로)
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
	
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new ServerTest().serverStart();
		
		
		
		

	}

}
