package com.day5;

import java.util.Scanner;

import javax.print.StreamPrintService;

public class Test2 {

	public static void main(String[] args) {
		//�迭�� ����޷� �����
		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		int y,m,nalsu,i,week;
		
		do {
		System.out.print("���� �Է�: "); //2022
			y = sc.nextInt();
		}while(y<1); //�ȵǴ� ���� �Է�. (y>0) X (y<1) O
		
		do {
			System.out.print("�� �Է�: "); //6
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		//����ڰ� �Է��� y�� �������� Ȯ��
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//1�� 1�� 1�� ���� (y-1)�� 12�� 31�� ������ ����
		
		nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400; //&& = - , || = +
		
//		int yy = (y-1)/4-(y-1)/100+(y-1)/400;
//		System.out.println(nalsu);
//		System.out.println(yy);

		//(m-1)�� ������ ����
		//��	:   1  2  3  4  5  6  7  8  9 10 11 12
		//months: {31,28,31,30,31,30,31,31,30,31,30,31}
		//index :   0  1  2  3  4  5  6  7  8  9 10 11
		
		// m=5���ϰ��, index�� 4. 
		for(i=0; i<m-1;i++) {
			nalsu += months[i];
		}
		
//		System.out.println(nalsu);
		
//		m�� 1���� ����
		nalsu+=1; 
		week = nalsu % 7;
		
		//-----------------------������------------------------
		
		
//		System.out.println(week); week���� 3�϶� �������� 1��
		System.out.print("       ["+y+"��] ["+m+"��]");
		
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
//		Ư�� ���Ϻ��� �����ϵ��� ���� ����
		for(i=0; i<week; i++) {
			System.out.print("    "); //���� ��ĭ
		}

		//�ش� ���� ��¥ ���
		for(i=1; i<=months[m-1];i++) {
			System.out.printf("%4d",i);
			week++; //(ex; 6/1�� ��� week=3, 3+1)
			
			if(week%7==0)
				System.out.println();
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		
		System.out.println("------------------------------");

	}

}
