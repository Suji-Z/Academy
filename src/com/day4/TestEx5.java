package com.day4;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j,max;
		int sum=0;

		System.out.print("�� ���� �Է��ϼ���: ");
		i = sc.nextInt();
		j = sc.nextInt();

			 if(i>j) {
				 max = i;
				 i = j;
				 j = max;
			 }
			 
		for(int k = i; k<=j; k++) {
			sum+=k;
		}
			 
		System.out.print("�� : " + sum);
	}
}
