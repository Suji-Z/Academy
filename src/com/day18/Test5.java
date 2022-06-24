package com.day18;

import java.io.FileInputStream;

//*****중요*****
//파일 입출력
//FileInputStream (파일 입력) <-> FileOutputStream (파일 출력)

public class Test5 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");		//파일 위치지정
			
			int data;
			while((data=fis.read())!=-1) {		//fis.read -> 'enter'를 기준으로 읽어옴
				
//				System.out.print((char)data); // byte로 읽어오게 될 경우 글자가 깨짐
				System.out.write(data);
				System.out.flush();			// enter가 없어도 파일을 모두 읽어오도록 flush();
				
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
