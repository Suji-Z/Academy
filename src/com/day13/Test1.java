package com.day13;

//Interface
//1.추상클래스의 일종으로 선언만 있고, 정의가 없음
//2.인터페이스 안에는 final 변수만 정의할 수 있다.
//3.인터페이스는 구현하려면 implements를 사용
//4.하나 이상의 인터페이스를 implements한 클래스는 인터페이스의 모든 메소드를 재정의(Overriding)해야 함
//5.인터페이스가 다른 인터페이스를 상속받을 수 있으며, 이땐 extends 사용
//6.class와는 다르게 다중 상속이 가능

interface Fruit {
	
	String Won = "원";	//public static final (생략된 문구)
	
	int getPrice();		//public abstract(생략)
	public String getName();	//abstract
	
	
}

class FruitImpl implements Fruit {	//클래스명만 봐도 특정 인터페이스를 구현한 걸 알 수 있게 (구현한 인.페가 1개일 때)

	@Override
	public int getPrice() {
		return 1000;
	}

	
	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems() {
		return "과일";
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);		//static 변수를 호출할땐, 해당 클래스(인터페이스)이름.변수명
		
		Fruit ob2  = ob1;
		
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItems());   //getItems() 메소드는 자식클래스만 가지고있으므로 상위클래스에선 사용 불가
	}

}
