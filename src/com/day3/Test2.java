package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			int su=0;
			
			System.out.print("�� �Է�: ");
			su = Integer.parseInt(br.readLine());
			
			
			String str;
			
			//���׿�����(����?true:false)
			str = su %2 == 0 ? "¦��" : "Ȧ��"; //�������� 0�̸� ¦��, :(or) �ƴϸ� Ȧ�� ���

			str = su > 0 ? "���" : (su < 0 ? "����" : "��");
			
			//A && B {A(���ǽ�) and B(���ǽ�)} : A,B �Ѵ� true�� �� true
			//A || B (A or B) : A,B �� �� �ϳ��� true�� �� true
			str = su % 4 == 0 && su % 100 !=0 || su % 400 == 0 ? "����" : "���";
					
			System.out.println(su + ":" + str);
	}

}
