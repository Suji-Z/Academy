package com.day11;

public class Test4 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("서울");
		sb.append("부산");	//덮어씌워지지 않고, 데이터가 누적되는 중
		
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);

	}

}
