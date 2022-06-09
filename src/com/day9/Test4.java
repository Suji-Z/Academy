package com.day9;

public class Test4 {

	int a = 5; //변수만 메소드 밖에 (클래스 내에) 단독 사용 가능
	
	//초기화 블럭 {} 메소드는 사용자가 임의로 이름을 지정 후, 필요할 때 이름으로 호출해서 사용.
	// 블럭은 이름X '{}' 만. 무조건 1번만 호출되고 더이상 호출되지 않는 코딩이 들어갈 때(객체 new를 만나면 무조건 실행됨)
	{
		System.out.println("초기화 블럭a :"+a);
		a = 10;
		System.out.println("초기화 블럭a :"+a);
	}
	
	static int b;
	static { 	//static 블럭은 new를 만나지 않아도, 로딩시 무조건 '1번만' 실행
		
		b=10;
		System.out.println("초기화 블럭b :"+b);
	}
	
	final int C; 	//상수. 고정된 수 (바꾸지 않을 수). 만들시 초기화가 무조건 이루어져야만 함
					//상수는 일반적으로 '대문자'로 사용
	
	public Test4() {	//상수를 초기화하지 않고 생성자를 만들 경우, 생성자에 error 표시
		System.out.println("생성자");		//생성자는 코드의 맨 마지막 단계로 출력되기때문에 생성자 내에서 초기화하도록 강제.
		C = 100;
		System.out.println("C :" + C);
	}
	
	
	public static void main(String[] args) {

		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		//출력 순위
		//static - new(instance변수,메소드) - 생성자
		
		
	}

}
