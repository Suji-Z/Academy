package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test8 {

		public boolean fileCopy(String str1, String str2) {
			
			File f = new File(str1);
			
			if(!f.exists()) {	//������ �������� ������ 'false'�� ��������
				return false;
			}
			
			try {
				
				FileInputStream fis = new FileInputStream(str1);
				FileOutputStream fos = new FileOutputStream(str2);
				
				int data;
				byte[] buffer = new byte[1024];
				
				while((data=fis.read(buffer, 0, 1024))!=-1) {
					fos.write(buffer, 0, data);	//data(1024ũ��)��ŭ buffer�� �־ fos�� ����
				}
				
				fos.close();
				fis.close();
					
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
			
			return true;	//������ true, ���н� false ��ȯ
		}


		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Test8 ob = new Test8();
			
			String str1, str2;
			
			System.out.print("���� ����: ");
			str1 = sc.next();
			
			System.out.print("��� ����: ");
			str2 = sc.next();
			
			if(ob.fileCopy(str1, str2)) {	//boolean�� if������ true, false �ޱ� ���
				System.out.println("���Ϻ��� ����");
				
			}else {
				System.out.println("���Ϻ��� ����");
			}
		
		}
}
