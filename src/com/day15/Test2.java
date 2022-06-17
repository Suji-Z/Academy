package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key, value> (I)	key�� �ַ� �ڷ���,	value�� �ַ� class�� ���.
//Hashtable (C)	 - Vector
//HashMap 	(C)	 - ArrayList (����)

//Key�� �ߺ����� ���� �� ���� (Key�� Set�̶�� �������̽��� �ڷ���)
//Ű�� �ߺ����� ���� �Ǹ� ������ ��
//map�� Iterator�� ����.. but, set�� �÷����̱� ������ set�� iterator�� ��� ����
//put(������ �߰�), get(������ ��������)

public class Test2 {

	public static final String tel[] = 
		{"111-111","222-222","333-333","111-111","444-444"}; //key
	
	public static final String name[] = 			
		{"�����","���γ�","���μ�","���ƶ�","�ڽ���"};		//value
	
	
	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i=0; i<name.length; i++) {
			h.put(tel[i], name[i]);			//name[0]�� name[3]�� tel[i], key���� �ߺ��̹Ƿ� �ڵ����� name[0]�� ����
		}
		
		System.out.println(h);				//�Է� ������ ������� ���� ���� �ӵ��� ��°����� ������ ������ ���.
		
		String str;
		str = h.get("111-111");		//key�� �Է��ϸ� �ش� key�� value�� �������� �޼ҵ�
		if(str == null) {
			System.out.println("�ڷ� ����");
		}
		
		else {
			System.out.println(str);
		}
		
		if(h.containsKey("222-222")){		//�ش� key�� ���� ������ true, ������ false
											//remove �ʿ�� �޼ҵ�� true�϶� �����ϵ��� ���� ����
				System.out.println("222-222 �ִ�.");

		} else {
			System.out.println("222-222 ����.");
		}
		
		if(h.containsValue("���ƶ�1")) {			//class�� value�� �־� ����ϰ� �� ��쿣 ex)vo.getName()�� �־� ��
			System.out.println("���ƶ� �ִ�.");
		}else {
			System.out.println("���ƶ�1 ����.");
		}
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext())	{
			
			String key = it.next();		// it.next()�� key�� ������
			String value = h.get(key); //�ٽ� get() ���� key�� value ������. get�� value�� ��ȯ�ϹǷ�
			
			System.out.println(key + " " + value);
		}
		
		
		
		

	}
}
