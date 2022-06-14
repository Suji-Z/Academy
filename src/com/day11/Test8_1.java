package com.day11;

import java.util.Scanner;

class Sum1 {
	
	protected int num1, num2, result;
	protected String oper;
	
	public void write() {
		
		System.out.printf("%d %s %d = %d", num1,oper,num2,result);
	}
}

class Calc1 extends Sum1 {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: " );
		
		String str = sc.next();
		
		String input[];
		
		System.out.println("연산자: ");
		oper = sc.next();
		
	}
	
	public void calc() {
		
		if(oper.equals("+"))
			result = num1 + num2;
		else if(oper.equals("-"))
			result = num1 - num2;
		else if(oper.equals("*"))
			result = num1 * num2;
		else if(oper.equals("/"))
			result = num1 / num2;
	}
}

public class Test8_1 {

	public static void main(String[] args) {

	}

}
