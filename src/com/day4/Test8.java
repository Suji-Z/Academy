package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("ù��° ��: ");
		num1 = sc.nextInt();
		
		System.out.print("�ι�° �� :");
		num2 = sc.nextInt();
		
		System.out.print("������[+,-,*,/] : ");
		oper = (char)System.in.read(); 		//oper�� next X, �� �ڵ�� �ҷ���
		
		
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
			System.out.println("�ٽ� �Է����ּ���");
			break;
		}
		
	}

}
