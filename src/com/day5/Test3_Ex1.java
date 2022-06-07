package com.day5;

import java.util.Scanner;



class Calc {
	
	int y,m,d,nalsu,i,week;
	
	Scanner sc = new Scanner(System.in);

	int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	String daily[] = {"일", "월", "화", "수", "목", "금", "토"};
	
	public void input() {
		
		do {
			System.out.print("연도 입력: "); //2022
				y = sc.nextInt();
			}while(y<1); //안되는 값을 입력. (y>0) X (y<1) O
			
			do {
				System.out.print("월 입력: "); //6
				m = sc.nextInt();
			}while(m<1 || m>12);
		
			
			//윤년 & 2월 말일 계산을 위한 일자 입력 코드
			do {
				System.out.print("일 입력: "); //30
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
		
		System.out.println(y+"년"+m+"월"+d+"일"+ daily[week] +"요일");
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

