package com.day17;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//정해진 시간마다 특정 작업을 수행


public class Test9 extends Thread {

	private int num=0;
	
	public Test9() {
		
		TimerTask task = new TimerTask() {	//정렬 기준
			
			@Override
			public void run() {		//반복 실행할 작업
				
				num = 0;
				
			}
		};
		
		Timer t = new Timer();		//Timer로 시간 설정
		
		Calendar now = Calendar.getInstance();
		
		/*
		//내일 0시 0분 0초부터 하루에 한번씩 반복
		now.add(Calendar.DATE, 1);
		now.set(Calendar.HOUR, 0); 	//오후 1시: 13
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);	
		now.set(Calendar.MILLISECOND, 0);	//'초'를 표기할 때는 항상 'Millisecond'도 함께 코딩
		t.schedule(task, now.getTime(), 1000*60*60*24);//밀리세컨, 초, 분, 시 (24시간마다 실행)
		
		*/
		
		t.schedule(task, now.getTime(), 5000); //5sec
	}
	
	@Override
	public void run() {			
		while(true) {
			
			System.out.println(num++);	//1초에 0부터 ++; 단 5초마다 초기화 (0~4,0~4 반복)
			
			try {
				sleep(1000);
			} catch (Exception e) {
		
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
				
			new Test9().start();
	}

}
