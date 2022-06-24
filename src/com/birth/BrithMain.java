package com.birth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BrithMain {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		BirthData ob = new BirthData();
		
		int ch;


			while(true) {
				
				do {
					System.out.print("1.입력 2.출력 3.종료");
					System.out.print(": ");
					ch = sc.nextInt();
					
				}while(ch<1);
				
				switch(ch) {
				
					case 1: ob.input(); break;
					case 2: ob.print(); break;
				
					default:
						ob.save();
						System.exit(0);
				}

		}
		
		
	}

}
