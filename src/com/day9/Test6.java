package com.day9;

//Call by Value
//stack������ value�� heap�������� �Ѿ

//Call by Reference
//heap������ �ּҰ� stack�������� �Ѿ ?? (value�� heap -> stack���� �Ѿ�� ����. �ּҸ�)


class Test{
	
	public int x = 10;
	
	public void sub(int a) {
		x+=a; 		//������ a�� ���� ���� ��
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value (stack���� a�� 20�� heap������ �Ѿ 'x'���� �����)
		int a = 20;
		
		System.out.println("sub()�޼ҵ� ���� �� x: " + ob.x);
		
		ob.sub(a);
		System.out.println("sub()�޼ҵ� ���� �� x: " + ob.x); 

		
		//Call by Reference
//		���� �ٸ� ������ ���� �ν��Ͻ��� �ٶ�?
		
		Test ob1;
		ob1 = ob;
		
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob1.x);
		
		ob1.x = 100;
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob1.x);
	}

}
