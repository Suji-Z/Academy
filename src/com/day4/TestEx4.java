package com.day4;

public class TestEx4 {

	public static void main(String[] args) {
		int i;
		int count = 0;
		
			for(i=1; i<=100; i++) {
				if(i%3==0) {
					count+=1;
				}
			}
			System.out.print("3배수 개수: " + count);
			
	}

}
