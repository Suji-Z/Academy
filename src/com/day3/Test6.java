package com.day3;

import java.util.Scanner;

//Scanner : �ܶ������� ������ ����� ����
//�⺻ �ܶ��� ����

public class Test6 {

	public static void main(String[] args) {
		        //sc : Suji,50,70,80
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;
		
		//System.out.print("�̸� ���� ���� ����?"); //Suji 50 70 80
		System.out.print("�̸�,����,����,����?"); //Suji,50,70,80 �����ڰ� ','�� ��
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 
		// '\\s*' : API�� ����. 
		
		name = sc.next(); //������ ������ ����
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + ":" + (kor+eng+mat) + "��");
		
	}

}
