package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//System.in : Ű����� �Է��� 1byte ���ڸ� �Է� ����(ex.A,a,1 �ѱ��� 2byte)
		//InputStreaReader : System.in���� ���� ���ڸ� 2byte�� ����
		//BufferedReader : 2byte�� ����� ���ڸ� ����
		
		int r;
		double area, length;
		
		System.out.print("������?"); //20
		
		r = Integer.parseInt(br.readLine()); // readLine: br�� ���ڸ� �о�� �޼ҵ�, ��ȯ���� 'String'���� int�� ����ȯ �ʿ�
		//double�� Double.parseDouble(br.readLine());, ����� r�� �������̰� br�� �����̱⶧���� ������ ��ȯ��Ŵ
		
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.println("������: " + r);
		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + length);
	}

}
