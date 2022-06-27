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
		
		Scanner scn = new Scanner(System.in);	//사용자가 보내려는 파일의 위치정보 받기
		
		String path;
		
		try {
			
			System.out.print("전송 할 파일 경로 및 파일명: "); // ex) c:\\doc\\a.txt
			path = scn.next();
			
			File f = new File(path);
			
			if(!f.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(0);
			}
			
			//서버 연결
			sc = new Socket(host, port);	//server의 run(), 즉 스레드와 짝 맞추기
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			
			//파일 전송시작
			Fileinfo info;
			
			info = new Fileinfo();
			info.setCode(100);
			info.setData(f.getName().getBytes());	//data가 byte[] 형이므로 .getbytes()로 byte형식으로 데이터 가져옴
			info.setSize((int) f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName()+"파일 전송 시작!");
			
			Thread.sleep(30); //큰 데이터를 한번에 보낼때 생길 수 있는 병목현상을 방지하기 위해 delay 걸어줌
			
			//파일 내용전송
			
			FileInputStream fis = new FileInputStream(f);
			
			int byteData = 0;
			
			byte[] buffer = new byte[1024];
			
			while((byteData = fis.read(buffer, 0, 1024))!=-1) {
				
				info = new Fileinfo();
				
				info.setCode(110);
				info.setSize(byteData);
				info.setData(buffer);
				
				oos.writeObject(info);
				
				System.out.println(byteData + "bytes 전송중!");
				
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}
			
			fis.close();		//while문내에서 반복적으로 파일 읽기 끝
			
			//파일 전송종료
			
			info = new Fileinfo();
			
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일 전송종료!");
			
			Thread.sleep(30);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
