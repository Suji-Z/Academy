package com.day10;

//���(�θ� �ڽ����� �ִ°�)

//1.�θ�(Ŭ����)�� ���� �ڽ�(Ŭ����)�� ��
//2.private�� ������ ���� ����� �ȵ�
//3.protected�� ������ ���� ��� ����
//4.�ڽ� Ŭ������ ������ �θ� Ŭ������ �Űܰ� �� ����
//5.�θ�� ���� ��ü�� ������ �ִٸ� �ڽ�Ŭ������ ���� ���

class SuperB{
	
	private String title;
	protected int area;
	
	public void set(String title)	{
		this.title = title;
	
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
}

class RectB extends SuperB {		//SuperC�� ��ӹ��� subclass Rect
	private int w,h;
	
	public RectB(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		area = w*h;		//3.protected�� ������ ���� ��� ����
		set("�簢��");	//�θ�(Ŭ����)�� ���� �ڽ�(Ŭ����)�� ��ó�� ���
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		RectB ob = new RectB(100,200);
		
		ob.rectArea();
		ob.print();
		
	}

}
