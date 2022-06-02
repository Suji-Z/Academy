package com.day4;

public class Test5 {

	public static void main(String[] args) {
		
		//다중 for문
		
		int dan=2;
		int i;
		

		//실제 구구단 출력 틀
		for(i=1; i<=9; i++) { 
				for(dan=2; dan<=9; dan++) {
				System.out.print(dan + "x" + i + "=" + dan*i + "\t");

				}
				System.out.println();
		}


	}

}
