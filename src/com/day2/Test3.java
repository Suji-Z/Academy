package com.day2;

public class Test3 {

	public static void main(String[] args) {
		int r = 10;
		float area, length;
		
		area = 10;
		System.out.println(area);

		//r = (int)20.0; //����ȯ
		//System.out.println(r);
		
		area = r*r*3.14f;
			//�ڹٴ� �Ǽ��� ������ �켱�� double(8byte)�� �ν�.
			//double ũ���� ���� 4byte float�� �� �� ���⶧���� �ڿ� f�� �ٿ� float���� �νĽ��Ѿ���
		
		length = r*2*3.14f;
		System.out.printf("������:%d, ����:%f\n", r,area);
		System.out.printf("������:%d, ����:%.2f\n", r,area);
		//printf�� %f������ ��� ������ %.2f �Ҽ��� �Ʒ� 2�ڸ������� ǥ���ϰڴٴ� �ǹ�
		System.out.println("������:" + r + ", �ѷ�:" + length);
		//println�� �Ҽ��� ���� �Ұ���
	}

}
