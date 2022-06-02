package com.day3;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 정렬 : ");
		
		int x;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		if(a<b) {
			x = a;
			a = b;
			b = x;
		}
		
		System.out.printf("큰 숫자 : %d , 작은 숫자 : %d" ,a,b);
	}

}
