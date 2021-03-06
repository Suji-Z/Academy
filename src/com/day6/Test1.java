package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//10명 이내의 이름과 점수를 입력 받아 
		//점수가 높은 사람 순으로 출력 (최댓값 -> 최솟값)
		
		Scanner sc = new Scanner(System.in);
		
		String name[];
		int[] score;
		int inwon;
		
		do {
			System.out.print("인원 수(1~10): ");//3
			inwon = sc.nextInt();
		}while(inwon>10||inwon<1);
		
		//배열의 메모리 할당 (배열 객체생성)
		//인덱스 최대치가 명확하지 않을 경우, 인덱스값을 먼저 지정해줌
		name = new String[inwon];
		score = new int[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.print((i+1)+"번째 이름: ");
			name[i] = sc.next();
		
			System.out.print("점수: ");
			score[i] = sc.nextInt();
		}

		int temp1=0;
		String temp2;

		//Selection Sort(정렬) 내림차순
		
		for(int i=0; i<inwon-1; i++) {		//공식 일단 암기
			for(int j=i+1; j<inwon;j++) {	
				if(score[i]<score[j]){
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}		
				
			}
		}
			
		//확장 for문은 한개의 배열에서만 꺼내올 수 있음. 두개이상은 일반 for문
		for(int i = 0; i<inwon; i++) {
			System.out.printf("%6s %4d\n",name[i],score[i]);	//한글은 2bytes씩 이므로 세 자 이름은 %6s
		}

		}
		
	}


