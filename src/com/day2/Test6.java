package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test6 {

	public static void main(String[] args) throws IOException {
		//�غ�(w)�� ����(h)�� �Է¹޾� �ﰢ���� ����(a) ���ϱ�
		//�غ�? 23.5
		//����? 34.7
		//���� : xxx.xx
		//���� = �غ� * ����/2
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		double w,h,a;
		
		System.out.print("�غ� : ");
		w = Double.parseDouble(br.readLine());
		
		System.out.print("���� : ");
		h = Double.parseDouble(br.readLine());
		
		
		a = w * h/2;
		
		System.out.println("���� : " + a);
		

	}

}
