package com.day13;

//4.**����Ŭ���� (������, �͸���, Annonymous Ŭ����) : ������� return�ؾ��ϴ� ������ new�� ��ü��
//���� ���, �޼ҵ� 1���� �ݵ�� overriding �ؾ���
//���� �� ��� -> '�ӵ��� ����'

public class Test7 {

	public Object getTitle() {
		
//		Object str = "������ Ŭ����";
		
		return new Object() {
			
			public String toString() {
				return "������ Ŭ����";
			}
		};
	}
	
	public static void main(String[] args) {
		
		Test7 ob = new Test7();
		
		System.out.println(ob.getTitle());
	}

}
