package com.day10;

//상속(부모가 자식한테 주는것)

//1.부모(클래스)의 것은 자식(클래스)의 것
//2.private로 선언한 것은 상속이 안됨
//3.protected로 선언한 것은 상속 가능
//4.자식 클래스의 내용은 부모 클래스에 옮겨갈 수 없음
//5.부모와 같은 객체를 가지고 있다면 자식클래스의 것을 사용

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

class Rect extends SuperC {		//SuperC를 상속받은 subclass Rect
	private int w,h;
	
	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		int a = w*h;
		set("사각형", a);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Rect ob = new Rect(10,20);
		
		ob.rectArea();
		ob.print();
		
	}

}
