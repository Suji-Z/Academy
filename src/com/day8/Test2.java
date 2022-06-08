package com.day8;

public class Test2 {
	
	// 기울어진 글씨 -> 'static'이 유일
	
	public static int a = 10;		//class 변수
	//클래스 변수 또는 클래스 메소드는 클래스가 로딩되는 순간 (로딩 == 컴파일한 파일을 실행하는 것)
	//메모리 할당이 이루어지며 [클래스이름.객체]를 통해서 접근 가능
	
	//즉, new를 통해서 (객체생성)메모리할당을 받지 않아도 사용 가능하다.
	
	
	public int b = 20;				//instance 변수
	//인스턴스변수는 new를 통해서 메모리 할당을 받아야만 사용이 가능하고, 클래스 메소드에서는 접근이 불가능.

	public void write() { 		//instance 메소드.
		System.out.println("class변수: "+a);
		System.out.println("instance변수: "+b);
		//인스턴스 메소드 내에서는 클래스,인스턴스 변수 둘다 사용 가능
	}
	
	public static void print() { 	//class 메소드
		System.out.println("class변수: "+a);
	}

	public static void main(String[] args) {
		
		System.out.println("class변수: "+a);
		System.out.println("class변수: "+Test2.a); //정석 클래스 이름을 붙여서 부를 수 O
		
		//write();
		print();
		Test2.print();            
			
		Test2 ob = new Test2(); //클래스와 객체이름은 동일해도 O
		
		System.out.println(ob.a); //인스턴스를 담은 변수에서 a를 출력.. 정석은 아래가 맞음
		System.out.println(Test2.a);
		
		ob.write();
		ob.print();
		
		Test2.print();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println("---------");
		
		Test2 ob1 = new Test2();	//2번째 인스턴스 생성
		
		ob1.a = 100;
		ob1.b = 200;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println("---------");
		
		Test2 ob2 = new Test2();
		System.out.println(ob2.a);	//static a는 같은 공간을 가지므로 instance를 계속 생성해도 자리를 더 늘리지 않음
									//한 공간에서 공유하기때문에 초기화 하는 값으로 새로 덮어씌워짐
		System.out.println(ob2.b);
		
		
	}

}
