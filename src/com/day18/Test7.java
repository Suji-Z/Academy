package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		int data;
		
		//���Ϻ���
		//�������� : c:\\doc\\test.txt
		//�������: c:\\doc\\out1.txt
		//����Ϸ�!
	
		try {
			
			System.out.print("���� ����: ");
			str1 = sc.next();
			
			System.out.print("��� ����: ");
			str2 = sc.next();
			
			FileInputStream fis = new FileInputStream(str1);	//�������� ������ ī��
			FileOutputStream fos = new FileOutputStream(str2);	//ī���� �����͸� str2�� ���
			
			while((data = fis.read())!=-1) {
				
				// ���ڿ��� ����Ʈ�迭�� ��ȯ�ؼ� ���Ͽ� ����
				fos.write(data);
				fos.flush();
		
				
			}
			
			fis.close();
			fos.close();
			
			System.out.print("���� �Ϸ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
