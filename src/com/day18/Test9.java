package com.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args) {

		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\doc\\test.txt");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String str;
			
			while((str=br.readLine())!=null) {	//문자는 null이 아닐때까지
				System.out.println(str);
				
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
