package com.day12;

//추상 클래스
//메모리의 낭비 없이 클래스를 미리 설계
//메소드를 재정의 해서 사용한다

abstract class ShapeClass{	//추상 클래스 : 반드시 하나의 메소드를 가지고 있어야 함
	
	public abstract void draw();	//추상 메소드
	
	public void print() {
		System.out.println("aaa");
	}	
	
}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		 
		System.out.println("원을 그리다...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그리다...");
	}
	
}

class Tria extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("삼각형을 그리다...");
		
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
