package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor;
		String name;
		
		System.out.print("이름 : "); //Suji
		name = sc.next();
		
		System.out.print("국어점수 : "); //60
		kor = sc.nextInt();					//반환값 자동으로 형변환
		
		String pan;
		
		if(kor >= 90) {
			pan = "수";
		}
		else if (kor >= 80) {
			pan = "우";
		}
		else if (kor >= 70) {
			pan = "미";
		}
		else if (kor >= 60) {
			pan = "양";
		}
		else {
			pan = "가";
		}
		
		//System.out.println(name + "의 국어 점수는 " + kor + "점이고 " +
		//"환산 점수는 '" + pan + "' 입니다.");
		
		System.out.printf("%s의 국어 점수는 %d점이고 환산 점수는 {%s] 입니다.", name,kor,pan);
	 //String:%s, float:%f, double:%g, char:%c, int:%d
	}

}
