package com.day9;

//Call by Value
//stack영역의 value가 heap영역으로 넘어감

//Call by Reference
//heap영역의 주소가 stack영역으로 넘어감 ?? (value는 heap -> stack으로 넘어가지 못함. 주소만)


class Test{
	
	public int x = 10;
	
	public void sub(int a) {
		x+=a; 		//들어오는 a의 값을 누적 합
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value (stack영역 a값 20이 heap영역에 넘어가 'x'값에 적용됨)
		int a = 20;
		
		System.out.println("sub()메소드 실행 전 x: " + ob.x);
		
		ob.sub(a);
		System.out.println("sub()메소드 실행 후 x: " + ob.x); 

		
		//Call by Reference
//		서로 다른 변수가 같은 인스턴스를 바라봄?
		
		Test ob1;
		ob1 = ob;
		
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob1.x);
		
		ob1.x = 100;
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob1.x);
	}

}
