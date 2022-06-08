package com.day8;

public class MyData {
	
	static String name = "배수지";
	static int age = 27;
	
	public static void getInstance() {	//**static으로 만들어진 메소드들은 앞에 get()이 붙어있음
		
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
	}

}
