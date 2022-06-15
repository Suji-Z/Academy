package com.day13;

//4.**내부클래스 (무명의, 익명의, Annonymous 클래스) : 결과값을 return해야하는 시점에 new로 객체생
//자주 사용, 메소드 1개를 반드시 overriding 해야함
//잦은 빈도 사용 -> '속도가 빠름'

public class Test7 {

	public Object getTitle() {
		
//		Object str = "무명의 클래스";
		
		return new Object() {
			
			public String toString() {
				return "무명의 클래스";
			}
		};
	}
	
	public static void main(String[] args) {
		
		Test7 ob = new Test7();
		
		System.out.println(ob.getTitle());
	}

}
