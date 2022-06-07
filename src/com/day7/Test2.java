package com.day7;

class Sub{		//인스턴스나 메소드가 반드시 존재 할 필요는 X
	
	int a,b;
	
	
	
}
public class Test2 {

	public static void main(String[] args) {
		
		Sub ob1 = new Sub();
		Sub ob2 = new Sub();
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);	//자동으로 0으로 초기화
		
		ob1.a=10;
		ob1.b=20;
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
		ob2.a=100;
		ob2.b=200;

		System.out.println("ob2.a: " + ob2.a);
		System.out.println("ob2.b: " + ob2.b);
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
	}

}
