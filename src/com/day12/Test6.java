package com.day12;

//final�� ����� �� �ִ� 3���� ���
//������ final�� ���̸� : �ѹ��� �ʱ�ȭ ����
//�޼ҵ忡 final�� ���̸� : Overriding  �Ұ���
//Ŭ������ final�� ���̸� : ��� �Ұ���

class Super{
	
	public static final double PI;
	
	static {
		PI=3.14;
	}
	
	public double area;
	
	public final void write(String title) {		//�������̵� �Ұ���
		System.out.println(title + ":" + area);
	}
	
	
}


public class Test6 extends Super{

//	public void write(String title) {} ��� �Ұ�
	
	public void circleArea(int r) {
		area = (double)r*r*PI;
	}
	
	public static void main(String[] args) {

		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("��");
	}

}
