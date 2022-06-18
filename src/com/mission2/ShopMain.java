package com.mission2;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CustomerData cd = new CustomerDataImpl();
		int num;
		
		System.out.println("현재 10만원 이상 구매시 10% 할인 이벤트를 진행중입니다.");
		System.out.println("상의는 정가 20,000원  하의는 정가 30,000원");
		
		while(true) {
			do {
				System.out.println("---------------");
				System.out.print("1.구매하기 \n2.구매목록 조회 \n3.나의 구매목록 조회"
						+ "\n4.진행중인 이벤트 \n5.결제금액 조회"
						+ "\n6.고객 이름 오름차순 정렬 \n7.종료");
				System.out.print("\n---------------\n");
				num = sc.nextInt();
			}while(num<1);
			
			switch (num) {
			case 1: cd.input();break;
			case 2: cd.totPrint();break;
			case 3: cd.print();break;
			case 4: cd.sale(); break;
			case 5: cd.pay(); break;
			case 6: cd.ascSortName();break;

			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
		}

	}

}
