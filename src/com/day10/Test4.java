package com.day10;

class Super{
	
	private String title;
	protected double area;
	
	public Super() {}				//기본생성자
	
	public Super(String title) {	//오버로딩 생성자
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
	}

}

class Circle extends Super{
	
	private int r;
	protected static final double PI = 3.14; //변하지 않는 상수
	
	public Circle(int r) {		//생성자로 초기화
		super("원"); 
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

	//	@Override 어노테이션(aanotation)
	//오버라이딩, 즉 상위클래스 메소드와 이름 혹은 자료형등을 맞게 했는지 검열해줌
	// 1. alt+shift+s -> overried method 눌러서도 선택 가능
	// 2. 해당하는 메소드 이름 + ctrl&space -> 해당 메소드 선택해서 출력 가능
	
	@Override
	public void write() {
			System.out.println("가로: " + w);
			System.out.println("세로: " + h);
			System.out.println("넓이: " + area);
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
