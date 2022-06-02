package com.day4;

public class TestEx1 {

	public static void main(String[] args) {
		int sum=0;
		int total=0;
		//코드는 7줄로 마무리
//		(1)+(1+2)+(1+2+3+)+....+(1~ + 10) 결과:220
		
//		0+1, 1+2, if  
//		1,3,6,10,15,21 ...
		
		for(int i=1; i<=10; i++) { 
				sum+=i;  //(0+1=1), (1+2=3), (3+3=6), (6+4)
				total+=sum; // 0+
			}
			System.out.print("결과 : " + total);
		}

	}

