package com.day14;

import java.util.Vector;

//Collection

//배열 단점
//크기가 정해지면 늘리거나 줄이거나 삽입 불가능
//배열의 단점을 보완한 Collection(flexible)

//List (I) - ArrayList(C) 리스트를 이미 구현해놓은 클래스. Vector(C)...
//Map  (I) 둘다 인터페이스 , HashMap(C), HashTable(C)...


public class Test1 {

	public static void main(String[] args) {
		
		Vector v = new Vector<>(); // <E> : 제너릭(Generic) 벡터의 자료형을 결정. 생략할 경우 자동 Object형이 됨
		v.add("서울");	//upcast, String -> Object. 추후 downcast 필요
		v.add(30);		// Integer -> Object
		v.add('A');		// Character -> Object
		
		//각각 v에 v(0)=서울, v(1)=30, v(2)=A를 저장
		
		
		String str = (String) v.get(0);	//downcast
		System.out.println(str);
		
		Integer i = (Integer) v.get(1); // Object메소드 -> Integer로 형변환. downcast
		System.out.println(i);
		
		Character c = (Character) v.get(2);	//downcast
		System.out.println(c);
		
		for(int j=0; j<v.size(); j++) {
			Object ob = v.get(j);
			
			if(ob instanceof String) {
				str = (String)ob;
				System.out.println(str);
			}

			else if (ob instanceof Integer) {
				i = (Integer)ob;
				System.out.println(i);
			}
			else if (ob instanceof Character) {
				c = (Character)ob;
				System.out.println(c);
			}
		}
		
	}
}
