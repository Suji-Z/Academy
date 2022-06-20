package com.day16;

class MyException extends Exception {

//	private static final long serialVersionUID = 1L;	//exception class ������ ũ�⶧���� ��Ŭ������ü���� �뷮 �������� �ڵ� �����ϴ� ����
	
	public MyException(String msg) {
		
		super(msg); //new Exception("������ �Է� ����"); �� ������ �۾�
					//�����ε��� �����ڷ� ��ü�� �����Ǿ� msg���� �Է¹���	
	}
	
}

public class Test3 {

	private int value;
	
	public void setValue1(int value) throws MyException{		
		
		//direct�� Exception�� ����ϴ°��� �ƴϹǷ�, try{}catch�� ���ʿ�
		
		if(value < 0) {
			throw new MyException("���� 0���� ���� �� �����ϴ�.");
		}else {
			this.value = value;		//���� ���� ���, �Է¹��� value���� ���� value�� �ʱ�ȭ
		}
	
	}
	
	public void setValue2(int value) throws MyException{		
		
		//direct�� Exception�� ����ϴ°��� �ƴϹǷ�, try{}catch�� ���ʿ�
		
		if(value > 10) {
			throw new MyException("���� 10���� Ŭ �� �����ϴ�.");
		}else {
			this.value = value;		//���� ���� ���, �Է¹��� value���� ���� value�� �ʱ�ȭ
		}
	
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		
		Test3 ob = new Test3();
		
		try {
//			ob.setValue1(-20);
			ob.setValue2(20);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println(ob.getValue());
	}

}
