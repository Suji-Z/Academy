package com.day7;

public class Test1 {

	public static void main(String[] args) {
		
		Rect ob = new Rect();
		
		ob.input(); 
		int a = ob.area();	//�ڷ����� �����ָ� ��. ���� �̸��� �� Ŭ������ ������� ��ġ���� �ʾƵ� O
		
		int l = ob.length();
		ob.print(a, l);       
		
		Rect ob2 = new Rect();
		ob2.input();
		a = ob2.area();
		l = ob2.length();
		ob2.print(a, l);
	}

}
