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
	private String host = "192.168.16.0";	// localhost(127.0.0.1) : java 'this'�� ������, ��Ʈ��ũ���� �ڽ��� IP�� ��Ī�ϴ� ����
									
	public ClientTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this); 	// tf���� ���͸� ĥ ��� ������ ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("ä�� ����");
		setSize(300, 400);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�޼��� ������
		
		String msg = tf.getText();
		
		if(msg.trim().equals("")) {
			
			return;
			
		}
		
		if(sc==null) {
			return;
		}
		
		try {
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);		//������ �����͸� printwriter�� ���(������)
			//true : �ڵ� flush. //������ ������ �������ƴ϶� flush���� �ڵ����									
			
			pw.println("����]" + msg);
			ta.append("\r\n����] " + msg);   //�� â�� �޼��� ����
			
			tf.setText("");
			tf.requestFocus();	//tf�� Ŀ�� �α�
			
			
		} catch (Exception e2) {
			ta.append("\r\n ������ ������ ������ϴ�.");
			sc = null;
		}
		
	}

	@Override
	public void run() {
		//�޼��� �ޱ�
		
		//client�� IP �ҷ����� �ʿ�x. �������� �޾ұ⶧��
		
		String msg;
		
		try {
			
			if(sc==null) {
				return;
				
			}
			
			InputStream is = sc.getInputStream();	//������ ��ǲ��Ʈ������ ������(�޼���) �ޱ�
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			
			while((msg = br.readLine())!=null) {			
				ta.append("\r\n"+msg);			
			}
			
			
		} catch (Exception e) {
			ta.append("\r\n"+"���� ���� ����.");
			sc = null;
		}
		
	}
	
	
	public void connect() {
		
		try {
			
			sc = new Socket(host, port);	//�� ������ ���� ������ accept ��Ŵ. ����Ǹ� ���� thread ����

			Thread th = new Thread(this);
			th.start();		// ������ ���� ������ �� �� ��밡 ���� �����͸� �޴� ���� (thread��)
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
	
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new ClientTest().connect();


	}

}
