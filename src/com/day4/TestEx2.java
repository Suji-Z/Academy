package com.day4;

public class TestEx2 {

	public static void main(String[] args) {
		
		int i,j,sum1=0;
		int sum2=0;
		int total;
		
		for(i=1; i<=100; i+=2) {
			sum1+=i;
			}
		System.out.print("È¦¼öÀÇ ÇÕ: " + sum1);
		System.out.println();
		for(i=2; i<=100; i+=2) {
			sum2+=i;
		}
		System.out.print("Â¦¼öÀÇ ÇÕ: " + sum2);
		System.out.println();
		
		System.out.print("ÃÑÇÕ : " + (sum1+sum2) );
	}

}
