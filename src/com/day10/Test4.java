package com.day10;

class Super{
	
	private String title;
	protected double area;
	
	public Super() {}				//�⺻������
	
	public Super(String title) {	//�����ε� ������
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
	}

}

class Circle extends Super{
	
	private int r;
	protected static final double PI = 3.14; //������ �ʴ� ���
	
	public Circle(int r) {		//�����ڷ� �ʱ�ȭ
		super("��"); 
		this.r = r;
	}
	
	public void circleArea() {
		area = r*r*PI;
	}
	
	
}

class Recta extends Super{
	
	private int w,h;

	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
	
		area = w*h;
	}

	//	@Override ������̼�(aanotation)
	//�������̵�, �� ����Ŭ���� �޼ҵ�� �̸� Ȥ�� �ڷ������� �°� �ߴ��� �˿�����
	// 1. alt+shift+s -> overried method �������� ���� ����
	// 2. �ش��ϴ� �޼ҵ� �̸� + ctrl&space -> �ش� �޼ҵ� �����ؼ� ��� ����
	
	@Override
	public void write() {
			System.out.println("����: " + w);
			System.out.println("����: " + h);
			System.out.println("����: " + area);
	}
	

	
	
	
}

public class Test4 {

	public static void main(String[] args) {

		Circle c = new Circle(10);
		c.circleArea();
		c.write();
		
		System.out.println();
		
		Recta r = new Recta();
		r.rectArea(10, 20);
		r.write();
	}

}
