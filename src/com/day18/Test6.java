package com.day18;

import java.io.FileOutputStream;

public class Test6 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("c:\\doc\\out.txt");
			
			int data;
			
			System.out.print("���ڿ� �Է�: ");
			
			while((data=System.in.read())!=-1) {		//����ڰ� �Է��� ���ڸ� ���Ͽ� ����
				
				fos.write(data);
				fos.flush();				//���� ģ ���� ���� ���ڿ��� ���Ϸ� �� ��
				
				
			
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
