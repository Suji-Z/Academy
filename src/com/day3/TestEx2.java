package com.day3;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		
		int x;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		if(a<b) {
			x = a;
			a = b;
			b = x;
		}
		
		System.out.printf("ū ���� : %d , ���� ���� : %d" ,a,b);
	}

}
