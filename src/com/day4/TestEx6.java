package com.day4;

public class TestEx6 {

	public static void main(String[] args) {
		int dan;
	
		for(int i=1; i<=9; i++) {
			for(dan=2; dan<=5; dan++) {
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(dan=6; dan<=9; dan++) {
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}
	}
}
