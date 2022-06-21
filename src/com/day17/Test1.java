package com.day17;

class MyThread1 extends Thread{

	private int num;
	private String name;
	
	public MyThread1(int num, String name) {
	
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {		//**반드시 try문 사용. 작업 처리 순서를 지정해주기 위해
		
		int i=0;
		
		while(i<num) {
			
			System.out.println(this.getName() + ":" + name + i);
			i++;
			
			try {
				sleep(100);  //1000 : 1초. 실행 텀을 0.1초씩 주어 번갈아 출력되도록 설정
			} catch (Exception e) {
				
			}
		}
	}
}


public class Test1 {

	public static void main(String[] args) {
		System.out.println("main 시작...");
		MyThread1 t1 = new MyThread1(100, "첫번째: ");	//0~99까지 반복
		MyThread1 t2 = new MyThread1(200, "두번째: ");	//0~199까지 반복
		
		t1.start();	//thread 시작. ->실행되면 자동으로 run()메소드 실행
		t2.start();
		
		System.out.println("main 종료...");
	}
}



