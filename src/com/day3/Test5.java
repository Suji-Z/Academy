package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor;
		String name;
		
		System.out.print("�̸� : "); //Suji
		name = sc.next();
		
		System.out.print("�������� : "); //60
		kor = sc.nextInt();					//��ȯ�� �ڵ����� ����ȯ
		
		String pan;
		
		if(kor >= 90) {
			pan = "��";
		}
		else if (kor >= 80) {
			pan = "��";
		}
		else if (kor >= 70) {
			pan = "��";
		}
		else if (kor >= 60) {
			pan = "��";
		}
		else {
			pan = "��";
		}
		
		//System.out.println(name + "�� ���� ������ " + kor + "���̰� " +
		//"ȯ�� ������ '" + pan + "' �Դϴ�.");
		
		System.out.printf("%s�� ���� ������ %d���̰� ȯ�� ������ {%s] �Դϴ�.", name,kor,pan);
	 //String:%s, float:%f, double:%g, char:%c, int:%d
	}

}
