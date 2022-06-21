package com.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception 클래스(예외처리)

public class Test1 {
	
	public static void main(String[] args) {
		
		int num1, num2, result;
		
		String oper;
		
		Scanner sc = new Scanner(System.in);

		try {	// try {} 에서 에러가 생기면 catch에서 error를 잡아줌	
			
			System.out.print("두개의 수 : "); // 30 40
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자 : "); // +
			oper = sc.next();
			
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
		
		} catch (InputMismatchException e) {		//각각의 오류에 대해 해당하는 메세지 출력
			System.out.println(e.toString()); 		//에러가 난 부분을 출력.
			System.out.println("정수를 입력하세요.");
			
		} catch (ArithmeticException e) {
			
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch (Exception e) {	//제일 최종 예외처리. 가장 마지막에 존재해야 함
			
//			e.printStackTrace();  //오류난 부분에 대한 정보 출력 (빨간색 에러메세지)
			System.out.println("알 수 없는 오류");
			
		}
		
		finally {	//에러 발생 여부와 상관없이 마지막줄에 출력(항상 보임)
			
		}
		

		
		
	}
}
