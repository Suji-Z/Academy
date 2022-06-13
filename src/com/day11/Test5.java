package com.day11;

public class Test5 {

	public static void main(String[] args) {
		
		String s1 = "서울,부산,대구";
		String ss[] = s1.split(","); // ","로 구분해서 배열에 문자를 넣음
		//ex) ss[0] = 서울, ss[1]= 부산 ss[2] = 대구
		
		for(String s : ss) {
			System.out.print(s + " ");			
		}
		
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2 == s3); //false
		System.out.println(s2.equals(s3)); //false
		System.out.println(s2.equalsIgnoreCase(s3)); //Igonrecase: 대소문자 가리지 않고 비교
		
		String s4 = "abc.def.hij";
		
		System.out.println(s4.indexOf(".")); //0부터 읽으며 해당 문자가 처음 나타나는 인덱스값
		System.out.println(s4.lastIndexOf(".")); //뒤에서부터 읽으며 해당 문자가 처음 나타나는 인덱스값
		System.out.println(s4.indexOf("def")); //4
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); //a  b  c , 앞의 공백만 제거
		System.out.println(s7.replaceAll(" ", "")); //모든 공백 null로 대체하여 제거, abc
		System.out.println(s7.replaceAll("\\s", "")); // '\\s' 정규화 표현식
		
		char ch = "abcdefg".charAt(2);	//문자열의 index 2 (0,1,2..) 를 ch에 담음
		System.out.println(ch);
		
		System.out.println("abcdefg".startsWith("abc")); //true , 해당 문자열의 시작이 " "의 문자일 경우 true
		System.out.println("자바프로그램".startsWith("자바"));
		
		System.out.println("abcdefg".length()); //7
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//사전식 정렬
		System.out.println(s8.compareTo(s9)); //-1 , 아스키코드를 기준으로 비교 (e=101, f=102), e-f = -1
		System.out.println(s9.compareTo(s8)); //1  (f-e = 1)
		
	}

}
