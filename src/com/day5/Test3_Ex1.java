package com.day5;

import java.util.Scanner;



class Calc {
	
	int y,m,d,nalsu,i,week;
	
	Scanner sc = new Scanner(System.in);

	int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	String daily[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
	
	public void input() {
		
		do {
			System.out.print("���� �Է�: "); //2022
				y = sc.nextInt();
			}while(y<1); //�ȵǴ� ���� �Է�. (y>0) X (y<1) O
			
			do {
				System.out.print("�� �Է�: "); //6
				m = sc.nextInt();
			}while(m<1 || m>12);
		
			
			//���� & 2�� ���� ����� ���� ���� �Է� �ڵ�
			do {
				System.out.print("�� �Է�: "); //30
				d = sc.nextInt();
			}while(d<1 || d>months[m-1]);
	}
	
	public int oper() {
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400;
		
		for(i=0; i<m-1;i++) {
			nalsu += months[i];
		}
		
		nalsu+=d;   
		week = nalsu % 7;
		
		return week;
	}
	
	public void print() {
		
		System.out.println(y+"��"+m+"��"+d+"��"+ daily[week] +"����");
	}
	
}

public class Test3_Ex1 {

	
	public static void main(String[] args) {
		
		Calc ca = new Calc();
		
		ca.input();
		
		int ope = ca.oper();

		ca.print();

	}

}

