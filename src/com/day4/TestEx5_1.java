package com.day4;

import java.util.Scanner;

class calc{
	int i, j, max, cnt;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���: ");
		i = sc.nextInt();
		j = sc.nextInt();
	}
	
	public int sum() {
		 if(i>j) {
			 max = i;
			 i = j;
			 j = max;
		 }
		 
		 for(int k = i; k<=j; k++) {
			 cnt+=k;
		 }
	
		 return cnt;
		
		}
	
	public void print(int result) {
		System.out.print("�� : " + cnt);
	}
}


public class TestEx5_1 {

	public static void main(String[] args) {
		
		calc ca = new calc();
		
		ca.input();
		int sum = ca.sum();
			
		ca.print(sum);
	}
}
