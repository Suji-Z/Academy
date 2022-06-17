package com.day14;

import java.util.Vector;

//Collection

//�迭 ����
//ũ�Ⱑ �������� �ø��ų� ���̰ų� ���� �Ұ���
//�迭�� ������ ������ Collection(flexible)

//List (I) - ArrayList(C) ����Ʈ�� �̹� �����س��� Ŭ����. Vector(C)...
//Map  (I) �Ѵ� �������̽� , HashMap(C), HashTable(C)...


public class Test1 {

	public static void main(String[] args) {
		
		Vector v = new Vector<>(); // <E> : ���ʸ�(Generic) ������ �ڷ����� ����. ������ ��� �ڵ� Object���� ��
		v.add("����");	//upcast, String -> Object. ���� downcast �ʿ�
		v.add(30);		// Integer -> Object
		v.add('A');		// Character -> Object
		
		//���� v�� v(0)=����, v(1)=30, v(2)=A�� ����
		
		
		String str = (String) v.get(0);	//downcast
		System.out.println(str);
		
		Integer i = (Integer) v.get(1); // Object�޼ҵ� -> Integer�� ����ȯ. downcast
		System.out.println(i);
		
		Character c = (Character) v.get(2);	//downcast
		System.out.println(c);
		
		for(int j=0; j<v.size(); j++) {
			Object ob = v.get(j);
			
			if(ob instanceof String) {
				str = (String)ob;
				System.out.println(str);
			}

			else if (ob instanceof Integer) {
				i = (Integer)ob;
				System.out.println(i);
			}
			else if (ob instanceof Character) {
				c = (Character)ob;
				System.out.println(c);
			}
		}
		
	}
}
