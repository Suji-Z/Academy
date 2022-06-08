package com.day8;

public class Test2 {
	
	// ������ �۾� -> 'static'�� ����
	
	public static int a = 10;		//class ����
	//Ŭ���� ���� �Ǵ� Ŭ���� �޼ҵ�� Ŭ������ �ε��Ǵ� ���� (�ε� == �������� ������ �����ϴ� ��)
	//�޸� �Ҵ��� �̷������ [Ŭ�����̸�.��ü]�� ���ؼ� ���� ����
	
	//��, new�� ���ؼ� (��ü����)�޸��Ҵ��� ���� �ʾƵ� ��� �����ϴ�.
	
	
	public int b = 20;				//instance ����
	//�ν��Ͻ������� new�� ���ؼ� �޸� �Ҵ��� �޾ƾ߸� ����� �����ϰ�, Ŭ���� �޼ҵ忡���� ������ �Ұ���.

	public void write() { 		//instance �޼ҵ�.
		System.out.println("class����: "+a);
		System.out.println("instance����: "+b);
		//�ν��Ͻ� �޼ҵ� �������� Ŭ����,�ν��Ͻ� ���� �Ѵ� ��� ����
	}
	
	public static void print() { 	//class �޼ҵ�
		System.out.println("class����: "+a);
	}

	public static void main(String[] args) {
		
		System.out.println("class����: "+a);
		System.out.println("class����: "+Test2.a); //���� Ŭ���� �̸��� �ٿ��� �θ� �� O
		
		//write();
		print();
		Test2.print();            
			
		Test2 ob = new Test2(); //Ŭ������ ��ü�̸��� �����ص� O
		
		System.out.println(ob.a); //�ν��Ͻ��� ���� �������� a�� ���.. ������ �Ʒ��� ����
		System.out.println(Test2.a);
		
		ob.write();
		ob.print();
		
		Test2.print();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println("---------");
		
		Test2 ob1 = new Test2();	//2��° �ν��Ͻ� ����
		
		ob1.a = 100;
		ob1.b = 200;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println("---------");
		
		Test2 ob2 = new Test2();
		System.out.println(ob2.a);	//static a�� ���� ������ �����Ƿ� instance�� ��� �����ص� �ڸ��� �� �ø��� ����
									//�� �������� �����ϱ⶧���� �ʱ�ȭ �ϴ� ������ ���� �������
		System.out.println(ob2.b);
		
		
	}

}
