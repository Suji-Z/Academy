package com.day11;

//String : �ڷ����� �ƴ�, 'class'. �ڷ���ó�� ���
//������ �����ʹ� ũ�� ��� �󵵴� ���� ������ 
//String�� �Һ��� ��Ģ


public class Test2 {

	public static void main(String[] args) {
		
		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1==ob2: " + (ob1==ob2));	//true
		System.out.println("ob1==ob3: " + (ob1==ob3));	//new�� �� ��ü�� ����, �ּҰ��� �޶���
		
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3)); //true
	
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));
		
		ob2 = "japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));
		
		ob2 = "china";
		System.out.println("ob1==ob2: " + (ob1==ob2));
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));
				
		
		System.out.println(ob2);	//String�� �ڷ���ó�� ���̱⶧���� �ؽ��ڵ尡 �ƴ� ��������ü�� ���
		
		
	}

}
