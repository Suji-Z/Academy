package com.day6;

import java.util.Random;
import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1~3사이의 난수.
		//1:가위, 2:바위, 3:보 n을 String으로 출력
		Random rd = new Random();
		
		int[] num = new int[1];
		
		int i,n,hand;
		int com;
	
		
		
		//컴퓨터 랜덤이 먼저? 
		n=0;
						
		String[] str = {"가위","바위","보"};
		

		while(true) {
//		num[n]=1(가위), hand=3(보)
		
				System.out.print("1:가위, 2:바위, 3:보 ? ");	//사용자가 숫자 입력
				hand = sc.nextInt();
	
			com = rd.nextInt(3)+1;
			System.out.println("컴퓨터: "+str[com]+" | 사람: "+(str[hand-1]));
			
				if(hand==1 && com==3 || hand==2 && com==1 || hand==3 && com==2) {
					System.out.print("당신이 이겼습니다.");
					break;

				}
				
				else if(hand==com) {
					System.out.println("비겼습니다.");
					break;
				}
				
				
				else 
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				
			
			}
		}
	//com=3, hand=2+1?


	}

