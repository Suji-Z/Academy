package com.day18;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {
		
		String str1 = "c:\\doc\\temp\\java\\test1.txt";
						
		//방법1
		/*
		String path = str1.substring(0, str1.lastIndexOf("\\")); //마지막 '//' 이전까지만 경로 설정
//		System.out.println(path);
	
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();	//무조건 dir's'만 사용
		}
		*/
		
		//방법2
		File f = new File(str1);
		
		if(!f.getParentFile().exists()) {	//'폴더'존재 여부까지 확인하는 메소드 parentfile()
			f.getParentFile().mkdirs();
		}
		
		try {
			
			FileOutputStream fos = new FileOutputStream(str1);
			System.out.println("문자열");
			
			int data;
			
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			fos.close();
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
