package com.day13;

import com.day13.Outer3.Inner3;

//3.내부 클래스(중첩) : 'static' class. 외부 클래스보다 먼저 메모리가 올라감(읽힘)
// Outer의 객체를 해당 내부클래스에서 생성 가능

class Outer3{
	
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		int c = 30;
		
		public void write() {
			
			System.out.println(a);
//			System.out.println(b);	//아직 메모리에 올라가지 않았기때문에 출력 불가.
			System.out.println(c);
			
			Outer3 ob = new Outer3();	//해당 방식으로는 출력 가능
			System.out.println(ob.b);
		}
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Inner3 ob3 = new Inner3();
		ob3.write();
	}

}
