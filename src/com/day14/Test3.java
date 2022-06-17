package com.day14;

import java.util.Vector;

class Test{
	
	String name;
	int age;
	
}

public class Test3 {

	public static void main(String[] args) {
		
		Vector<Test> v = new Vector<>();	//클래스도 자료형이므로 (string과 같은 원리)
		
		Test ob = new Test();
		
		ob.name = "배수지";
		ob.age = 27;
		v.add(ob);
		
		ob = new Test();	//객체 새로 생성하여 데이터 새로 추가.
		ob.name = "유인나";
		ob.age = 42;
		v.add(ob);
		
		for(Test t : v) {
			System.out.println(t.name + ":" + t.age);
		}

	}

}
