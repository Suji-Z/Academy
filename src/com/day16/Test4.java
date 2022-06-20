package com.day16;

import java.util.Scanner;

//5~10자 이내의 문자열을 입력받아서 출력하는 프로그램
//조건
//1. 5~10자 이내의 문자열
//2. 영문자만 입력

class MyAuthen extends Exception{
	
	public MyAuthen(String msg) {
		super(msg);
	}

	public MyAuthen() {
	
	}

	private static final long serialVersionUID = 1L;

	public void inputFormat(String str) throws Exception{
		
		//1. 5~10자 이내의 문자열
		//문자열의 길이는 5~10자 이내여야합니다.
	
		if(str.length()<5 || str.length()>10) {
			
			throw new MyAuthen("문자열의 길이는 5~10자 이내여야 합니다.");
		}
		int engcnt = 0;
		int numcnt = 0;
		//2. 영문자만 입력
		//영문자 입력만 가능합니다.
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);	//a b 1 2 c
//			if((ch<'A' || ch> 'Z') && (ch<'a' || ch>'z')) {
//				throw new MyAuthen("영문자만 입력 가능합니다.");
//			}
			
			//영문자 숫자 혼용

			if((ch>='A' && ch<='Z') || (ch>='a' &&  ch<='z')) {
				engcnt++;

			}
			else if(ch>='0' && ch<='9') {
				numcnt++;
			}
			
		}
		if(engcnt==0 || numcnt==0) {
			throw new MyAuthen("영문자 숫자 혼용만 가능합니다.");
		
		
		}
	}
	
	
}

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		MyAuthen auth = new MyAuthen();
		
		try {
			
			System.out.print("문자열: ");	//abcdef
			str = sc.next();
			
			auth.inputFormat(str);	//에러 검수 후 되돌아옴
			
			System.out.println(str);
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
			}

}
