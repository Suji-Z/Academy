package com.day7;

public class Test1 {

	public static void main(String[] args) {
		
		Rect ob = new Rect();
		
		ob.input(); 
		int a = ob.area();	//자료형만 맞춰주면 됨. 변수 이름은 전 클래스의 변수명과 일치하지 않아도 O
		
		int l = ob.length();
		ob.print(a, l);       
		
		Rect ob2 = new Rect();
		ob2.input();
		a = ob2.area();
		l = ob2.length();
		ob2.print(a, l);
	}

}
