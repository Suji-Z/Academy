package com.day9;

import java.util.Scanner;

//생성자
//1.메모리할당(객체생성)
//2.변수 초기화				*의존성주입 (DI)
//클래스 이름과 동일
//리턴값이 없기때문에 property가 없다
//중복 정의 가능
//생성자에서 다른 생성자를 호출 할 수 있다.
//단, 맨 선두에서 한번만 호출 가능하다.

public class Test2 {
	
	private int x;
	
	public Test2() {	//default 생성자 (기본생성자)
		
//		this(30); //오버로딩 생성자를 부를경우, 기존 클래스이름과 동일하기때문에 충돌.
//		this로 호출한 뒤 매개변수 입력하면 가능
//		생성자는 1번만 호출 가능
		
//		System.out.println("기본생성자");
//		x = 10;
//		System.out.println("x: "+x);
	}
	
	public Test2(int x)	{	//생성자 중복정의
		
//		System.out.println("오버로딩된 생성자");
		this.x = x;
		
//		System.out.println("x: "+x);
		
	}
	
	public void setData(int x) {
		
		this.x = x;
		
	}

	public static void main(String[] args) {
		
		
		Test2 ob1 = new Test2();
		
		System.out.println(ob1.x);//0
		ob1.setData(100);
		
		System.out.println(ob1.x);//100
		
		//------------------------------
		
		Test2 ob2 = new Test2(20);
		System.out.println(ob2.x);
		
		Test2 ob3 = new Test2();
		Test2 ob4 = new Test2(60);	//매개변수 안에 class를 넣을수도 있음
		
//		Scanner sc = new Scanner(source)	//scanner는 기본생성자를 삭제해놨기 때문에, ctrl+space시 기본생성자 안나타남.
												//ex.Scanner() <빈 괄호
		
	}

}
