package com.day7;

import java.util.Scanner;

public class Rect {
	
	int w,h; 	//���� ����,instane ������ �ʱ�ȭ ���� �ʾƵ� �ڵ����� int�� �⺻�� '0'�� �� ����.
	
	public void input() { //���������� property �ڸ�
		Scanner sc = new Scanner(System.in); //new �ڿ� ������
		//int w, h; //���� ����
		
		System.out.print("����: "); //10
		
		w = sc.nextInt();
		
		System.out.print("����: "); //20
		h = sc.nextInt();
		
		//��ȯ���� ���� void�� �� ������ return���� �������־�� �ϳ� void�� return�� �����ϰ� ���
		
		//return;
		
	}
	
	//���� ���ϱ�
	public int area() { //���� ���ϴ� �޼ҵ� �������
		
		int result;
		
		result = w*h;
		
		return result;
	}
	
	//�ѷ� ���ϱ�
	public int length() {
		
		return (w+h)*2; //������ �����ϸ� �ٷ� ���� ����
		
	}
	
	//���
	public void print(int a,int l) {
		
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
		
	}

}
