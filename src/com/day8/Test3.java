package com.day8;

import java.util.Calendar;

public class Test3 {
	
	public static void main(String[] args) {
			
		MyData.getInstance(); 
		//static���� �ٲ���� ���� instance ������ �ʿ���� �޼ҵ常 ȣ���ϸ� ��
		//static �޼ҵ���� �̹� �տ� 'get'�� �پ��־ ����� ���� ��
		
		Calendar cal = Calendar.getInstance(); 
		// �Ϲ� ��ü����ó�� ������ ����. ex)Calendar cal = new Calendar(); ==> X
		//static�̹Ƿ� get()���� ���
		
		
	}

}
