package com.day2;

//public : 접근지정자(or private)
//첫글자 대문자(예 : CustomInfo)
//클래스의 이름과 파일의 이름은 일치
public class Test1 {
	
	//method : 명령어
	//메인메소드 
	//void : return값 없음
	//메소드이름 : 첫글자 소문자(customInfo) ;camel 표기법
	public static void main(String[] args) {	// String[] args는 인수(매개변수) 주로 ( ) 안에 들어감.
		System.out.print("오늘은 금요일~~\n\n"); // ( ) 안 문자열도 매개변수
		// '\' 엔터 기능. ex "오늘은 금요일~~\n"
		System.out.println();
		System.out.println("불금입니다...");
		
		System.out.print('a');
		System.out.println(); //엔터만 출력됨 
	}
}