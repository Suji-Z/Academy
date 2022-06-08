package com.score1;

import java.util.Scanner;

public class Score {
	Scanner sc = new Scanner(System.in);
	int inwon; 
	
	Record[] rec; 	// record�� �� 7���� data�� ��
					// �迭 �ȿ� Ŭ������ ���� �� ����
	
	public void set() {
		
		do {
			System.out.print("�ο���: "); //3
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);
		 
		rec = new Record[inwon]; 
		
	}
	
	public void input() {
		
		String[] title = {"����: ", "����: ", "����: "};
		
		for(int i=0; i<inwon; i++) {
			
			rec[i] = new Record(); 	//Record�� ��ġ? ȣ��
		
			System.out.print("�̸�: "); //suji
			rec[i].name = sc.next();
		
			
			for(int j=0; j<3; j++) {
				
				System.out.print(title[j]); //30 //title��
				rec[i].score[j] = sc.nextInt();
				
					
				rec[i].tot += rec[i].score[j];
			}
				
				rec[i].avg = rec[i].tot/3;
			
		}
		
	}
	
	private void ranking() {	//���� ����..����������.
		
		int i,j;
		
		//rank �ʱ�ȭ
		for(i=0; i<inwon; i++) {
			
			rec[i].rank = 1; 	//�ʱ�ȭ
		}
		
		for (i=0; i<inwon-1; i++) {
			for(j=i+1; j<inwon; j++) {
				if(rec[i].tot> rec[j].tot)
					rec[j].rank++;
				
				else if (rec[i].tot<rec[j].tot)
					rec[i].rank++;
				
			}
		}
		
	}
	
	
	public void print() {
		
		ranking(); //�޼ҵ忡�� �޼ҵ带 ȣ���� �� ���� **
		
		for(int i=0; i<inwon; i++) {
			
			System.out.printf("%6s", rec[i].name);
			
			for(int j=0; j<3; j++) {
				System.out.printf("%4d", rec[i].score[j]);
			}
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].avg);
			System.out.printf("%4d", rec[i].rank);
			System.out.println();
		}
		
		
	}
	
	
	
	
	
}
