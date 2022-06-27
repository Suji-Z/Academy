package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//replaceAll (Ư�� ���ڸ� ����ڰ� �䱸�ϴ� ���ڷ� ��ü)


public class Test2 {
	
	public static String replaceAll(String str, String oldStr, String newStr) {
		
		if(str==null) {
			
			return null;
		}
		
		Pattern p = Pattern.compile(oldStr);
		
		Matcher m = p.matcher(str);		//str���� oldstr ���İ� ��ġ�ϴ� ���ڸ� ã�� ���� m�� ����
		
		StringBuffer sb = new StringBuffer();	//�� ���ڿ��� ����ϱ� ������ String�� �ƴ� buffer�� ����
												// String�� ������ �����Ⱚ�� �Բ� �����ϳ� buffer�� ����. 
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);	//sb�� ��ü�Ǵ� newStr ���� ����
			
		}
		
		m.appendTail(sb);	//appednTail()�� ������ ���������� ��ġ�ϴ� ���ڸ� ã��, �� ���� ������ ���ڿ��� ��¾ȵ�
							//ex) �츮���� ���۹α� ���۵��� ����  ������ ��µ�. appendTail() ����ϸ� ������ �������� '�� �Ǿ�...'�� ���
		
		return sb.toString();		//��ȯ���� String�� �Ǿ�� �ϹǷ� toString()���� ���ڿ��� ��ȯ

	}

	public static void main(String[] args) {
		
		String str = "�츮���� ���ѹα� ���ѵ��� ������ �Ǿ�...";
		
		String s = Test2.replaceAll(str, "����", "����");
		
		System.out.println(s);

	}

}
