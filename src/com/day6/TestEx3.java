package com.day6;

import java.util.Random;
import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1~3������ ����.
		//1:����, 2:����, 3:�� n�� String���� ���
		Random rd = new Random();
		
		int i,n,hand;
		int com;
	
	
		//��ǻ�� ������ ����? 
		n=0;
						
		String[] str = {"����","����","��"};
		
//		num[n]=1(����), hand=3(��)
		com = rd.nextInt(3)+1;
		
		do {
		System.out.print("1:����, 2:����, 3:�� ? ");	//����ڰ� ���� �Է�
		hand = sc.nextInt();
		}while(hand<1||hand>3);
		
			System.out.println("��ǻ��: "+str[com-1]+" | ���: "+(str[hand-1]));
			
			//String result="";
			//result = "���º� �Դϴ�.";
			
				if(hand==1 && com==3 || hand==2 && com==1 || hand==3 && com==2) {
					System.out.print("����� �̰���ϴ�.");
					
//				if((user==1&&com==3) || (user>com && !(com==1 && suer==3)))
//					result = "����� �̰���ϴ�.";
					
//			or ���������� ���а���
//				if((user+2)%3==com) , ��� ���ÿ� ���� com ���� +1�� �����ؾ���. user�� ��¹��� ������ -1�� ������
				
//					result = "����� �̰���ϴ�.";

				}
				
				else if(hand==com) {
					System.out.println("�����ϴ�.");
					
//					if((com==1&&user==3) || (com>user && !(user==1 && com==3)))
//					result = "��ǻ�Ͱ� �̰���ϴ�.";
					
				}
				
				
				else 
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				
		}

	}

