package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		char ch,result;
		ch = 'a'; //97 (�ƽ�Ű ��)
		//System.out.println(ch); //���������� �ƽ�Ű�� 97�� �� a�� ��µ�
		//System.out.println(Integer.toString(ch));
		
		System.out.print("�Ѱ��� ����?"); //a
		ch = (char) System.in.read();//read�� int�� ��ȯ���̶� char�� ����ȯ ���־�� ��
		//ch�� ������ 97�� ������	
		//system.in�� �Ѱ��� ���ڸ� �о ex)abcd�� a��
			//97(57,55)
		
		result = ch >= 65 && ch <= 90 ? (char)(ch+32) : 
			(ch >= 'a' && ch <= 'z' ? (char)(ch-32) : ch); //65~90�� �빮�� A~Z ����, 
	//ũ��񱳽ÿ� �ڵ����� int�� ����ȯ
		System.out.println(ch + ":" + result); 
		
	}

}
