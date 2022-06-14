package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//만년달력 
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y,m,i,week;
		
		do {
			System.out.print("연도 입력: ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월 입력: ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		

		cal.set(y, m-1, 1);
		y = cal.get(Calendar.YEAR);	 
		m = cal.get(Calendar.MONTH)+1;
		
		week = cal.get(Calendar.DAY_OF_WEEK)-1; //주의 수

		
		System.out.print("       ["+y+"년] ["+m+"월]\n");
		System.out.print("------------------------------");
		System.out.println("\n  일  월  화  수  목  금  토");
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

