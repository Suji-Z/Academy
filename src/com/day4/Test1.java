package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
//		�ݺ���(for,while,do-while)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		
		for(int i = 1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i );
		}
		
		System.out.println("------------------------");
		//�ʱⰪ
		//while(�ִ밪 �� ���ǹ�) {������}
		int j = 1;
		while(j<10) {
			System.out.println(dan + "x" + j + "=" + dan*j );
			j++;
		}
		
		System.out.println("------------------------");
		
		//do{������} while(�ִ밪)
		int k=0;
		do {
			k++;
			System.out.println(dan + "x" + k + "=" + dan*k );
		}while(k<9);
		
		
	}
}