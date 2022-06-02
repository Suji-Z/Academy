package com.day3;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		i = sc.nextInt();
		
		if(i%2==0) {
			System.out.print("Â¦¼ö");
		}
		else if(i%2!=0) {
			System.out.println("È¦¼ö");
		}

	}

}
