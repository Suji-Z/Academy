package com.day6;

import java.util.Random;
import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1~3������ ����.
		//1:����, 2:����, 3:�� n�� String���� ���
		Random rd = new Random();
		
		int[] num = new int[1];
		
		int i,n,hand;
		int com;
	
		
		
		//��ǻ�� ������ ����? 
		n=0;
						
		String[] str = {"����","����","��"};
		

		while(true) {
//		num[n]=1(����), hand=3(��)
		
				System.out.print("1:����, 2:����, 3:�� ? ");	//����ڰ� ���� �Է�
				hand = sc.nextInt();
	
			com = rd.nextInt(3)+1;
			System.out.println("��ǻ��: "+str[com]+" | ���: "+(str[hand-1]));
			
				if(hand==1 && com==3 || hand==2 && com==1 || hand==3 && com==2) {
					System.out.print("����� �̰���ϴ�.");
					break;

				}
				
				else if(hand==com) {
					System.out.println("�����ϴ�.");
					break;
				}
				
				
				else 
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				
			
			}
		}
	//com=3, hand=2+1?


	}

