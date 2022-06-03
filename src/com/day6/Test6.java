package com.day6;

public class Test6 {

	public static void main(String[] args) {
		//배열의 배열
		
		int[][] arr = new int[6][6];
		
		int i,j;
		int n;
		
		n=0;
		for (i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				
				n++;		// 가로로 1 2 3 4 5 [공란]
				arr[i][j] = n;
				
				arr[i][5]+=n;
				arr[5][j]+=n;
				arr[5][5]+=n;
				
			}
		}
		
		//실제 출력 코드. 출력코드에선 실제 배열 범위에 맞춰서 조건식 쓰기
		for (i=0; i<arr.length; i++) {
			for(j=0; j<arr.length; j++) {		//가로줄
		
				System.out.printf("%4d",arr[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}}; 	// 2차원 배열 초기화
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] mul = new int[3][3];
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<b.length; j++) {
				
				mul[i][j] = a[i][j]* b[i][j];
				
				System.out.printf("%4d", mul[i][j]);
			}
			System.out.println();
			
		}
		
	}
}

