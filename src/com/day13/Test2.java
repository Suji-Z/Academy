package com.day13;

interface Test{
	
	public int total();

	public void write();
	
}

class TestImpl implements Test{

	private String hak, name;
	private int kor, eng;
	
	public TestImpl(String hak, String name, int kor, int eng) {	//생성자로 초기화
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void set(String hak, String name, int kor, int eng) {	
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak + ":" + name + ":" +total());
	}

	@Override
	//object클래스의 equals 메소드를 가져와 overriding
	public boolean equals(Object ob) {		// TestImpl ob1.equals(ob2)  TestImpl
											//object의 자식 ob2가 Object 변수에 들어가 upcast
		boolean flag = false; 	//기본값
		
		if(ob instanceof TestImpl) {	//ob (ob2)의 원래 데이터타입은? == TestImpl
			TestImpl t = (TestImpl)ob;	// object형식의 ob(ob2)를 다시 TestImpl로 형변환 downcast, t = ob2
			
			if(this.hak.equals(t.hak)&&name.equals(t.name)) { 
				//equals를 String hak의 메소드로 쓰며 주소가 아닌 데이터타입 자체를 비교
				flag = true;
			}	
		}
		return flag;
	}
	
	
	
	
}

public class Test2 {

	public static void main(String[] args) {
		
		//인터페이스 = new 클래스
		//인터페이스 안에 있는 메소드들로만 모두 구현했을 때만 가능한 문법
		
		Test ob1 = new TestImpl("1111", "배수지", 80, 90);	//사용한 메소드가 부모의 메소드와 동일하기때문에 가능
		Test ob2 = new TestImpl("1111", "배수지", 100, 100);	//new로 각각 객체생성을 했기때문에, 다른 주소로 인식
		
		if(ob1.equals(ob2)) //Object의 메소드 equals() , ob1과 ob2가 같은지?
			System.out.println("ob1과 ob2는 동일 인물..");
		else
			System.out.println("ob1과 ob2는 다른 인물..");
		
		ob1.write();
		ob2.write();

	}

}
