package com.day16;

import java.util.Scanner;

//5~10�� �̳��� ���ڿ��� �Է¹޾Ƽ� ����ϴ� ���α׷�
//����
//1. 5~10�� �̳��� ���ڿ�
//2. �����ڸ� �Է�

class MyAuthen extends Exception{
	
	public MyAuthen(String msg) {
		super(msg);
	}

	public MyAuthen() {
	
	}

	private static final long serialVersionUID = 1L;

	public void inputFormat(String str) throws Exception{
		
		//1. 5~10�� �̳��� ���ڿ�
		//���ڿ��� ���̴� 5~10�� �̳������մϴ�.
	
		if(str.length()<5 || str.length()>10) {
			
			throw new MyAuthen("���ڿ��� ���̴� 5~10�� �̳����� �մϴ�.");
		}
		int engcnt = 0;
		int numcnt = 0;
		//2. �����ڸ� �Է�
		//������ �Է¸� �����մϴ�.
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);	//a b 1 2 c
//			if((ch<'A' || ch> 'Z') && (ch<'a' || ch>'z')) {
//				throw new MyAuthen("�����ڸ� �Է� �����մϴ�.");
//			}
			
			//������ ���� ȥ��

			if((ch>='A' && ch<='Z') || (ch>='a' &&  ch<='z')) {
				engcnt++;

			}
			else if(ch>='0' && ch<='9') {
				numcnt++;
			}
			
		}
		if(engcnt==0 || numcnt==0) {
			throw new MyAuthen("������ ���� ȥ�븸 �����մϴ�.");
		
		
		}
	}
	
	
}

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		MyAuthen auth = new MyAuthen();
		
		try {
			
			System.out.print("���ڿ�: ");	//abcdef
			str = sc.next();
			
			auth.inputFormat(str);	//���� �˼� �� �ǵ��ƿ�
			
			System.out.println(str);
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
			}

}
