package com.day5;

import java.util.Scanner;

public class Test3 {

	
	public static void main(String[] args) {
		
		//��(y), ��(m), ��(d) �Է�
		//2022�� 6��   2�� ����� ���.. "����"
		
		Scanner sc = new Scanner(System.in);
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String daily[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		
		int y,m,d,nalsu,i,week;

		
		do {
		System.out.print("���� �Է�: "); //2022
			y = sc.nextInt();
		}while(y<1); //�ȵǴ� ���� �Է�. (y>0) X (y<1) O
		
		do {
			System.out.print("�� �Է�: "); //6
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//���� & 2�� ���� ����� ���� ���� �Է� �ڵ�
		do {
			System.out.print("�� �Է�: "); //30
			d = sc.nextInt();
		}while(d<1 || d>months[m-1]);

		nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400; //&& = - , || = +

		//index 0 �� 31��. i=m-1. --> �� ���� ���� üũ
		for(i=0; i<m-1;i++) {
			nalsu += months[i];
		}
		
//		index 0 1 2 3 4 5 6  6�� 3�� -> 
//		     �Ͽ�ȭ���������
	
		
//		System.out.println(nalsu);
		
//		m�� 1���� ����
		//������� ������ �Է��� �� ���� �� ������ �� ������. �߰��� Ȯ���� �ʿ��� �ϼ���ŭ �� ���ؾ���
		nalsu+=d;   
		week = nalsu % 7;

		//week 0=�� week 1=��, week 2=ȭ
		
		
		System.out.println(y+"��"+m+"��"+d+"��"+ daily[week] +"����");

	}

}

