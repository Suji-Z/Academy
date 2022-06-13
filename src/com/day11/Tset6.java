package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tset6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����[3+5] : ");
		String str = br.readLine();
		
		str = str.replaceAll("\\s", ""); 	// i=i+1, str�� ������ null�� ó��
		
//		String[] op = {"+","-","*","/"};
		
//		for(String o : op) { 	//������ ��
		
			for(String op : new String[] {"+","-","*","/"})  {	//�迭 ����� for�� ������ �ѹ��� ����
			
				//	 012345
				//ex)123+56 
				int pos = str.indexOf(op); // �ε��� ��ȣ�� ��� pos ����, '+'�� �������� 3 ���
				
				if(pos>-1) {
					
					int num1 = Integer.parseInt(str.substring(0, pos)); //str�� 0���� pos������ ���� ���
					int num2 = Integer.parseInt(str.substring(pos+1));	//pos(������) ���� ���ں��� ���
					
					int result = 0;
					char oper = str.charAt(pos); // '+' 
					
					switch(oper) {
					
					case '+':
						result = num1 + num2; break;
					case '-':
						result = num1 - num2; break;
					case '*':
						result = num1 * num2; break;
					case '/':
						result = num1 / num2; break;
						
					}
					
//					System.out.printf("%d %c %d = %d", num1, oper, num2, result);
					String s = String.format("%d %c %d = %d" , num1,oper,num2,result);	
					//format() : ����ڰ� ���ϴ� ���� ����, ���� ����� �� �ش� ������ �״�� �ݿ��Ͽ� ���
					// == printf() �� ��� ����
					
					System.out.println(s);
					
				}
			
		}
		

	}

}
