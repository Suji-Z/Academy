package com.day15;

class Box2<T> {
	
	private T t;
	public void set(T t) {
		this.t = t;
		
	}
	
	public T ger() {
		return t;
	}
	
	public <U> void print(U u) {	//<U> �޼ҵ��� �ڷ��� ����
		
		System.out.println(u);
		System.out.println("t Ŭ����: " + t.getClass().getName());
		System.out.println("u Ŭ����: " + u.getClass().getName());
		
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {

		Box2<Integer> b = new Box2<Integer>();
		
		b.set(30);
		b.print("test");	//�޼ҵ��� �ڷ����� �ԷµǴ� ���������� ����. but, class T�� �ڷ����� Integer�� set ����.
		b.print(50);
		b.print('a');
	}

}
