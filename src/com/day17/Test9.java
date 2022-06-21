package com.day17;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//������ �ð����� Ư�� �۾��� ����


public class Test9 extends Thread {

	private int num=0;
	
	public Test9() {
		
		TimerTask task = new TimerTask() {	//���� ����
			
			@Override
			public void run() {		//�ݺ� ������ �۾�
				
				num = 0;
				
			}
		};
		
		Timer t = new Timer();		//Timer�� �ð� ����
		
		Calendar now = Calendar.getInstance();
		
		/*
		//���� 0�� 0�� 0�ʺ��� �Ϸ翡 �ѹ��� �ݺ�
		now.add(Calendar.DATE, 1);
		now.set(Calendar.HOUR, 0); 	//���� 1��: 13
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);	
		now.set(Calendar.MILLISECOND, 0);	//'��'�� ǥ���� ���� �׻� 'Millisecond'�� �Բ� �ڵ�
		t.schedule(task, now.getTime(), 1000*60*60*24);//�и�����, ��, ��, �� (24�ð����� ����)
		
		*/
		
		t.schedule(task, now.getTime(), 5000); //5sec
	}
	
	@Override
	public void run() {			
		while(true) {
			
			System.out.println(num++);	//1�ʿ� 0���� ++; �� 5�ʸ��� �ʱ�ȭ (0~4,0~4 �ݺ�)
			
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
