package com.day4;

public class Test3 {

	public static void main(String[] args) {
		
		int n,s;
		s=0;
		
		//100±îÁöÀÇ ÇÕ
		for(n=1; n<=100; n++) {
			s+=n;
		}
		
		//È¦¼öÀÇ ÇÕ
		s=0;
		for(n=1; n<=100; n+=2) {
			s+=n;
		}
		
		//Â¦¼öÀÇ ÇÕ
		s=0;
		for(n=2; n<=100; n+=2) {
			s+=n;
		}
		
		int cnt = 0;
		//È¦¼öÀÇ °¹¼ö
		for(n=1;n<=100;n++) {
			if(n%2!=0) {
				cnt+=1;
			}
		}
		cnt=0;
		//Â¦¼öÀÇ °¹¼ö
		for(n=1; n<=100; n++) {
			if(n%2==0) {
				cnt+=1;
			}
		}
		
		System.out.println("È¦¼öÀÇ °¹¼ö: " + cnt);
		System.out.println("ÃÑ ÇÕ: " + s);
	}

}
