package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];		
		int i,j = 0,temp;
		
		System.out.print("5���� ���� �Է�: ");
		
		for(i=0; i<num.length;i++) {
			num[i] = sc.nextInt();	//�迭�� ���� ������ ������� �Է¹޴� �ڵ�
		}
	
		System.out.print("Source Data: ");
		for(i=0; i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		//selection sort
		
		
		for(i=0; i<num.length-1;i++) {		//�ڸ��ٲ� �õ� Ƚ��
			for(j=i+1; j<num.length;j++) {	//
				if(num[i]>num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}		

			}
		}

		System.out.print("Sorted Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();	
	}
	
}