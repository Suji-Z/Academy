package com.day11;

//Wrapper Ŭ����
//�⺻ �ڷ����� ��ü�� ����� �� �ְ� ���ش�.

//�ڷ���: boolean, byte, char, short, int, long, float, double

//reference(class) �ڷ���
//Boolean, Byte, Character, Short, Integer, Float, Double

//Auto-Boxing : (stack -> heap)
//Auto-UnBoxing : (heap -> stack)


public class Test7 {

	public static void main(String[] args) {
		
		int a = 24;
		
		System.out.println(a + 10);
		System.out.println(Integer.toString(a)+10); //���� 10�� ����10�� ���ϸ�, ���ڵ� ���ڷ� �ν��Ͽ� �ٿ��� ���
		System.out.println(Integer.toString(a,2));	//2������ ���
		System.out.println(Integer.toString(a,16));	//16������ ����
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1; // Auto-Boxing
		n2 = num2;
		
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);
		
		
	}

}

/*
 	int a = 10;
	float b;
		
	b = a;			 --O > �Ͻ��� ����ȯ(10.0)
	b = (float)a;	 --O > ����� ����ȯ
	
	a = b;			 --X > ���� (float�� ������ �� ũ�⶧��)
	a = (int)b;		 --O > ����� ����ȯ�� ����
	
----------------------------------------------------------
B(�θ�) - A(�ڽ�) Ŭ����

B = A;  	--> O UPCAST (�ڽ� -> �θ�)
B = (B)A;	--> O ����� UPCAST

�����ſ��� ū �ɷ� ���°� �Ͻ������ε� ����

A = B;		--> X
A = (A)B;   --> O  ����� DOWNCAST (�θ� -> �ڽ�)
	
*/

