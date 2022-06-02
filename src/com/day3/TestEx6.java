package com.day3;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		int kor , math, eng, total;
		String result = "";
		
		System.out.print("과목별 점수 : ");
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
		int avg = (kor+math+eng)/3;
		total = (kor+math+eng);
	
		if(kor>=40 && math >= 40 && eng >= 40 && avg>=60 ) {
			result = "합격";
			}
		else if(avg>=60 && (kor<40 || math <40 || eng < 40)) { //avg>=60 만 넣어도 O
			result = "과락";
		}
		else if(avg<60) {									  //else로 OK..
			result = "불합격";
		} 
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total + ", 평균 : " + avg + ", 판정 : " + result);

	}

}
