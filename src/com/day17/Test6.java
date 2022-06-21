package com.day17;


//스레드 생명주기
class MyThrea6 extends Thread{
	
	@Override
	public void run() {

		try {
			System.out.println("스레드 시작");
			
			System.out.println("우선순위: " + getPriority());
			System.out.println("스레드 이름: " + getName());
			
			//0.5초
			sleep(500);

			setPriority(2); 	//우선순위 설정
			System.out.println("변경된 우선순위: " + getPriority());
			
			System.out.println("스레드 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}

public class Test6 {
	
	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();		//현재 스레드 읽어오는 메소드. 지금은 'main'
		Thread t2 = new MyThrea6();				//
		
		System.out.println("메인스레드 우선순위 확인: " + t1.getPriority());	//'5' 기본 default 우선순위는 항상'5'
		System.out.println("메인스레드 이름: " + t1.getName());
		
		System.out.println("t2.start메소드 호출 전 isAlive: " +  t2.isAlive());  //실행 전이므로 false
		
		t2.start();
		
		//t2의 우선순위
		System.out.println("t2 우선 순위: " + t2.getPriority());
		
		t2.setPriority(1);
		
		try {
			
			Thread.sleep(100);
			System.out.println("t2 살아있?: " + t2.isAlive());
			
			Thread.sleep(1000);
			System.out.println("1초 쉬고 t2 살아있?: " + t2.isAlive());
			
			t2.join();		//demon에서 기다리게 하는 메소드(여기선 main을 지연)
			
			System.out.println("t2 그래도 살아있?: " + t2.isAlive());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		System.out.println("main 종료");
	}

}
