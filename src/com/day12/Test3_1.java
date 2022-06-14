package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int y, m, d, w, days;
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
			
		do {
			System.out.print("���� �Է�: ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("�� �Է�: ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		do {
			System.out.print("�� �Է�: ");
			d = sc.nextInt();
		}while(d<1 || d>(cal.getActualMaximum(Calendar.DATE)));
		
		cal.set(y, m-1, d);			
		w = cal.get(Calendar.DAY_OF_WEEK); 
	
		System.out.print("��ĥ ��? ");
			days = sc.nextInt();
		
		System.out.printf("���� ��: %d�� %d�� %d�� %s����\n",y,m,d,week[w-1]);
			
		cal.add(Calendar.DATE, days);

		y = cal.get(Calendar.YEAR);	 
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK); 
		
		System.out.printf("%d�� ��: %d�� %d�� %d�� %s����\n",days,y,m,d,week[w-1]);
	}

}
