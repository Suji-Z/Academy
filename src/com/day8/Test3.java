package com.day8;

import java.util.Calendar;

public class Test3 {
	
	public static void main(String[] args) {
			
		MyData.getInstance(); 
		//static으로 바꿔놔서 따로 instance 생성할 필요없이 메소드만 호출하면 됨
		//static 메소드들은 이미 앞에 'get'이 붙어있어서 끌어다 쓰면 됨
		
		Calendar cal = Calendar.getInstance(); 
		// 일반 객체생성처럼 적으면 에러. ex)Calendar cal = new Calendar(); ==> X
		//static이므로 get()으로 사용
		
		
	}

}
