package com.day5;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int i;

		System.out.print("5���� ���� �Է�: ");
		
		for(i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		int max=num[0]; //'0'�� ������ �ȵ�.�迭 ���� ���� ���ڰ� ���� ū����,�������ڰ� �ǵ��� �ʱ�ȭ.
		int min=num[0]; 
		
		for(i=0; i<num.length;i++) {		//�ڸ��ٲ� �õ� Ƚ��
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		
		System.out.printf("���� ū ��: %d, ���� ���� ��: %d",max,min);
		
	
		
//		System.out.printf("���� ū ��: %d, ���� ���� ��: %d",max,min);
		
	}

}
