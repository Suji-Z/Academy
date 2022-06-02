package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			int su=0;
			
			System.out.print("수 입력: ");
			su = Integer.parseInt(br.readLine());
			
			
			String str;
			
			//삼항연산자(조건?true:false)
			str = su %2 == 0 ? "짝수" : "홀수"; //나머지가 0이면 짝수, :(or) 아니면 홀수 출력

			str = su > 0 ? "양수" : (su < 0 ? "음수" : "영");
			
			//A && B {A(조건식) and B(조건식)} : A,B 둘다 true일 때 true
			//A || B (A or B) : A,B 둘 중 하나라도 true일 때 true
			str = su % 4 == 0 && su % 100 !=0 || su % 400 == 0 ? "윤년" : "평년";
					
			System.out.println(su + ":" + str);
	}

}
