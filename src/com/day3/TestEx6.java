package com.day3;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		
		int kor , math, eng, total;
		String result = "";
		
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
		int avg = (kor+math+eng)/3;
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
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + total + ", ��� : " + avg + ", ���� : " + result);

	}

}
