package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//����޷� 
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y,m,i,week;
		
		do {
			System.out.print("���� �Է�: ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("�� �Է�: ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		

		cal.set(y, m-1, 1);
		y = cal.get(Calendar.YEAR);	 
		m = cal.get(Calendar.MONTH)+1;
		
		week = cal.get(Calendar.DAY_OF_WEEK)-1; //���� ��

		
		System.out.print("       ["+y+"��] ["+m+"��]\n");
		System.out.print("------------------------------");
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");

		for(i=0; i<week; i++) {
			System.out.print("    ");
		}
		
		for(i=1; i<=cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%4d",i);
			week++;
			
			if(week%7==0)
				System.out.println();
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		
		System.out.println("------------------------------");
		}
	}

