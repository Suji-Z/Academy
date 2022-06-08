package com.day6;

import java.util.Random;
import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1~3사이의 난수.
		//1:가위, 2:바위, 3:보 n을 String으로 출력
		Random rd = new Random();
		
		int i,n,hand;
		int com;
	
	
		//컴퓨터 랜덤이 먼저? 
		n=0;
						
		String[] str = {"가위","바위","보"};
		
//		num[n]=1(가위), hand=3(보)
		com = rd.nextInt(3)+1;
		
		do {
		System.out.print("1:가위, 2:바위, 3:보 ? ");	//사용자가 숫자 입력
		hand = sc.nextInt();
		}while(hand<1||hand>3);
		
			System.out.println("컴퓨터: "+str[com-1]+" | 사람: "+(str[hand-1]));
			
			//String result="";
			//result = "무승부 입니다.";
			
				if(hand==1 && com==3 || hand==2 && com==1 || hand==3 && com==2) {
					System.out.print("당신이 이겼습니다.");
					
//				if((user==1&&com==3) || (user>com && !(com==1 && suer==3)))
//					result = "사람이 이겼습니다.";
					
//			or 가위바위보 수학공식
//				if((user+2)%3==com) , 대신 사용시엔 위에 com 값에 +1을 제거해야함. user도 출력받은 값에서 -1로 재정의
				
//					result = "사람이 이겼습니다.";

				}
				
				else if(hand==com) {
					System.out.println("비겼습니다.");
					
//					if((com==1&&user==3) || (com>user && !(user==1 && com==3)))
//					result = "컴퓨터가 이겼습니다.";
					
				}
				
				
				else 
					System.out.println("컴퓨터가 이겼습니다.");
				
		}

	}

