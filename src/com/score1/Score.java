package com.score1;

import java.util.Scanner;

public class Score {
	Scanner sc = new Scanner(System.in);
	int inwon; 
	
	Record[] rec; 	// record는 총 7개의 data가 들어감
					// 배열 안에 클래스를 담을 수 있음
	
	public void set() {
		
		do {
			System.out.print("인원수: "); //3
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);
		 
		rec = new Record[inwon]; 
		
	}
	
	public void input() {
		
		String[] title = {"국어: ", "영어: ", "수학: "};
		
		for(int i=0; i<inwon; i++) {
			
			rec[i] = new Record(); 	//Record의 위치? 호출
		
			System.out.print("이름: "); //suji
			rec[i].name = sc.next();
		
			
			for(int j=0; j<3; j++) {
				
				System.out.print(title[j]); //30 //title의
				rec[i].score[j] = sc.nextInt();
				
					
				rec[i].tot += rec[i].score[j];
			}
				
				rec[i].avg = rec[i].tot/3;
			
		}
		
	}
	
	private void ranking() {	//직원 전용..접근지정자.
		
		int i,j;
		
		//rank 초기화
		for(i=0; i<inwon; i++) {
			
			rec[i].rank = 1; 	//초기화
		}
		
		for (i=0; i<inwon-1; i++) {
			for(j=i+1; j<inwon; j++) {
				if(rec[i].tot> rec[j].tot)
					rec[j].rank++;
				
				else if (rec[i].tot<rec[j].tot)
					rec[i].rank++;
				
			}
		}
		
	}
	
	
	public void print() {
		
		ranking(); //메소드에서 메소드를 호출할 수 있음 **
		
		for(int i=0; i<inwon; i++) {
			
			System.out.printf("%6s", rec[i].name);
			
			for(int j=0; j<3; j++) {
				System.out.printf("%4d", rec[i].score[j]);
			}
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].avg);
			System.out.printf("%4d", rec[i].rank);
			System.out.println();
		}
		
		
	}
	
	
	
	
	
}
