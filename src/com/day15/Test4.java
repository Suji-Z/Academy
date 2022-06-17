package com.day15;

//Generic <T>

class Box<T>{	//'T' 는 Object.
	
	private T t;
	public void set(T t) {
		
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	
}

public class Test4 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		
		b1.set(30);   //Integer, Upcast
		Integer i = (Integer) b1.get();		//자료형을 지정해주지않아 Object형. 반드시 다운캐스트 필요
		System.out.println(i);
		
		Box<Integer> b2 = new Box(); 	//이때 'T'가 전부 Object -> Integer로 바뀜
		b2.set(20);
		i = b2.get();
		System.out.println(i);
		
		Box<String> b3 = new Box<String>();
		b3.set("서울");
		String s = b3.get();
		
		System.out.println(s);

	}

}
