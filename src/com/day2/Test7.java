package com.day2;

public class Test7 {

	public static void main(String[] args) {
		float f = 0; //0.0
		double d = 0;
		
		//¹Ýº¹¹®
		for(int i=1; i<=10000; i++) {
			f = f + 100000;
			d = d + 100000;
		}
		
		System.out.println("float: " + (f/100000));
		System.out.println("double: " + (d/100000));

	}

}
