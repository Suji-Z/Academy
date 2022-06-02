package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("첫번째 수: ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 수 :");
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/] : ");
		oper = (char)System.in.read(); 		//oper는 next X, 이 코드로 불러냄
		
		
		switch(oper) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
			
		case '/':
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			break;
			
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		
	}

}
