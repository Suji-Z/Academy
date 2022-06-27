package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//정규화 표현식
//단어 바꾸기, 메일 주소 검사, 제어문자 제거

/*
 * a[a-z]* : c로 시작하는 영단어
 * c[a-z] :  c로 시작하는 두글자 영단어
 * c[a-zA-Z0-9] : ca,cA,c4
 * c. 	  : c로 시작하는 두글자
 * c.* 	  : c로 시작하는 모든문자
 * c.*t	  : ct, chhhht, c7777t
 */

public class Test1 {

	public static void main(String[] args) {
		
		String[] str = {"bat","baby","bonus","c","cA","ca","c0","car","combat","count","date","disc"};
		
		Pattern p;
		
		p = Pattern.compile("c[a-z]*");
		
		for(String s : str) {
			
			Matcher m = p.matcher(s);	//p의 형식과 s의 내용이 일치하면 출력
			if(m.matches()) {
				System.out.println(s);
			}
			
		}
		
		System.out.println("-----------------");
		
			p = Pattern.compile("c[a-z]+");		// '+' -> 한글자 이상의 단어만 출력.
		
			for(String s : str) {
			
				Matcher m = p.matcher(s);
				if(m.matches()) {
					System.out.println(s);
				}
			
			}
		
		
		System.out.println("-----------------");
		
			p = Pattern.compile("c.");	//c로 시작하는 두글자만 출력 (cA, ca, c0)
		
			for(String s : str) {
			
				Matcher m = p.matcher(s);
				if(m.matches()) {
					System.out.println(s);
				}
			
			}
			
		String[] mails = {"aaaa@aaaa.com","@aaa.co.kr",".@bbb.cccc","aaa@vvv.co.kr","sss.co.kr","abc@abc"};
		
		// [\\w]+ : 한 글자 이상의 영,숫자
		// @
		// (\\.[\\w]+)	: 괄호 안에 있는 내용이 반드시 한 번은 사용 (ex .[\\w]+ 이 한 번 이상 사용)
		// \\. : 도트
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";
		
		for(String s : mails) {
			if (Pattern.matches(pat, s)) {
				System.out.println(s);
			}
		}
		
	}

}
