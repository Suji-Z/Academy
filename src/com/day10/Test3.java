package com.day10;

class SuperD{
	
	private String title;
	protected int area;
	
	public SuperD(String title) {
		
		this.title = title;
		
	}
	
	public void print() {
		
		System.out.println(title + ":" + area);
		
	}
}

class RectD extends SuperD{
	
//	public RectD() {
//		super();		
//	}			
	 //하위클래스 default생성자 안에 숨겨져있는 상위클래스호출 메소드 , super()
	//상위클래스에 기본생성자 만들지 않으려면 매개변수를 자료형과 동일하게 넣어주면 됨
	//ex. super("a");
	
	
	private int w,h;
	
	public RectD(int w, int h) {
		super("사각형");	//선두에 1번만 적용 가능
							//부모클래스 먼저 초기화 한 후, 자식클래스 초기화 가능
		
		this.w = w;
		this.h = h;
		
	}
	
	public void recArea() {
		area = w*h;
	}

	
}

public class Test3 {

	public static void main(String[] args) {
		
		RectD ob = new RectD(10,20);
		
		ob.recArea();
		ob.print();
		
	}

}
