package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//의도적으로 만드는 에러(사용자 정의 에러)

public class Test2 {

	public static String getOper() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";
		
		try {
			
			System.out.print("연산자: ");
			oper = br.readLine();  		// Exception이 존재하기때문에 throws IOException을 추가 하지 않아도 에러x
			
			if(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
				//사용자 정의 에러, 해당 연산자가 입력되지 않으면 강제로 에러 발생
				//try catch 안에 코딩
				//throws Exception 처리 필요
				throw new Exception("연산자 입력 오류");	//exception클래스 객체 생성
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println("입력 에러");
		}
		
		return oper;
		
	}
	
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, result;
		String oper;
		
		try {
			System.out.print("첫번째 수: ");
		    num1 = Integer.parseInt(br.readLine());
		    
		    System.out.print("두번째 수: ");
		    num2 = Integer.parseInt(br.readLine());
			
			oper = Test2.getOper();		//연산자만 에러 처리
			
			result = 0;
			
			if(oper.equals("+")) {
				result = num1 + num2;
			}
			
			else if(oper.equals("-")) {
				result = num1 - num2;
			}
			
			else if (oper.equals("*")) {
				result = num1 * num2;
			}
			else if (oper.equals("/")) {
				result = num1 / num2;
			}
			System.out.printf("%d %s %d = %d\n",num1,oper,num2,result);

			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
