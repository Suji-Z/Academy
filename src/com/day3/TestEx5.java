package com.day3;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		//i �ܰ��� 15800�� (����),  i>�������� �� ����(disc), >=10 ��  j=i����*0.1%

		Scanner sc = new Scanner(System.in);
		System.out.print("���Լ��� : ");
		int price = 15800;
		int count;
		double total=0;
		
		count = sc.nextInt();
	
		if(count<10) {
			total = price*count;
		}
		if(count>=10) {
			total = price*count*0.9;
		}
		if(count>=20) {
			total = price*count*0.85;
		}
		if(count>=30){
			total = price*count*0.8;
		}
		System.out.println("���� �ݾ� : " + total + "��");
	}

}
