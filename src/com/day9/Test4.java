package com.day9;

public class Test4 {

	int a = 5; //������ �޼ҵ� �ۿ� (Ŭ���� ����) �ܵ� ��� ����
	
	//�ʱ�ȭ �� {} �޼ҵ�� ����ڰ� ���Ƿ� �̸��� ���� ��, �ʿ��� �� �̸����� ȣ���ؼ� ���.
	// ���� �̸�X '{}' ��. ������ 1���� ȣ��ǰ� ���̻� ȣ����� �ʴ� �ڵ��� �� ��(��ü new�� ������ ������ �����)
	{
		System.out.println("�ʱ�ȭ ��a :"+a);
		a = 10;
		System.out.println("�ʱ�ȭ ��a :"+a);
	}
	
	static int b;
	static { 	//static ���� new�� ������ �ʾƵ�, �ε��� ������ '1����' ����
		
		b=10;
		System.out.println("�ʱ�ȭ ��b :"+b);
	}
	
	final int C; 	//���. ������ �� (�ٲ��� ���� ��). ����� �ʱ�ȭ�� ������ �̷�����߸� ��
					//����� �Ϲ������� '�빮��'�� ���
	
	public Test4() {	//����� �ʱ�ȭ���� �ʰ� �����ڸ� ���� ���, �����ڿ� error ǥ��
		System.out.println("������");		//�����ڴ� �ڵ��� �� ������ �ܰ�� ��µǱ⶧���� ������ ������ �ʱ�ȭ�ϵ��� ����.
		C = 100;
		System.out.println("C :" + C);
	}
	
	
	public static void main(String[] args) {

		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		//��� ����
		//static - new(instance����,�޼ҵ�) - ������
		
		
	}

}
