package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//���� �Է� �޾� 1�������� �Է¹��� �������� �հ�
		
		Scanner sc = new Scanner(System.in);
		int su;
		int sum = 0;
		char ch;
		
		while(true) { //while�� ����, ���ѷ��������
		//���� F�� �̻� ���α׷������� ����, true�϶� �ߴ�	
			
			do {
				System.out.print("���� �Է��ϼ���: ");
				su = sc.nextInt();
			}while(su<1 || su>5000); //�ڿ� ���� �ȵǴ� ���ڷ� ����, False�� �Ǿ�� �ݺ�����
		
			
			sum=0; //������ �ʱ�ȭ �Ͽ� ���� ���� �� ���� �ʵ��� ��
			for(int i=1; i<=su; i++) {
				sum+=i;
			}
		
			System.out.println("1~" + su + "������ ��: " + sum);
		
			System.out.print("��� �ҷ�?[Y/N]"); //y,Y,n,N,1,A,�ƴϿ�
			ch = (char) System.in.read(); //�ϳ��� ���ڸ� �о
		
			if(ch!='y'&&ch!='Y') {//������ �����̸� || ��� �Ұ���. &&��	
				System.out.println("���α׷� ����!!"); 	
				break; 	//false�� ���, while���� ���� ������
				//while,do-while,for,switch���� ��� ����
		 	
				} 
		
			}  //while���� ��
	}
}
