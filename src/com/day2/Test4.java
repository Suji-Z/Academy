package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//System.in : 키보드로 입력한 1byte 문자를 입력 받음(ex.A,a,1 한글은 2byte)
		//InputStreaReader : System.in으로 받은 문자를 2byte로 변경
		//BufferedReader : 2byte로 변경된 문자를 저장
		
		int r;
		double area, length;
		
		System.out.print("반지름?"); //20
		
		r = Integer.parseInt(br.readLine()); // readLine: br의 문자를 읽어내는 메소드, 반환값은 'String'으로 int로 형변환 필요
		//double은 Double.parseDouble(br.readLine());, 현재는 r이 정수형이고 br이 문자이기때문에 정수로 전환시킴
		
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.println("반지름: " + r);
		System.out.println("넓이: " + area);
		System.out.println("둘레: " + length);
	}

}
