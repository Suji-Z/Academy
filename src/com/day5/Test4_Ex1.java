package com.day5;

import java.util.Scanner;

class Calc2 {
	Scanner sc = new Scanner(System.in);
	
	int num[] = new int[5];		
	int i,j = 0,temp;
	
	public void input() {
		System.out.print("5���� ���� �Է�: ");
		
		for(i=0; i<num.length;i++) {
			num[i] = sc.nextInt();	//�迭�� ���� ������ ������� �Է¹޴� �ڵ�
		}
		
	}
		
	public void print1() {
		
		System.out.print("Source Data: ");
		for(i=0; i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
			}
	
	public int oper() {
		
		for(i=0; i<num.length-1;i++) {		//�ڸ��ٲ� �õ� Ƚ��
			for(j=i+1; j<num.length;j++) {	//
				if(num[i]>num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}		

			}
		
	}
		
		return num[i];
	
}
	public void print2() {
		System.out.print("Sorted Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
	}
	
		
	}

	
public class Test4_Ex1 {

	public static void main(String[] args) {
		
		Calc2 ca = new Calc2();
		
		ca.input();
		ca.print1();
		
		int oper = ca.oper();
		
		ca.print2();
		
	
		

	}
	
}
