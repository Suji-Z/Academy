package com.day4;

public class Test3 {

	public static void main(String[] args) {
		
		int n,s;
		s=0;
		
		//100������ ��
		for(n=1; n<=100; n++) {
			s+=n;
		}
		
		//Ȧ���� ��
		s=0;
		for(n=1; n<=100; n+=2) {
			s+=n;
		}
		
		//¦���� ��
		s=0;
		for(n=2; n<=100; n+=2) {
			s+=n;
		}
		
		int cnt = 0;
		//Ȧ���� ����
		for(n=1;n<=100;n++) {
			if(n%2!=0) {
				cnt+=1;
			}
		}
		cnt=0;
		//¦���� ����
		for(n=1; n<=100; n++) {
			if(n%2==0) {
				cnt+=1;
			}
		}
		
		System.out.println("Ȧ���� ����: " + cnt);
		System.out.println("�� ��: " + s);
	}

}
