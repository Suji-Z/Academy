package com.day12;

//�߻� Ŭ����
//�޸��� ���� ���� Ŭ������ �̸� ����
//�޼ҵ带 ������ �ؼ� ����Ѵ�

abstract class ShapeClass{	//�߻� Ŭ���� : �ݵ�� �ϳ��� �޼ҵ带 ������ �־�� ��
	
	public abstract void draw();	//�߻� �޼ҵ�
	
	public void print() {
		System.out.println("aaa");
	}	
	
}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		 
		System.out.println("���� �׸���...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
	
}

class Tria extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");
		
	}
	
	
	
}

public class Test7 {

	public static void main(String[] args) {
		Cir c = new Cir();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
	}

}
