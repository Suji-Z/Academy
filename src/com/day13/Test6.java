package com.day13;

import com.day13.Outer3.Inner3;

//3.���� Ŭ����(��ø) : 'static' class. �ܺ� Ŭ�������� ���� �޸𸮰� �ö�(����)
// Outer�� ��ü�� �ش� ����Ŭ�������� ���� ����

class Outer3{
	
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		int c = 30;
		
		public void write() {
			
			System.out.println(a);
//			System.out.println(b);	//���� �޸𸮿� �ö��� �ʾұ⶧���� ��� �Ұ�.
			System.out.println(c);
			
			Outer3 ob = new Outer3();	//�ش� ������δ� ��� ����
			System.out.println(ob.b);
		}
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Inner3 ob3 = new Inner3();
		ob3.write();
	}

}
