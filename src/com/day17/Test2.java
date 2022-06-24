package com.day17;

class MyThread2 implements Runnable{
	
	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
		
	}

	@Override
	public void run() {
		
		int i=0;
		
		while(i<num) {
			
			System.out.println(name + i);
			i++;
			
			try {
				Thread.sleep(100);	//Runnable impl�ÿ� thread.sleep()���� ��� (thread Ŭ������ �޼ҵ��̱⶧��)
				
				
			} catch (Exception e) {
				
			}
		}
		
	}
	
	
	
}

public class Test2{

	public static void main(String[] args) {
		
		System.out.println("main ����...");

		Thread t1 = new Thread(new MyThread2(100, "ù��°: "));  //Runanble impl�� ��� Runnable Target �������� ȣ��
		Thread t2 = new Thread(new MyThread2(200, "�ι�°: "));
		
		t1.start();
		t2.start();
		
		System.out.println("main ����...");
	}
}