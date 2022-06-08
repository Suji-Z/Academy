package com.day8;

import java.util.Scanner;

class Circle {
	
	//사용자의 반지름 입력 , 외부에서는 알 수 없음(private)
	
	private int r;	//정보의 은닉(캡슐화)
	
	//메소드를 이용한 우회하여 private 변수에 접근하기
	
	
	public void setData(int r) {	//int a변수로 정수(반지름)가 무조건 입력되게끔
		//위의 ( )안의 int r은 setData라는 생성자 메소드의 매개변수
		//생성자(메소드)의 매개변수와 인스턴스 변수의 이름을 동일화 하게 될경우엔 'this'로 인스턴스 변수 이름을 지정해줌. 
	
		this.r = r;			
		//this: 클래스, 자기자신(Circle)
		
	}
	
	public double area() { //면적 구하기
		
		return r*r*3.14;
		
	}
	
	public void write(double a) { //출력값,		write(double a,Circle this) 내부에서 실제로 실행되는 값
		
		System.out.println("반지름: "+r);
		System.out.println("넓이: " +a);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ci = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int r = sc.nextInt();
		
		ci.setData(r);			//setData(r,ci)
		
		double a = ci.area();	//area(ci)
		ci.write(a);			//write(a,ci)
		
	}

}
