package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();		//scoreimp�� score�������̽��� �����Ͽ����Ƿ� upcast
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.�й��˻� " + 
						"6.�̸��˻� 7.����: ");
				ch = sc.nextInt();
				
			}while(ch<1);
			
			switch(ch) {
			
				case 1: ob.input(); break;
				case 2: ob.print(); break;
				case 3: ob.delete(); break;
				case 4: ob.update(); break;
				case 5:ob.findHak(); break;
				case 6:ob.findeName(); break;
				default:
					System.out.println("�л����� �ý����� �����մϴ�.");
					System.exit(0); 	//������ ���α׷� ����
					
			}
			
		}
		
		
//		ScoreVO vo = new ScoreVO();	//�⺻ ������
	
//		vo.set("111","�����",60,70,80);
		
//		vo.setHak("a123");
//		vo.setName("�����");
//		vo.setKor(90);
//		vo.setEng(80);
//		vo.setMat(70);

		
//		String str = vo.toString();
//		
//		System.out.println(str);
//		
//		System.out.println(vo.getHak());
//		System.out.println(" " + vo.getEng());
		
		
		/*
		ScoreVO vo1 = new ScoreVO("222", "���ƶ�", 80, 90, 70);
		
		System.out.println(vo1.toString());

		*/
	}

}
