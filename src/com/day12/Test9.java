package com.day12;

class TestA{
	
	public void print() {
		System.out.println("TestA Ŭ����");
	}
}

class TestB extends TestA{
	
	public void print() {
		System.out.println("TestB Ŭ����");
	}
}



public class Test9 {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b;
		
//		b = a;	//������ Ÿ���� �ٸ���, �����ִ� Ŭ������ ��Ӱ��赵 �ƴϱ⶧���� �ƿ� ���� �Ұ�
		
		//TestB�� TestA�� ��ӹ��� ��� ����
		b = (TestB)a;
	}

}
