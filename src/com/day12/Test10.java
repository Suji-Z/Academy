package com.day12;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write() {
		System.out.println("슈퍼클래스 write()...");
	}
	
	public int sum() {
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print() {
		System.out.println("서브클래스 print()...");
	}
	
	@Override
	public int sum() {
		return a+b+c;
	}
}


public class Test10 {

	public static void main(String[] args) {
		
		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: " + ob1.b); 	//100
		
		SuperTest ob2 = ob1;	//upcast
		System.out.println("ob2.b: " + ob2.b);	//20
		System.out.println("합: " + ob2.sum()); //310 메소드는 upcast해도 변동x..
	
		ob2.write();	//상위클래스만 가지고있는 메소드이므로 상위클래스의 메소드 내용 출력
		
		//sum()만 호출할 경우, sum()메소드 안에 출력문이 없으므로 출력안됨.. print()안에 담아져야 출력가능
		
		((SubTest)ob2).print(); 	//downcast 부모->자식 형변환
	}

}
