package com.day9;


//Overload(ing) �����ε�
//�޼ҵ� �ߺ� ����
//�ϳ��� Ŭ�������� �޼ҵ��� �̸��� ���������� 
//�Ű������� ������ �ٸ��ų�, �ڷ����� �ٸ��� 
//�ٸ� �޼ҵ�� �ν��Ѵ�

class Rect{
	private int  w,h;
	
	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		
		return w*h;
		
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) {	//�����ε�
		
		System.out.println("����: "+ w);
		System.out.println("����: "+ h);
		System.out.println("����: "+ a);
		System.out.println("�ѷ�: "+ l);
	}
	
	public void print() {
		
		System.out.println("����: "+ w);
		System.out.println("����: "+ h);
		
	}
	
	public void print(int a) {
		System.out.println("����: "+ w);
		System.out.println("����: "+ h);
		System.out.println("����: "+ a);
	}
	
	public void print(double l) {
		System.out.println("����: "+ w);
		System.out.println("����: "+ h);
		System.out.println("�ѷ�: "+ l);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Rect ob = new Rect();
		
		ob.set(10, 20);
		
		int area = ob.area();
		int length = ob.length();
		
		ob.print();
		ob.print(area);
		ob.print(area, length);
		ob.print((double)length);
		
	}

}
