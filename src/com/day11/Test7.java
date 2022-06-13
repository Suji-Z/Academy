package com.day11;

//Wrapper 클래스
//기본 자료형을 객체로 사용할 수 있게 해준다.

//자료형: boolean, byte, char, short, int, long, float, double

//reference(class) 자료형
//Boolean, Byte, Character, Short, Integer, Float, Double

//Auto-Boxing : (stack -> heap)
//Auto-UnBoxing : (heap -> stack)


public class Test7 {

	public static void main(String[] args) {
		
		int a = 24;
		
		System.out.println(a + 10);
		System.out.println(Integer.toString(a)+10); //문자 10과 숫자10을 더하면, 숫자도 문자로 인식하여 붙여서 출력
		System.out.println(Integer.toString(a,2));	//2진수로 출력
		System.out.println(Integer.toString(a,16));	//16진수로 변경
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1; // Auto-Boxing
		n2 = num2;
		
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);
		
		
	}

}

/*
 	int a = 10;
	float b;
		
	b = a;			 --O > 암시적 형변환(10.0)
	b = (float)a;	 --O > 명시적 형변환
	
	a = b;			 --X > 에러 (float이 범위가 더 크기때문)
	a = (int)b;		 --O > 명시적 형변환은 가능
	
----------------------------------------------------------
B(부모) - A(자식) 클래스

B = A;  	--> O UPCAST (자식 -> 부모)
B = (B)A;	--> O 명시적 UPCAST

작은거에서 큰 걸로 들어가는건 암시적으로도 가능

A = B;		--> X
A = (A)B;   --> O  명시적 DOWNCAST (부모 -> 자식)
	
*/

