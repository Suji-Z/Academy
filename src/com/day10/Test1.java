package com.day10;

//���(�θ� �ڽ����� �ִ°�)

//1.�θ�(Ŭ����)�� ���� �ڽ�(Ŭ����)�� ��
//2.private�� ������ ���� ����� �ȵ�
//3.protected�� ������ ���� ��� ����
//4.�ڽ� Ŭ������ ������ �θ� Ŭ������ �Űܰ� �� ����
//5.�θ�� ���� ��ü�� ������ �ִٸ� �ڽ�Ŭ������ ���� ���

class SuperC{
	
	private String title;
	private int area;
	
	public void set(String title, int area)	{
		this.title = title;
		this.area = area;
	
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
}

class Rect extends SuperC {		//SuperC�� ��ӹ��� subclass Rect
	private int w,h;
	
	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		int a = w*h;
		set("�簢��", a);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Rect ob = new Rect(10,20);
		
		ob.rectArea();
		ob.print();
		
	}

}
