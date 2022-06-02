package com.day4;

public class TestEx3 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				sum-=i;
			}
			else {
				sum+=i;
			}
		}
		System.out.print("°á°ú : " + sum);
		
	}

}
