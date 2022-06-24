package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test8 {

		public boolean fileCopy(String str1, String str2) {
			
			File f = new File(str1);
			
			if(!f.exists()) {	//파일이 존재하지 않으면 'false'를 조건으로
				return false;
			}
			
			try {
				
				FileInputStream fis = new FileInputStream(str1);
				FileOutputStream fos = new FileOutputStream(str2);
				
				int data;
				byte[] buffer = new byte[1024];
				
				while((data=fis.read(buffer, 0, 1024))!=-1) {
					fos.write(buffer, 0, data);	//data(1024크기)만큼 buffer에 넣어서 fos로 빼냄
				}
				
				fos.close();
				fis.close();
					
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
			
			return true;	//성공시 true, 실패시 false 반환
		}


		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Test8 ob = new Test8();
			
			String str1, str2;
			
			System.out.print("원본 파일: ");
			str1 = sc.next();
			
			System.out.print("대상 파일: ");
			str2 = sc.next();
			
			if(ob.fileCopy(str1, str2)) {	//boolean은 if문으로 true, false 받기 기억
				System.out.println("파일복사 성공");
				
			}else {
				System.out.println("파일복사 실패");
			}
		
		}
}
