package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		//3���� ���� �Է¹޾� ���� ������ ū �� ������ ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� : "); //10 7 2
		
		int num1,num2,num3, temp;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		 // ���� 5 3 1 -> 5/5/3/1 -> 5/3/3/1 -> 
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
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			}

		System.out.printf("���� ��� : %d %d %d",num1,num2,num3);
	
	
	}

}