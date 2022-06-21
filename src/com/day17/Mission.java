package com.day17;

import java.util.Random;
import java.util.Scanner;

class PtMem implements Runnable{
	
	private static String[] name = 
		{"������","�ȼ���","����","�輺��","���ٿ�",
		"������","�̵���","������","��ȫ��","������",
		"������","������","�ڼ���","������","��â��",
		"�����","������","�ڼ���","������","�ɹ���",
		"��ä��","�迵��","�Ƚÿ�","������","�ڼ���",
		"������","������"};
	
	public void print(int num) {
		Random rd = new Random();
	
		int[] cnt = new int[name.length];
		
		for(int i=0; i<num; i++) {
			cnt[i] = rd.nextInt(name.length);
			
			for(int j=0; j<i; j++) {
				
				if(cnt[i]==cnt[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"�� ��ǥ�� : " + name[cnt[i]]);
		}
		
	}
	
	private String charact = "...........�̤�";
	
	
	private int num = 0;
	
	@Override
	public void run() {

		System.out.print("�����");
		
		for(int i=0; i<charact.length(); i++) {
			char ch = charact.charAt(i);

			System.out.print(ch);

			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			}
		}
		
}

public class Mission {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			PtMem pm = new PtMem();
			
			Thread t = new Thread(pm);
			
			System.out.print("��ǥ�� �ο� ��: ");
			int num = sc.nextInt();
			
			t.start();
			
			try {
				t.join();
				
			} catch (Exception e) {

			}
			
			System.out.println();
			
			System.out.printf("\n�����մϴ�!! ��ǥ�� �Դϴ�.\n\n");
			
			pm.print(num);
			
	}
}
