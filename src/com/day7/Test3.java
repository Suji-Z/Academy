package com.day7;

import java.util.Scanner;

class Hap{
	
	int n, sum;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		
	}
	
	public int cnt() {
		for(int i=1; i<=n; i++) {
			
			sum+=i;
		}
		
		return sum; //�ν��Ͻ� ������ �ʱ�ȭ ���� �����൵ ����x �ڵ����� '0'
	}

	public void pirnt(int result) { //���� �������� return ������ �ص�, ���� �����̸����� �ص� ��� ����
		System.out.println("1���� " + n + "������ ��: " + result);
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
