package com.day18;

import java.io.FileInputStream;

//*****�߿�*****
//���� �����
//FileInputStream (���� �Է�) <-> FileOutputStream (���� ���)

public class Test5 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");		//���� ��ġ����
			
			int data;
			while((data=fis.read())!=-1) {		//fis.read -> 'enter'�� �������� �о��
				
//				System.out.print((char)data); // byte�� �о���� �� ��� ���ڰ� ����
				System.out.write(data);
				System.out.flush();			// enter�� ��� ������ ��� �о������ flush();
				
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
