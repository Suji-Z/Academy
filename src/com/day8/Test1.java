package com.day8;

import java.util.Scanner;

class Circle {
	
	//������� ������ �Է� , �ܺο����� �� �� ����(private)
	
	private int r;	//������ ����(ĸ��ȭ)
	
	//�޼ҵ带 �̿��� ��ȸ�Ͽ� private ������ �����ϱ�
	
	
	public void setData(int r) {	//int a������ ����(������)�� ������ �ԷµǰԲ�
		//���� ( )���� int r�� setData��� ������ �޼ҵ��� �Ű�����
		//������(�޼ҵ�)�� �Ű������� �ν��Ͻ� ������ �̸��� ����ȭ �ϰ� �ɰ�쿣 'this'�� �ν��Ͻ� ���� �̸��� ��������. 
	
		this.r = r;			
		//this: Ŭ����, �ڱ��ڽ�(Circle)
		
	}
	
	public double area() { //���� ���ϱ�
		
		return r*r*3.14;
		
	}
	
	public void write(double a) { //��°�,		write(double a,Circle this) ���ο��� ������ ����Ǵ� ��
		
		System.out.println("������: "+r);
		System.out.println("����: " +a);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ci = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������: ");
		int r = sc.nextInt();
		
		ci.setData(r);			//setData(r,ci)
		
		double a = ci.area();	//area(ci)
		ci.write(a);			//write(a,ci)
		
	}

}
