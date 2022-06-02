package com.day3;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
				
		int year = 0;
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		
		String result = "";
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			result = "윤년";
		}
		else {
			result = "평년";
		}
		System.out.print(year + "년은 " + result + "입니다.");
	}

}
