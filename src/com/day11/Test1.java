package com.day11;

//Object : ��� Ŭ������ �ֻ��� �θ�

class Test{
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("ob1==ob2: " + (ob1==ob2)); 	// '=='�� �� ��ü�� �ּ�(?)�� �������� ������
		System.out.println("ob1.equals(ob2): "+ob1.equals(ob2));

		//�ؽ��ڵ�(hashcode) [Ŭ�����̸�@�ؽ��ڵ�]
		System.out.println("ob1: "+ob1);	//Test@7852e922
		System.out.println("ob2: "+ob2);	//Test@4e25154f 
	}

}
