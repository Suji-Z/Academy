package com.day12;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write() {
		System.out.println("����Ŭ���� write()...");
	}
	
	public int sum() {
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print() {
		System.out.println("����Ŭ���� print()...");
	}
	
	@Override
	public int sum() {
		return a+b+c;
	}
}


public class Test10 {

	public static void main(String[] args) {
		
		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: " + ob1.b); 	//100
		
		SuperTest ob2 = ob1;	//upcast
		System.out.println("ob2.b: " + ob2.b);	//20
		System.out.println("��: " + ob2.sum()); //310 �޼ҵ�� upcast�ص� ����x..
	
		ob2.write();	//����Ŭ������ �������ִ� �޼ҵ��̹Ƿ� ����Ŭ������ �޼ҵ� ���� ���
		
		//sum()�� ȣ���� ���, sum()�޼ҵ� �ȿ� ��¹��� �����Ƿ� ��¾ȵ�.. print()�ȿ� ������� ��°���
		
		((SubTest)ob2).print(); 	//downcast �θ�->�ڽ� ����ȯ
	}

}
