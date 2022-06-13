package com.day11;

//Object : 모든 클래스의 최상위 부모

class Test{
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("ob1==ob2: " + (ob1==ob2)); 	// '=='은 각 객체의 주소(?)가 동일한지 따져봄
		System.out.println("ob1.equals(ob2): "+ob1.equals(ob2));

		//해쉬코드(hashcode) [클래스이름@해쉬코드]
		System.out.println("ob1: "+ob1);	//Test@7852e922
		System.out.println("ob2: "+ob2);	//Test@4e25154f 
	}

}
