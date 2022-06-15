package com.day13;

//형태를 기억만 해두기

//1.내부 클래스(Inner) : 겉 껍데기인 클래스의 메소드와 가까움, 메소드안에도 클래스 생성 가능

class Outer1{
	
	static int a=10;
	int b = 20;
	
	public class Inner1{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		
		System.out.println("print()...");
		Inner1 ob = new Inner1();
		ob.write();
	}
	
}

public class Test4 {

	public static void main(String[] args) {
//		외부클래스가 객체 생성이 되어야
//		내부 클래스의 객체를 생성할 수 있고
//		외부 클래스가 객체 생성이 되었다고 해서
//		자동으로 내부클래스의 객체가 생성되는것은 아니다.
		
		Outer1 out = new Outer1();		//외부클래스 객체 먼저 생성
		out.print();
		
		Outer1.Inner1 inner = out.new Inner1();		//외부클래스.이너클래스 변수 = 외부클래스 객체 변수.new 이너클래스();
		inner.write();
	}

}
