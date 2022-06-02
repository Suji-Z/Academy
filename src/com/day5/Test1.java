package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//배열
		
		//int[] num = new int[5]; 자료형[] 변수 or 자료형 변수[] 상관없음 
		int num[] = new int[5]; 
		Scanner sc = new Scanner(System.in);

		System.out.print(num.length + "개의 정수?"); //4 6 8 7 2
		
		for(int i =0; i<num.length; i++) {
		   num[i] = sc.nextInt();
		}
		
		System.out.println("배열의 갯수: " + num.length +"개");

		//num[5]의 경우, 범위값을 넘었기 때문에 에러
		
		for(int i =0; i<num.length; i++) { // '<='는 X,갯수가 5개일때 index는 (length-1) 이기때문
		//**배열 length에는 () 안붙음
		
		System.out.println("num[" + i + "]: " + num[i]);
//		System.out.println("num[1] : " + num[1]);
//		System.out.println("num[2] : " + num[2]);
//		System.out.println("num[3] : " + num[3]);
//		System.out.println("num[4] : " + num[4]);
		}
		num[3] = 400;
		System.out.println("num[3] : " + num[3]);
		
		int su = num[1];
		System.out.println(su + ":" + num[1]);
		
		num[4] = num[0] + num[1];
		System.out.println("num[4]: " + num[4]);
	}

}
