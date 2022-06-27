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

public class ClientTest extends Frame implements ActionListener,Runnable{

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	private Socket sc = null;
	private int port = 7777;
	private String host = "192.168.16.0";	// localhost(127.0.0.1) : java 'this'와 동일한, 네트워크에서 자신의 IP를 지칭하는 대명사
									
	public ClientTest() {
		
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
			
			pw.println("수지]" + msg);
			ta.append("\r\n수지] " + msg);   //내 창에 메세지 보임
			
			tf.setText("");
			tf.requestFocus();	//tf에 커서 두기
			
			
		} catch (Exception e2) {
			ta.append("\r\n 서버와 연결이 끊겼습니다.");
			sc = null;
		}
		
	}

	@Override
	public void run() {
		//메세지 받기
		
		//client는 IP 불러오기 필요x. 서버에서 받았기때문
		
		String msg;
		
		try {
			
			if(sc==null) {
				return;
				
			}
			
			InputStream is = sc.getInputStream();	//소켓의 인풋스트림으로 데이터(메세지) 받기
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			
			while((msg = br.readLine())!=null) {			
				ta.append("\r\n"+msg);			
			}
			
			
		} catch (Exception e) {
			ta.append("\r\n"+"서버 연결 종료.");
			sc = null;
		}
		
	}
	
	
	public void connect() {
		
		try {
			
			sc = new Socket(host, port);	//이 소켓을 받은 서버가 accept 시킴. 연결되면 이후 thread 실행

			Thread th = new Thread(this);
			th.start();		// 서버가 열려 연결이 된 후 상대가 보낸 데이터를 받는 동작 (thread로)
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
	
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new ClientTest().connect();


	}

}
