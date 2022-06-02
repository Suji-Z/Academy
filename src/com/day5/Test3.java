package com.day5;

import java.util.Scanner;

public class Test3 {

	
	public static void main(String[] args) {
		
		//년(y), 월(m), 일(d) 입력
		//2022년 6월   2일 목요일 출력.. "요일"
		
		Scanner sc = new Scanner(System.in);
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String daily[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		
		int y,m,d,nalsu,i,week;

		
		do {
		System.out.print("연도 입력: "); //2022
			y = sc.nextInt();
		}while(y<1); //안되는 값을 입력. (y>0) X (y<1) O
		
		do {
			System.out.print("월 입력: "); //6
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//윤년 & 2월 말일 계산을 위한 일자 입력 코드
		do {
			System.out.print("일 입력: "); //30
			d = sc.nextInt();
		}while(d<1 || d>months[m-1]);

		nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400; //&& = - , || = +

		//index 0 은 31일. i=m-1. --> 각 월당 말일 체크
		for(i=0; i<m-1;i++) {
			nalsu += months[i];
		}
		
//		index 0 1 2 3 4 5 6  6월 3일 -> 
//		     일월화수목금토일
	
		
//		System.out.println(nalsu);
		
//		m월 1일의 날수
		//여기까지 날수는 입력한 달 직전 달 까지의 총 날수만. 추가로 확인이 필요한 일수만큼 더 더해야함
		nalsu+=d;   
		week = nalsu % 7;

		//week 0=일 week 1=월, week 2=화
		
		
		System.out.println(y+"년"+m+"월"+d+"일"+ daily[week] +"요일");

	}

}

