package com.day3;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
				
		int year = 0;
		System.out.print("���� �Է� : ");
		year = sc.nextInt();
		
		String result = "";
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			result = "����";
		}
		else {
			result = "���";
		}
		System.out.print(year + "���� " + result + "�Դϴ�.");
	}

}
