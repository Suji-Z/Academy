package com.birth2;

import java.util.Scanner;

public class BirthMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BirthData ob = new BirthData();
		
		int ch;
		
		while(true) {
		
			do {
				System.out.println("*** ���� ***");
				System.out.print("1.�Է� 2.��� 3.���� 4.����");
				System.out.print(": ");
				ch = sc.nextInt();
				
			}while(ch<1 || ch>4);

			switch (ch) {
			case 1: ob.input();	break;
			case 2: ob.print(); break;
			case 3: ob.save(); break;
			default: ob.save(); System.exit(0);
		
			}
	
		
		}
		

	}

}
