package com.day5;

import java.util.Scanner;

import javax.print.StreamPrintService;

public class Test2 {

	public static void main(String[] args) {
		//배열로 만년달력 만들기
		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		int y,m,nalsu,i,week;
		
		do {
		System.out.print("연도 입력: "); //2022
			y = sc.nextInt();
		}while(y<1); //안되는 값을 입력. (y>0) X (y<1) O
		
		do {
			System.out.print("월 입력: "); //6
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		//사용자가 입력한 y가 윤년인지 확인
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//1년 1월 1일 부터 (y-1)년 12월 31일 까지의 날수
		
		nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400; //&& = - , || = +
		
//		int yy = (y-1)/4-(y-1)/100+(y-1)/400;
//		System.out.println(nalsu);
//		System.out.println(yy);

		//(m-1)월 까지의 날수
		//월	:   1  2  3  4  5  6  7  8  9 10 11 12
		//months: {31,28,31,30,31,30,31,31,30,31,30,31}
		//index :   0  1  2  3  4  5  6  7  8  9 10 11
		
		// m=5월일경우, index는 4. 
		for(i=0; i<m-1;i++) {
			nalsu += months[i];
		}
		
//		System.out.println(nalsu);
		
//		m월 1일의 날수
		nalsu+=1; 
		week = nalsu % 7;
		
		//-----------------------디자인------------------------
		
		
//		System.out.println(week); week값이 3일때 수요일이 1일
		System.out.print("       ["+y+"년] ["+m+"월]");
		
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
//		특정 요일부터 시작하도록 공백 지정
		for(i=0; i<week; i++) {
			System.out.print("    "); //공백 네칸
		}

		//해당 월의 날짜 출력
		for(i=1; i<=months[m-1];i++) {
			System.out.printf("%4d",i);
			week++; //(ex; 6/1의 경우 week=3, 3+1)
			
			if(week%7==0)
				System.out.println();
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		
		System.out.println("------------------------------");

	}

}
