package com.day3;

import java.util.Scanner;

//Scanner : 단락문제의 패턴을 사용해 구분
//기본 단락은 공백

public class Test6 {

	public static void main(String[] args) {
		        //sc : Suji,50,70,80
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;
		
		//System.out.print("이름 국어 영어 수학?"); //Suji 50 70 80
		System.out.print("이름,국어,영어,수학?"); //Suji,50,70,80 구분자가 ','가 됨
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 
		// '\\s*' : API에 존재. 
		
		name = sc.next(); //공백을 만나면 멈춤
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + ":" + (kor+eng+mat) + "점");
		
	}

}
