package com.day11;

public class Test4 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("����");
		sb.append("�λ�");	//��������� �ʰ�, �����Ͱ� �����Ǵ� ��
		
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);

	}

}
