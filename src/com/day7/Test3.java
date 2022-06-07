package com.day7;

import java.util.Scanner;

class Hap{
	
	int n, sum;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
	}
	
	public int cnt() {
		for(int i=1; i<=n; i++) {
			
			sum+=i;
		}
		
		return sum; //인스턴스 변수라 초기화 따로 안해줘도 에러x 자동으로 '0'
	}

	public void pirnt(int result) { //여기 변수명은 return 변수로 해도, 임의 변수이름으로 해도 상관 없음
		System.out.println("1부터 " + n + "까지의 합: " + result);
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Hap h = new Hap();
		
		h.input();
		int sum = h.cnt();
		
		h.pirnt(sum);
		
	}

}
