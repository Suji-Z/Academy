package com.day3;

import java.util.Scanner;

class Calc2 {
	Scanner sc = new Scanner(System.in);
	int kor , math, eng, total;
	String result = "";
	String name;
	int avg;
	
	public void input() {
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
	}
	
	public void result() {
		
		avg = (kor+math+eng)/3;
		total = (kor+math+eng);
	
		if(kor>=40 && math >= 40 && eng >= 40 && avg>=60 ) {
			result = "�հ�";
			}
		else if(avg>=60 && (kor<40 || math <40 || eng < 40)) { //avg>=60 �� �־ O
			result = "����";
		}
		else if(avg<60) {									  //else�� OK..
			result = "���հ�";
		} 
		
	}
	
	public void print() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + total + ", ��� : " + avg + ", ���� : " + result);
	}
}

public class TestEx6_1 {

	public static void main(String[] args) {
		
		Calc2 ca = new Calc2();
		
		ca.input();
		ca.result();
		ca.print();	
		
	}

}
