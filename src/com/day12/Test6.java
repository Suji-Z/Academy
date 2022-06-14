package com.day12;

//final을 사용할 수 있는 3가지 경우
//변수에 final을 붙이면 : 한번만 초기화 가능
//메소드에 final을 붙이면 : Overriding  불가능
//클래스에 final을 붙이면 : 상속 불가능

class Super{
	
	public static final double PI;
	
	static {
		PI=3.14;
	}
	
	public double area;
	
	public final void write(String title) {		//오버라이딩 불가능
		System.out.println(title + ":" + area);
	}
	
	
}


public class Test6 extends Super{

//	public void write(String title) {} 사용 불가
	
	public void circleArea(int r) {
		area = (double)r*r*PI;
	}
	
	public static void main(String[] args) {

		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("원");
	}

}
