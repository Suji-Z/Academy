package com.day9;

import java.util.Scanner;

//������
//1.�޸��Ҵ�(��ü����)
//2.���� �ʱ�ȭ				*���������� (DI)
//Ŭ���� �̸��� ����
//���ϰ��� ���⶧���� property�� ����
//�ߺ� ���� ����
//�����ڿ��� �ٸ� �����ڸ� ȣ�� �� �� �ִ�.
//��, �� ���ο��� �ѹ��� ȣ�� �����ϴ�.

public class Test2 {
	
	private int x;
	
	public Test2() {	//default ������ (�⺻������)
		
//		this(30); //�����ε� �����ڸ� �θ����, ���� Ŭ�����̸��� �����ϱ⶧���� �浹.
//		this�� ȣ���� �� �Ű����� �Է��ϸ� ����
//		�����ڴ� 1���� ȣ�� ����
		
//		System.out.println("�⺻������");
//		x = 10;
//		System.out.println("x: "+x);
	}
	
	public Test2(int x)	{	//������ �ߺ�����
		
//		System.out.println("�����ε��� ������");
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
		Test2 ob4 = new Test2(60);	//�Ű����� �ȿ� class�� �������� ����
		
//		Scanner sc = new Scanner(source)	//scanner�� �⺻�����ڸ� �����س��� ������, ctrl+space�� �⺻������ �ȳ�Ÿ��.
												//ex.Scanner() <�� ��ȣ
		
	}

}
