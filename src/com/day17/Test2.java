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
				Thread.sleep(100);	//Runnable impl시엔 thread.sleep()으로 사용 (thread 클래스의 메소드이기때문)
				
				
			} catch (Exception e) {
				
			}
		}
		
	}
	
	
	
}

public class Test2{

	public static void main(String[] args) {
		
		System.out.println("main 시작...");

		Thread t1 = new Thread(new MyThread2(100, "첫번째: "));  //Runanble impl인 경우 Runnable Target 형식으로 호출
		Thread t2 = new Thread(new MyThread2(200, "두번째: "));
		
		t1.start();
		t2.start();
		
		System.out.println("main 종료...");
	}
}
