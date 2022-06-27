package com.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientTest {

	public static void main(String[] args) {
		
		int port = 7777;
		String host = "127.0.0.1";
		
		Socket sc = null;
		
		ObjectOutputStream oos = null;
		
		Scanner scn = new Scanner(System.in);	//����ڰ� �������� ������ ��ġ���� �ޱ�
		
		String path;
		
		try {
			
			System.out.print("���� �� ���� ��� �� ���ϸ�: "); // ex) c:\\doc\\a.txt
			path = scn.next();
			
			File f = new File(path);
			
			if(!f.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				System.exit(0);
			}
			
			//���� ����
			sc = new Socket(host, port);	//server�� run(), �� ������� ¦ ���߱�
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			
			//���� ���۽���
			Fileinfo info;
			
			info = new Fileinfo();
			info.setCode(100);
			info.setData(f.getName().getBytes());	//data�� byte[] ���̹Ƿ� .getbytes()�� byte�������� ������ ������
			info.setSize((int) f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName()+"���� ���� ����!");
			
			Thread.sleep(30); //ū �����͸� �ѹ��� ������ ���� �� �ִ� ���������� �����ϱ� ���� delay �ɾ���
			
			//���� ��������
			
			FileInputStream fis = new FileInputStream(f);
			
			int byteData = 0;
			
			byte[] buffer = new byte[1024];
			
			while((byteData = fis.read(buffer, 0, 1024))!=-1) {
				
				info = new Fileinfo();
				
				info.setCode(110);
				info.setSize(byteData);
				info.setData(buffer);
				
				oos.writeObject(info);
				
				System.out.println(byteData + "bytes ������!");
				
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}
			
			fis.close();		//while�������� �ݺ������� ���� �б� ��
			
			//���� ��������
			
			info = new Fileinfo();
			
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "���� ��������!");
			
			Thread.sleep(30);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
