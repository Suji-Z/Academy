package com.day15;

class Box2<T> {
	
	private T t;
	public void set(T t) {
		this.t = t;
		
	}
	
	public T ger() {
		return t;
	}
	
	public <U> void print(U u) {	//<U> 메소드의 자료형 지정
		
		System.out.println(u);
		System.out.println("t 클래스: " + t.getClass().getName());
		System.out.println("u 클래스: " + u.getClass().getName());
		
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {

		Box2<Integer> b = new Box2<Integer>();
		
		b.set(30);
		b.print("test");	//메소드의 자료형은 입력되는 변수에따라 결정. but, class T의 자료형은 Integer로 set 고정.
		b.print(50);
		b.print('a');
	}

}
