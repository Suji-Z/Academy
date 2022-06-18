package com.day8;

import java.util.Scanner;


public class Customer {
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	Data[] dt;
	
	public void set() {
		System.out.println("현재 10만원 이상 구매시 10% 할인 이벤트를 진행중입니다.");
		System.out.println("상의는 정가 30,000원  하의는 정가 50,000원");
		
		do {
			System.out.print("고객 수: "); 
			num = sc.nextInt();
		}while(num<1 || num>10);
		 
		dt = new Data[num];		//Data에는 변수 name / sum, saleprice, tot / saleratio /배열 price,cnt
		
		
	}
	
	//input에서 sum값 정의( price[0]+price[1], saleprice=sum*0.9, cnt[j]로 입력. sum=price[0]*cnt[0]+price[1]*cnt[1]
	
	public void input() {
		String[] goods = {"상의: ", "하의: "};
		
		for(int i=0; i<num; i++) {
			
			dt[i] = new Data();
			
			System.out.print("손님: ");
			dt[i].name = sc.next();
			
			for(int j=0; j<2; j++) {
				System.out.print(goods[j]);
				dt[i].cnt[j] = sc.nextInt();
				
				if(j>0) {
					dt[i].p = dt[i].cnt[j]*50000;
				}
				
				else {
				dt[i].t = dt[i].cnt[j]*30000;
				}
				
				dt[i].sum = dt[i].t + dt[i].p;
			
			}
		
		}
}
			
	public void sale() {
		int i,j;
		
		for(i=0; i<num; i++) {
			if(dt[i].sum>100000) {
		
				dt[i].tot = (int) (dt[i].sum*0.9);
				
			}
			
			else {
				
				dt[i].tot = dt[i].sum;
			}
		}	
	}
			
			
	
	public void print() {
		
		sale();
		
		for(int i=0; i<num; i++) {
			System.out.print(dt[i].name + "님의 구매 금액은 " + dt[i].sum+ "원 이며 총 결제 금액은 "+ dt[i].tot + "원 입니다.");
			System.out.println();
		}
	}

}
