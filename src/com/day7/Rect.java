package com.day7;

import java.util.Scanner;

public class Rect {
	
	int w,h; 	//전역 변수,instane 변수는 초기화 하지 않아도 자동으로 int의 기본값 '0'이 들어가 있음.
	
	public void input() { //접근지정자 property 자리
		Scanner sc = new Scanner(System.in); //new 뒤에 생성자
		//int w, h; //지역 변수
		
		System.out.print("가로: "); //10
		
		w = sc.nextInt();
		
		System.out.print("세로: "); //20
		h = sc.nextInt();
		
		//반환값이 없는 void일 때 원래는 return값을 지정해주어야 하나 void는 return을 생략하고 사용
		
		//return;
		
	}
	
	//넓이 구하기
	public int area() { //넓이 구하는 메소드 만들어줌
		
		int result;
		
		result = w*h;
		
		return result;
	}
	
	//둘레 구하기
	public int length() {
		
		return (w+h)*2; //연산이 간단하면 바로 리턴 가능
		
	}
	
	//출력
	public void print(int a,int l) {
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
		
	}

}
