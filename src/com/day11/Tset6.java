package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tset6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("수식[3+5] : ");
		String str = br.readLine();
		
		str = str.replaceAll("\\s", ""); 	// i=i+1, str의 공백을 null로 처리
		
//		String[] op = {"+","-","*","/"};
		
//		for(String o : op) { 	//연산자 비교
		
			for(String op : new String[] {"+","-","*","/"})  {	//배열 선언과 for문 조건을 한번에 가능
			
				//	 012345
				//ex)123+56 
				int pos = str.indexOf(op); // 인덱스 번호를 담는 pos 변수, '+'는 예제기준 3 출력
				
				if(pos>-1) {
					
					int num1 = Integer.parseInt(str.substring(0, pos)); //str의 0부터 pos까지의 숫자 출력
					int num2 = Integer.parseInt(str.substring(pos+1));	//pos(연산자) 뒤의 숫자부터 출력
					
					int result = 0;
					char oper = str.charAt(pos); // '+' 
					
					switch(oper) {
					
					case '+':
						result = num1 + num2; break;
					case '-':
						result = num1 - num2; break;
					case '*':
						result = num1 * num2; break;
					case '/':
						result = num1 / num2; break;
						
					}
					
//					System.out.printf("%d %c %d = %d", num1, oper, num2, result);
					String s = String.format("%d %c %d = %d" , num1,oper,num2,result);	
					//format() : 사용자가 원하는 값을 저장, 이후 출력할 때 해당 포맷을 그대로 반영하여 출력
					// == printf() 와 기능 동일
					
					System.out.println(s);
					
				}
			
		}
		

	}

}
