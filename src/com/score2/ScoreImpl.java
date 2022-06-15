package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {
	
	private int inwon;
	private Record[] rec;	//���� 7�� hak, name , ����
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void set() {
		do {
			System.out.print("�ο���: ");
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);
		 
		rec = new Record[inwon]; 	
	}

	@Override
	public void input() {
		//ave, tot
		
		for(int i=0; i<inwon; i++) {
			
			rec[i] = new Record();
			
			System.out.print("�й�: ");
			rec[i].hak = sc.next();
			
			System.out.print("�̸�: ");
			rec[i].name = sc.next();
			
			System.out.print("����: ");
			rec[i].kor = sc.nextInt();
			
			System.out.print("����: ");
			rec[i].eng = sc.nextInt();
			
			System.out.print("����: ");
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].ave = rec[i].tot/inwon;

			
		}
		
		
	}
	
	private String panjung(int score) {
		
		//����
		
		String result = "";
		
		String grade[] = {"��","��","��","��","��"};
	
	
				if(score>=90) {
					result = grade[0];
				}
				else if(score>=80) {
					result = grade[1];
				}
				else if(score>=70) {
					result = grade[2];
				}
				else if(score>=60) {
					result = grade[3];
				}
				else if(score>=50) {
					result = grade[4];
				}
				
				return result;
		
	}

	@Override
	public void print() {
		
			for(int i=0; i<inwon; i++) {
			
			System.out.printf("%6s %6s %4d(%s) %4d(%s) %4d(%s) %4d %4d\n", 
					rec[i].hak,rec[i].name,
					rec[i].kor,panjung(rec[i].kor),
					rec[i].eng,panjung(rec[i].eng),
					rec[i].mat,panjung(rec[i].mat),
					rec[i].tot,rec[i].ave);

		
			}

	}
}
