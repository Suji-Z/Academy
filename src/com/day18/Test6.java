package com.day18;

import java.io.FileOutputStream;

public class Test6 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("c:\\doc\\out.txt");
			
			int data;
			
			System.out.print("문자열 입력: ");
			
			while((data=System.in.read())!=-1) {		//사용자가 입력한 문자를 파일에 저장
				
				fos.write(data);
				fos.flush();				//엔터 친 라인 전부 문자열을 파일로 저 장
				
				
			
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
