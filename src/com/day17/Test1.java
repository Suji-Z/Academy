package com.day17;

class MyThread1 extends Thread{

	private int num;
	private String name;
	
	public MyThread1(int num, String name) {
	
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {		//**�ݵ�� try�� ���. �۾� ó�� ������ �������ֱ� ����
		
		int i=0;
		
		while(i<num) {
			
			System.out.println(this.getName() + ":" + name + i);
			i++;
			
			try {
				sleep(100);  //1000 : 1��. ���� ���� 0.1�ʾ� �־� ������ ��µǵ��� ����
			} catch (Exception e) {
				
			}
		}
	}
}


public class Test1 {

	public static void main(String[] args) {
		System.out.println("main ����...");
		MyThread1 t1 = new MyThread1(100, "ù��°: ");	//0~99���� �ݺ�
		MyThread1 t2 = new MyThread1(200, "�ι�°: ");	//0~199���� �ݺ�
		
		t1.start();	//thread ����. ->����Ǹ� �ڵ����� run()�޼ҵ� ����
		t2.start();
		
		System.out.println("main ����...");
	}
}



