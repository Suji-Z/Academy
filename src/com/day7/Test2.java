package com.day7;

class Sub{		//�ν��Ͻ��� �޼ҵ尡 �ݵ�� ���� �� �ʿ�� X
	
	int a,b;
	
	
	
}
public class Test2 {

	public static void main(String[] args) {
		
		Sub ob1 = new Sub();
		Sub ob2 = new Sub();
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);	//�ڵ����� 0���� �ʱ�ȭ
		
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
