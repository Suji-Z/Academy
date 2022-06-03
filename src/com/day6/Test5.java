package com.day6;

import java.util.Scanner;

//주민등록번호 만들기

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

//		주민번호 : 900110-2053126
//		index :    01234567890123  총 14 
//		고유 chk값:234567 892345
		
//		합(주민번호*chk값) : (9*2)+(0*3)+...+(2*5)
//		합= 11-합%11 (0-10) , 곱셈 첫번째 끝내고 11-합%11. ex) 11-(18%11)
//		합= 합%10
//		합==6
//		
		
		
		String jumin;
		int[] chk = {2,3,4,5,7,8,9,2,3,4,5};
		int i,tot,n;
		
		System.out.print("주민번호[xxxxxx-xxxxxxx]: ");
		jumin = sc.next();
		
		if(jumin.length()!=14) {
			System.out.println("입력 오류");
			return;	//stop. True면 밑에 비교코드가 더 있어도 실행하지 않음
		}
		
		tot = 0;
		
		for(i=0; i<12; i++) {
			
			if(i>=6) {	//주민번호 뒷자리
				tot += chk[i]*Integer.parseInt(jumin.substring(i+1, i+2)); // '-' 생략해야해서..+1씩 더
			}else {		//생년월일
				tot += chk[i]*Integer.parseInt(jumin.substring(i, i+1)); //'한 단어만 가져오기'
				
			}
		}
		
		n = 11 - tot % 11;
		n = n % 10;
		
		if(n==Integer.parseInt(jumin.substring(13))){
			System.out.println("대한민국 국민입니다.");
			
		}else {
			System.out.println("대한민국 국적이 아닙니다.");
		}
		
		
		
		
	}

}





/*
		String str = "seoul korea";
		//index :     0123456789 10  자동 생성

 		System.out.println(str.substring(0, 3)); //end index는 -1. 결과는 0~2 까지만
		System.out.println(str.substring(6, 8));
		System.out.println(str.substring(6)); //지정 index 부터 끝까지 출력 (6~10)
*/