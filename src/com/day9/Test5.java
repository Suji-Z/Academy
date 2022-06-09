package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc{
	
	private int num1, num2;
	private char oper;
	
	public boolean input() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ΰ��� ��: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("������: ");		//+ - * /
		oper = (char)System.in.read();
		
		//������ Ȯ��
		
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
//		boolean�� ������ if������ ����
		
		if(!ob.input()) {	//method�� T/F���� �޴� if�� �ȿ��� ���ǹ� �տ� '!' �ٿ� ������� �ݴ�� �����ϵ���!
			
			System.out.println("������ ����!");
			
			return;	 //�Ʒ� ���� ��Ȳ�� ���� ���������ʰ�, True�϶� �ǵ��ư����� return.
			
		}
		//�������� �κ��� ������ ����, ������ �κ��� if�� �ȿ� �־ if�� ����� �����ϰ�.
		
		int r = ob.result();
		ob.print(r);
		
		
		
//		else if(flag==false) {
//			
//		}
		
		
		
	}

}
