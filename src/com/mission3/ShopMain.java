package com.mission3;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CustomerData cd = new CustomerDataImpl();
		
		System.out.println("현재 10만원 이상 구매시 10% 할인 이벤트를 진행중입니다.");
		System.out.println("상의는 정가 20,000원  하의는 정가 30,000원");
		
		int ch;
		
		while(true) {
			do {
				System.out.println("---------------");
				System.out.print("1.구매하기 \n2.구매목록 조회 \n3.진행중인 이벤트"
						+ "\n4.결제금액 조회 \n5.구매정보 수정"
						+ "\n6.회원정보 삭제 \n7.종료");
				System.out.print("\n---------------\n");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
			
			case 1: cd.input(); break;
			case 2: cd.totPrint(); break;
			case 3: cd.sale(); break;
			case 4: cd.pay(); break;
			case 5: cd.update(); break;
			case 6: cd.delete(); break;
			default:
				System.out.println("이용해주셔서 감사합니다.");
				System.exit(0);
			}

	}

}
}
