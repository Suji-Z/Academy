package com.day6;

public class Test6 {

	public static void main(String[] args) {
		//�迭�� �迭
		
		int[][] arr = new int[6][6];
		
		int i,j;
		int n;
		
		n=0;
		for (i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				
				n++;		// ���η� 1 2 3 4 5 [����]
				arr[i][j] = n;
				
				arr[i][5]+=n;
				arr[5][j]+=n;
				arr[5][5]+=n;
				
			}
		}
		
		//���� ��� �ڵ�. ����ڵ忡�� ���� �迭 ������ ���缭 ���ǽ� ����
		for (i=0; i<arr.length; i++) {
			for(j=0; j<arr.length; j++) {		//������
		
				System.out.printf("%4d",arr[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}}; 	// 2���� �迭 �ʱ�ȭ
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

