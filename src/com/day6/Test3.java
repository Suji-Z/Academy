package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//10�� �̳��� �̸��� ������ �Է� �޾� 
		//���� ���ϱ� ���� rank,  rank�� i+1 �ʱ�ȭ
		//score�� �����ʿ� rank++
		
		Scanner sc = new Scanner(System.in);
		
		String name[];
		int[] score;
		int inwon;
		
		do {
			System.out.print("�ο� ��(1~10): ");//3
			inwon = sc.nextInt();
		}while(inwon>10||inwon<1);
		
		//�迭�� �޸� �Ҵ� (�迭 ��ü����)
		//�ε��� �ִ�ġ�� ��Ȯ���� ���� ���, �ε������� ���� ��������
		name = new String[inwon];
		score = new int[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.print((i+1)+"��° �̸�: ");
			name[i] = sc.next();
		
			System.out.print("����: ");
			score[i] = sc.nextInt();
		}
		
		int rank[] = new int[inwon];
		//���� rank �ʱ�ȭ
		for(int i=0; i<inwon; i++) {
			rank[i] = 1;
		
		}
		int temp1=0;
		String temp2;

		//Selection Sort(����) ��������
		
		for(int i=0; i<inwon-1; i++) {		//���� �ϴ� �ϱ�
			for(int j=i+1; j<inwon;j++) {	
				if(score[i]<score[j]){
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
			
			}
		}
			
			
			for(i=0; i<inwon-1; i++) {		//���� �ϴ� �ϱ�
				for(int j=i+1; j<inwon;j++) {	
					
					if(score[i]>score[j])
						rank[j]++;
					else if(score[i]<score[j])
						rank[i]++;
				}
			}
		//Ȯ�� for���� �Ѱ��� �迭������ ������ �� ����. �ΰ��̻��� �Ϲ� for��
		for(i = 0; i<inwon; i++) {
			System.out.printf("%6s %4d %4d\n",name[i],score[i],rank[i]);	//�ѱ��� 2bytes�� �̹Ƿ� �� �� �̸��� %6s
		}

		}
	}
}
		
	


