package com.day13;

//2.내부 클래스(Local) : 메소드 안에 있는 클래스
//@@로컬 클래스의 객체생성은 해당 메소드 내에서만 가능@@

class Outer2{
	
	static int a = 10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;
		
		class Inner2{	//Local class
			
			public void print() {
				
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			
			}	
		}
		
		Inner2 ob = new Inner2();
		ob.print();
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();	//외부 클래스 객체 생성
		
		out.write();	//메소드 안에 객체를 실행해놓으면, 메인에서 메소드를 실행했을 때 함께 실행됨
	
	}

}
