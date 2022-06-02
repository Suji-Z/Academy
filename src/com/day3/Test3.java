package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		char ch,result;
		ch = 'a'; //97 (아스키 값)
		//System.out.println(ch); //실질적으론 아스키값 97이 들어가 a가 출력됨
		//System.out.println(Integer.toString(ch));
		
		System.out.print("한개의 문자?"); //a
		ch = (char) System.in.read();//read는 int가 반환값이라 char로 형변환 해주어야 함
		//ch엔 실제로 97이 들어가있음	
		//system.in은 한개의 문자만 읽어냄 ex)abcd중 a만
			//97(57,55)
		
		result = ch >= 65 && ch <= 90 ? (char)(ch+32) : 
			(ch >= 'a' && ch <= 'z' ? (char)(ch-32) : ch); //65~90은 대문자 A~Z 사이, 
	//크기비교시엔 자동으로 int로 형변환
		System.out.println(ch + ":" + result); 
		
	}

}
