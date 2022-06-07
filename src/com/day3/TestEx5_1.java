package com.day3;

import java.util.Scanner;

class Calc{
	Scanner sc = new Scanner(System.in);
	
	int price = 15800;
	int count;
	double total=0;
	
	public void input() {
		
		System.out.print("구입수량 : ");
		count = sc.nextInt();
	}
	
	public double oper() {
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
		
		return total;
	}
	
	public void print() {
		System.out.println("결제 금액 : " + total + "원");
	}
}

public class TestEx5_1 {

	public static void main(String[] args) {
		
		Calc ca = new Calc();
		
		ca.input();
		
		double total = ca.oper();
	
		ca.print();
		
	}

}
