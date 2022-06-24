package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		int data;
		
		//파일복사
		//원본파일 : c:\\doc\\test.txt
		//대상파일: c:\\doc\\out1.txt
		//복사완료!
	
		try {
			
			System.out.print("원본 파일: ");
			str1 = sc.next();
			
			System.out.print("대상 파일: ");
			str2 = sc.next();
			
			FileInputStream fis = new FileInputStream(str1);	//원본파일 데이터 카피
			FileOutputStream fos = new FileOutputStream(str2);	//카피한 데이터를 str2로 출력
			
			while((data = fis.read())!=-1) {
				
				// 문자열을 바이트배열로 변환해서 파일에 저장
				fos.write(data);
				fos.flush();
		
				
			}
			
			fis.close();
			fos.close();
			
			System.out.print("복사 완료.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
