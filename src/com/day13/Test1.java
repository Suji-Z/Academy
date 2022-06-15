package com.day13;

//Interface
//1.�߻�Ŭ������ �������� ���� �ְ�, ���ǰ� ����
//2.�������̽� �ȿ��� final ������ ������ �� �ִ�.
//3.�������̽��� �����Ϸ��� implements�� ���
//4.�ϳ� �̻��� �������̽��� implements�� Ŭ������ �������̽��� ��� �޼ҵ带 ������(Overriding)�ؾ� ��
//5.�������̽��� �ٸ� �������̽��� ��ӹ��� �� ������, �̶� extends ���
//6.class�ʹ� �ٸ��� ���� ����� ����

interface Fruit {
	
	String Won = "��";	//public static final (������ ����)
	
	int getPrice();		//public abstract(����)
	public String getName();	//abstract
	
	
}

class FruitImpl implements Fruit {	//Ŭ������ ���� Ư�� �������̽��� ������ �� �� �� �ְ� (������ ��.�䰡 1���� ��)

	@Override
	public int getPrice() {
		return 1000;
	}

	
	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems() {
		return "����";
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);		//static ������ ȣ���Ҷ�, �ش� Ŭ����(�������̽�)�̸�.������
		
		Fruit ob2  = ob1;
		
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItems());   //getItems() �޼ҵ�� �ڽ�Ŭ������ �����������Ƿ� ����Ŭ�������� ��� �Ұ�
	}

}
