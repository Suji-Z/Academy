package com.day5;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int i;

		System.out.print("5개의 정수 입력: ");
		
		for(i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		int max=num[0]; //'0'을 넣으면 안됨.배열 가장 앞의 숫자가 가장 큰숫자,작은숫자가 되도록 초기화.
		int min=num[0]; 
		
		for(i=0; i<num.length;i++) {		//자리바꿈 시도 횟수
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		
		System.out.printf("가장 큰 수: %d, 가장 작은 수: %d",max,min);
		
	
		
//		System.out.printf("가장 큰 수: %d, 가장 작은 수: %d",max,min);
		
	}

}
