package com.day18;

//Stream
//������ ����½� ��� �������� ���¿ʹ� ������� �Ϸõ� �帧���� �����͸� �����ϴ� class
//Stream�� �ܹ���(-> or <-) �帧���� �����͸� �����ϴ� Ŭ����
//���������� ������ (���� �̵��ϴ� ��)�� ���� ����

//in(.read) : �ڹ��� ���� �⺻ �Է� stream(byte stream) , out(.print) : �ڹ��� ���� �⺻ ��� stream

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		int data;
		
		System.out.print("���ڿ�: ");	//abcd
		while((data=System.in.read())!=-1) { 	//in.read�� byte ������ �����͸� �о��. �Է� stream
												//Ű����� �Է��� ���ڸ� �޾ƿ�
		
			char ch = (char)data;
			System.out.print(ch);
			
			
		}
	}

}
