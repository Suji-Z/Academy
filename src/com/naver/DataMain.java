package com.naver;

import java.util.Scanner;

public class DataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		DataImpl di = new DataImpl();
		int num;

		while(true) {
			do {
				System.out.println("---------------");
				System.out.print("1.회원가입 \n2.회원정보 조회 \n3.회원정보 삭제"
					+ "\n4.회원정보 정렬 \n5.내 계정 정보조회 \n6.뒤로가기");
				System.out.print("\n---------------\n");
				
				num = sc.nextInt();
			
			}while(num<1);
			
			
			switch (num) {
			case 1: di.joinID();break;
			case 2: di.print();break;
			case 3: di.delete();break;
			case 4: di.ascSortName();break;
			case 5: di.searchID();break;
			
			default:
				System.exit(0);
				break;
			}
		}

	}
}
