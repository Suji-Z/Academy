package com.mission3;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CustomerData cd = new CustomerDataImpl();
		
		System.out.println("���� 10���� �̻� ���Ž� 10% ���� �̺�Ʈ�� �������Դϴ�.");
		System.out.println("���Ǵ� ���� 20,000��  ���Ǵ� ���� 30,000��");
		
		int ch;
		
		while(true) {
			do {
				System.out.println("---------------");
				System.out.print("1.�����ϱ� \n2.���Ÿ�� ��ȸ \n3.�������� �̺�Ʈ"
						+ "\n4.�����ݾ� ��ȸ \n5.�������� ����"
						+ "\n6.ȸ������ ���� \n7.����");
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
				System.out.println("�̿����ּż� �����մϴ�.");
				System.exit(0);
			}

	}

}
}
