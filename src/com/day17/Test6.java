package com.day17;


//������ �����ֱ�
class MyThrea6 extends Thread{
	
	@Override
	public void run() {

		try {
			System.out.println("������ ����");
			
			System.out.println("�켱����: " + getPriority());
			System.out.println("������ �̸�: " + getName());
			
			//0.5��
			sleep(500);

			setPriority(2); 	//�켱���� ����
			System.out.println("����� �켱����: " + getPriority());
			
			System.out.println("������ ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}

public class Test6 {
	
	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();		//���� ������ �о���� �޼ҵ�. ������ 'main'
		Thread t2 = new MyThrea6();				//
		
		System.out.println("���ν����� �켱���� Ȯ��: " + t1.getPriority());	//'5' �⺻ default �켱������ �׻�'5'
		System.out.println("���ν����� �̸�: " + t1.getName());
		
		System.out.println("t2.start�޼ҵ� ȣ�� �� isAlive: " +  t2.isAlive());  //���� ���̹Ƿ� false
		
		t2.start();
		
		//t2�� �켱����
		System.out.println("t2 �켱 ����: " + t2.getPriority());
		
		t2.setPriority(1);
		
		try {
			
			Thread.sleep(100);
			System.out.println("t2 �����?: " + t2.isAlive());
			
			Thread.sleep(1000);
			System.out.println("1�� ���� t2 �����?: " + t2.isAlive());
			
			t2.join();		//demon���� ��ٸ��� �ϴ� �޼ҵ�(���⼱ main�� ����)
			
			System.out.println("t2 �׷��� �����?: " + t2.isAlive());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		System.out.println("main ����");
	}

}
