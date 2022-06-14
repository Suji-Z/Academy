package com.day12;

class TestA{
	
	public void print() {
		System.out.println("TestA 클래스");
	}
}

class TestB extends TestA{
	
	public void print() {
		System.out.println("TestB 클래스");
	}
}



public class Test9 {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b;
		
//		b = a;	//데이터 타입이 다르고, 속해있는 클래스간 상속관계도 아니기때문에 아예 성립 불가
		
		//TestB가 TestA를 상속받을 경우 성립
		b = (TestB)a;
	}

}
