package com.day3;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �� ���� : ");
		
		int num1,num2,num3,num4,temp;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		 }
		if(num3>num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
			}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			}
		System.out.printf("���� ū ���� : %d , ���� ���� ���� : %d",num4,num1);
	}

}
