package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
//		반복문(for,while,do-while)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		
		for(int i = 1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i );
		}
		
		System.out.println("------------------------");
		//초기값
		//while(최대값 즉 조건문) {증가값}
		int j = 1;
		while(j<10) {
			System.out.println(dan + "x" + j + "=" + dan*j );
			j++;
		}
		
		System.out.println("------------------------");
		
		//do{증가값} while(최대값)
		int k=0;
		do {
			k++;
			System.out.println(dan + "x" + k + "=" + dan*k );
		}while(k<9);
		
		
	}
}