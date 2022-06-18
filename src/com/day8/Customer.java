package com.day8;

import java.util.Scanner;


public class Customer {
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	Data[] dt;
	
	public void set() {
		System.out.println("���� 10���� �̻� ���Ž� 10% ���� �̺�Ʈ�� �������Դϴ�.");
		System.out.println("���Ǵ� ���� 30,000��  ���Ǵ� ���� 50,000��");
		
		do {
			System.out.print("�� ��: "); 
			num = sc.nextInt();
		}while(num<1 || num>10);
		 
		dt = new Data[num];		//Data���� ���� name / sum, saleprice, tot / saleratio /�迭 price,cnt
		
		
	}
	
	//input���� sum�� ����( price[0]+price[1], saleprice=sum*0.9, cnt[j]�� �Է�. sum=price[0]*cnt[0]+price[1]*cnt[1]
	
	public void input() {
		String[] goods = {"����: ", "����: "};
		
		for(int i=0; i<num; i++) {
			
			dt[i] = new Data();
			
			System.out.print("�մ�: ");
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
			System.out.print(dt[i].name + "���� ���� �ݾ��� " + dt[i].sum+ "�� �̸� �� ���� �ݾ��� "+ dt[i].tot + "�� �Դϴ�.");
			System.out.println();
		}
	}

}
