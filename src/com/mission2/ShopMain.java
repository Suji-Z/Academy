package com.mission2;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CustomerData cd = new CustomerDataImpl();
		int num;
		
		System.out.println("���� 10���� �̻� ���Ž� 10% ���� �̺�Ʈ�� �������Դϴ�.");
		System.out.println("���Ǵ� ���� 20,000��  ���Ǵ� ���� 30,000��");
		
		while(true) {
			do {
				System.out.println("---------------");
				System.out.print("1.�����ϱ� \n2.���Ÿ�� ��ȸ \n3.���� ���Ÿ�� ��ȸ"
						+ "\n4.�������� �̺�Ʈ \n5.�����ݾ� ��ȸ"
						+ "\n6.�� �̸� �������� ���� \n7.����");
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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			}
		}

	}

}
