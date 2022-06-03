package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
//		1~10사이의 난수. 
//		3턴 안에 맞추지 못하면 난수 출력
		
		Random rd = new Random();
		
		int[] num = new int[1];
		
		int i,n,j;
		
		n = 0;
		int cnt,answer;
	
		while(true) {
			num[n] = rd.nextInt(10)+1; 	// num[0]은 0부터 시작하기때문에 +1
		
			for(i=1; i<4;i++) {
				System.out.print("["+i+"번째] 정수 입력: ");
				answer = sc.nextInt();
			
			if(answer!=num[n]) {
				System.out.println("틀렸습니다.");
			}
			else if(answer==num[n]) {
				System.out.println("맞습니다.");
				break;
			}
		 }
			System.out.println("정답은 "+num[n]+"입니다.");
			
		
			char ch;
			
			System.out.print("계속 할래?[Y/N]");
			ch = (char) System.in.read();
			
			if(ch!='y'&&ch!='Y') {
				System.out.println("프로그램 종료");
				break;
			}
		
		}
	}
		
	}


