package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ǵ������� ����� ����(����� ���� ����)

public class Test2 {

	public static String getOper() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";
		
		try {
			
			System.out.print("������: ");
			oper = br.readLine();  		// Exception�� �����ϱ⶧���� throws IOException�� �߰� ���� �ʾƵ� ����x
			
			if(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
				//����� ���� ����, �ش� �����ڰ� �Էµ��� ������ ������ ���� �߻�
				//try catch �ȿ� �ڵ�
				//throws Exception ó�� �ʿ�
				throw new Exception("������ �Է� ����");	//exceptionŬ���� ��ü ����
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println("�Է� ����");
		}
		
		return oper;
		
	}
	
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, result;
		String oper;
		
		try {
			System.out.print("ù��° ��: ");
		    num1 = Integer.parseInt(br.readLine());
		    
		    System.out.print("�ι�° ��: ");
		    num2 = Integer.parseInt(br.readLine());
			
			oper = Test2.getOper();		//�����ڸ� ���� ó��
			
			result = 0;
			
			if(oper.equals("+")) {
				result = num1 + num2;
			}
			
			else if(oper.equals("-")) {
				result = num1 - num2;
			}
			
			else if (oper.equals("*")) {
				result = num1 * num2;
			}
			else if (oper.equals("/")) {
				result = num1 / num2;
			}
			System.out.printf("%d %s %d = %d\n",num1,oper,num2,result);

			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
