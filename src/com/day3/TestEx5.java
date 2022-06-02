package com.day3;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		//i 단가는 15800원 (고정),  i>일정수량 시 할인(disc), >=10 은  j=i가격*0.1%

		Scanner sc = new Scanner(System.in);
		System.out.print("구입수량 : ");
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
		System.out.println("결제 금액 : " + total + "원");
	}

}
