package com.day3;

import java.util.Scanner;

class Calc2 {
	Scanner sc = new Scanner(System.in);
	int kor , math, eng, total;
	String result = "";
	String name;
	int avg;
	
	public void input() {
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("과목별 점수 : ");
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
	}
	
	public void result() {
		
		avg = (kor+math+eng)/3;
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
		
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total + ", 평균 : " + avg + ", 판정 : " + result);
	}
}

public class TestEx6_1 {

	public static void main(String[] args) {
		
		Calc2 ca = new Calc2();
		
		ca.input();
		ca.result();
		ca.print();	
		
	}

}
