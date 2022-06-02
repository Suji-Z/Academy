package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2;
		
		System.out.print("첫번째 수?"); 
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수?");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d + %d = %d\t", num1,num2,num1+num2); //\n,\t : 정규화 표현식
		System.out.printf("%d - %d = %d\n", num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\t", num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\n", num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d\t", num1,num2,num1%num2);
		
//		부등호; > , < , >= , <= , ==
//		숫자를 부등호로 비교하면 true or false 문자가 생성된다 (boolean)
		System.out.println("num1>num2 : " + (num1>num2)); //이럴 경우 식을 ()안에 넣어야 오류X

	}

}
