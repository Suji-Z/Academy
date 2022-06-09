package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc{
	
	private int num1, num2;
	private char oper;
	
	public boolean input() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 수: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("연산자: ");		//+ - * /
		oper = (char)System.in.read();
		
		//연산자 확인
		
		if(oper!='+'&&oper!='-'&&oper!='*'&&oper!='/'){
			return false;
		}
		
		return true;
	}
	
	public int result() {
		
		int sum=0;
		
		switch(oper) {
		
		case '+': sum=num1+num2; break;
		case '-': sum=num1-num2; break;
		case '*': sum=num1*num2; break;
		case '/': sum=num1/num2; break;
		
		
		}
		
		return sum;
		
	}
	
	public void print(int r) {
		
		System.out.printf("%d %c %d = %d\n", num1,oper,num2,r);
	}
}


public class Test5 {

	public static void main(String[] args) throws IOException {
		
		Calc ob = new Calc();
		
//		boolean flag = ob.input();	//T or F
//		boolean은 무조건 if문으로 검증
		
		if(!ob.input()) {	//method의 T/F값을 받는 if문 안에는 조건문 앞에 '!' 붙여 결과값을 반대로 도출하도록!
			
			System.out.println("연산자 오류!");
			
			return;	 //아래 오류 상황을 따로 정의하지않고, True일때 되돌아가도록 return.
			
		}
		//긍정적인 부분을 밖으로 빼고, 예외할 부분을 if문 안에 넣어서 if문 사용을 간결하게.
		
		int r = ob.result();
		ob.print(r);
		
		
		
//		else if(flag==false) {
//			
//		}
		
		
		
	}

}
