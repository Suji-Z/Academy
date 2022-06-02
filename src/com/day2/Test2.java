package com.day2;

public class Test2 {

	public static void main(String[] args) {
		//자료형 : int (정수)
		//num1 : 변수명
		int num1 = 20; //변수 초기화
		int num2;
		num2 = 10;
		
		int num3, num4; //쓰레기 값
		
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(num3);
		//System.out.println(num4); //컴파일 오류(쓰레기 값은 보여주지 않음)
		
		num3 = num1 + num2;
		System.out.println(num3);
		num4 = num1 - num2;
		System.out.println(num4);
		
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);
		
		num1 = 200;
		num2 = 100;
		num3 = num1 + num2;
		num4 = num1 - num2;
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);
		
		//format(형식) 안에 매개변수를 무조건 넣어줘야 함
		System.out.printf("%d+%d=%d\n", num1,num2,num3); // %d는 정수값만 출력하는 기호
		// \n %n 둘다 엔터 기능이나 \n을 더 많이 씀
		//앞 %d부터 순서대로 num1 num2 num3 값이 들어가게 됨
		System.out.printf("%d-%d=%d\n", num1,num2,num4);
		
		//%g(double) %s(String) 
	}
}
