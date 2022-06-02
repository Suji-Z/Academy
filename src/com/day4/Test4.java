package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//수를 입력 받아 1에서부터 입력받은 수까지의 합계
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));			
		
		int su;
		int sum = 0;
		char ch;
		
		while(true) { //while문 시작, 무한루프만들기
		//값이 F인 이상 프로그램실행을 지속, true일때 중단	
			
			do {
				System.out.print("수를 입력하세요: ");
				su = Integer.parseInt(br.readLine());
			}while(su<1 || su>5000); //뒤에 절대 안되는 숫자로 제한, False가 되어야 반복연산
		
			
			sum=0; //변수를 초기화 하여 값이 지속 합 되지 않도록 함
			for(int i=1; i<=su; i++) {
				sum+=i;
			}
		
			System.out.println("1~" + su + "까지의 합: " + sum);
		
			System.out.print("계속 할래?[Y/N]"); //y,Y,n,N,1,A,아니요
			ch = (char) System.in.read(); //하나의 문자만 읽어냄
		
			
			if(ch!='y'&&ch!='Y') {//양쪽이 부정이면 || 사용 불가능. &&만	
				System.out.println("프로그램 종료!!"); 	
				break; 	//false일 경우, while문을 깨고 나가라
				//while,do-while,for,switch문에 사용 가능
		 	
				} 
		
				System.in.skip(2); //아스키값 2개 삭제 (enter의 /n, /r 값)
				
			}  //while문의 끝
	}
}
