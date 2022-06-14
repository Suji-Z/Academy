package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int y, m, d, w, days;
		String[] week = {"일","월","화","수","목","금","토"};
		
			
		do {
			System.out.print("연도 입력: ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월 입력: ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		do {
			System.out.print("일 입력: ");
			d = sc.nextInt();
		}while(d<1 || d>(cal.getActualMaximum(Calendar.DATE)));
		
		cal.set(y, m-1, d);			
		w = cal.get(Calendar.DAY_OF_WEEK); 
	
		System.out.print("며칠 후? ");
			days = sc.nextInt();
		
		System.out.printf("만난 날: %d년 %d월 %d일 %s요일\n",y,m,d,week[w-1]);
			
		cal.add(Calendar.DATE, days);

		y = cal.get(Calendar.YEAR);	 
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK); 
		
		System.out.printf("%d일 후: %d년 %d월 %d일 %s요일\n",days,y,m,d,week[w-1]);
	}

}
