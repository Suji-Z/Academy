package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//����ȭ ǥ����
//�ܾ� �ٲٱ�, ���� �ּ� �˻�, ����� ����

/*
 * a[a-z]* : c�� �����ϴ� ���ܾ�
 * c[a-z] :  c�� �����ϴ� �α��� ���ܾ�
 * c[a-zA-Z0-9] : ca,cA,c4
 * c. 	  : c�� �����ϴ� �α���
 * c.* 	  : c�� �����ϴ� ��繮��
 * c.*t	  : ct, chhhht, c7777t
 */

public class Test1 {

	public static void main(String[] args) {
		
		String[] str = {"bat","baby","bonus","c","cA","ca","c0","car","combat","count","date","disc"};
		
		Pattern p;
		
		p = Pattern.compile("c[a-z]*");
		
		for(String s : str) {
			
			Matcher m = p.matcher(s);	//p�� ���İ� s�� ������ ��ġ�ϸ� ���
			if(m.matches()) {
				System.out.println(s);
			}
			
		}
		
		System.out.println("-----------------");
		
			p = Pattern.compile("c[a-z]+");		// '+' -> �ѱ��� �̻��� �ܾ ���.
		
			for(String s : str) {
			
				Matcher m = p.matcher(s);
				if(m.matches()) {
					System.out.println(s);
				}
			
			}
		
		
		System.out.println("-----------------");
		
			p = Pattern.compile("c.");	//c�� �����ϴ� �α��ڸ� ��� (cA, ca, c0)
		
			for(String s : str) {
			
				Matcher m = p.matcher(s);
				if(m.matches()) {
					System.out.println(s);
				}
			
			}
			
		String[] mails = {"aaaa@aaaa.com","@aaa.co.kr",".@bbb.cccc","aaa@vvv.co.kr","sss.co.kr","abc@abc"};
		
		// [\\w]+ : �� ���� �̻��� ��,����
		// @
		// (\\.[\\w]+)	: ��ȣ �ȿ� �ִ� ������ �ݵ�� �� ���� ��� (ex .[\\w]+ �� �� �� �̻� ���)
		// \\. : ��Ʈ
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";
		
		for(String s : mails) {
			if (Pattern.matches(pat, s)) {
				System.out.println(s);
			}
		}
		
	}

}
