package com.day12;

class Test{
	
	protected int a=10, b=20;
	public void write() {
		
		System.out.println("부모 클래스 write()...");
		System.out.println("a: " + a + ", b: " + b);
	}
}

class Demo extends Test{
	
	protected int b=30, c=40;
	@Override
	public void write() {
		System.out.println("자식 클래스 write()...");
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		System.out.println("super.b: " + super.b);
		
	}
	
	public void print1() {
		System.out.println("자식 클래스 print1()...");
		write();
	}
	
	public void print2() {
		System.out.println("자식 클래스 print2()...");
		super.write();			//super()는 상속받은 클래스 내에서만 인식, 메인절에서는 인식안됨
	}
	
}

public class Test4 {

	public static void main(String[] args) {	
		Demo ob = new Demo();
		
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println(ob.b);
		System.out.println(((Test)ob).b);	//((Test)ob).b -> Test형(super형) ob의 b. super=ob와 동일, UPCAST
		
		((Test)ob).write(); 	//이미 Overriding이 되어 부모클래스로 형 변환되어도 동일한 메소드면 자식클래스 것을 우선사용
	}

}
