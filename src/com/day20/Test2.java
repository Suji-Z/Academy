package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//replaceAll (특정 문자를 사용자가 요구하는 문자로 대체)


public class Test2 {
	
	public static String replaceAll(String str, String oldStr, String newStr) {
		
		if(str==null) {
			
			return null;
		}
		
		Pattern p = Pattern.compile(oldStr);
		
		Matcher m = p.matcher(str);		//str에서 oldstr 형식과 일치하는 문자를 찾아 변수 m에 넣음
		
		StringBuffer sb = new StringBuffer();	//긴 문자열을 사용하기 때문에 String이 아닌 buffer로 받음
												// String은 누적시 쓰레기값을 함께 누적하나 buffer는 없음. 
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);	//sb에 대체되는 newStr 값을 누적
			
		}
		
		m.appendTail(sb);	//appednTail()이 없으면 마지막으로 일치하는 문자를 찾고, 그 문자 이후의 문자열은 출력안됨
							//ex) 우리나라 大韓민국 大韓독립 大韓  까지만 출력됨. appendTail() 사용하면 마지막 대한이후 '의 건아...'도 출력
		
		return sb.toString();		//반환값이 String이 되어야 하므로 toString()으로 문자열로 반환

	}

	public static void main(String[] args) {
		
		String str = "우리나라 대한민국 대한독립 대한의 건아...";
		
		String s = Test2.replaceAll(str, "대한", "大韓");
		
		System.out.println(s);

	}

}
