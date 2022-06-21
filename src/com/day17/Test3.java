package com.day17;

import java.util.Calendar;

class TClock implements Runnable{
	
	
	private int num;
	
	@Override
	public void run() {

		while(true) {
			Calendar time = Calendar.getInstance();
			System.out.printf("%tT\n",time);

			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
			}
		}
	}
	
	
	
}

public class Test3 {

	public static void main(String[] args) {
		
		System.out.println("시작");

		Thread t = new Thread(new TClock());
		
		t.start();

		System.out.println("종료...");
		
	}
}
