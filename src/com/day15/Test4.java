package com.day15;

//Generic <T>

class Box<T>{	//'T' �� Object.
	
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
		Integer i = (Integer) b1.get();		//�ڷ����� �����������ʾ� Object��. �ݵ�� �ٿ�ĳ��Ʈ �ʿ�
		System.out.println(i);
		
		Box<Integer> b2 = new Box(); 	//�̶� 'T'�� ���� Object -> Integer�� �ٲ�
		b2.set(20);
		i = b2.get();
		System.out.println(i);
		
		Box<String> b3 = new Box<String>();
		b3.set("����");
		String s = b3.get();
		
		System.out.println(s);

	}

}
