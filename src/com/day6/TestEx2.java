package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
//		1~10������ ����. 
//		3�� �ȿ� ������ ���ϸ� ���� ���
		
		Random rd = new Random();
		
		int[] num = new int[1];
		
		int i,n,j;
		
		n = 0;
		int cnt,answer;
	
		while(true) {
			num[n] = rd.nextInt(10)+1; 	// num[0]�� 0���� �����ϱ⶧���� +1
		
			for(i=1; i<4;i++) {
				System.out.print("["+i+"��°] ���� �Է�: ");
				answer = sc.nextInt();
			
			if(answer!=num[n]) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			else if(answer==num[n]) {
				System.out.println("�½��ϴ�.");
				break;
			}
		 }
			System.out.println("������ "+num[n]+"�Դϴ�.");
			
		
			char ch;
			
			System.out.print("��� �ҷ�?[Y/N]");
			ch = (char) System.in.read();
			
			if(ch!='y'&&ch!='Y') {
				System.out.println("���α׷� ����");
				break;
			}
		
		}
	}
		
	}


