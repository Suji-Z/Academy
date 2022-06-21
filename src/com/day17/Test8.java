package com.day17;

class MyThread8 implements Runnable{
	
	private int bank = 100000000;	//잔고
	public int getBank() {		//잔액 가져오기
		return bank;
	}
	
	private int drawMoney(int m) {	//인출한 금액 return
		bank -= m;
		return m;
	}
	
	//스레드 동기화
	@Override
	public void run() {
	
		int money_need = 4000;	//인출금
		int money;
		String msg = "";
		
		try {
			
			//동기화 블럭
			synchronized (this) {	//다른 스레드가 처리중에 들어올 수 없도록 Lock
				
				if(getBank()>=money_need) {
				
					money = drawMoney(money_need);
					msg = "인출 성공";
				
				}else {
					money = 0;
					msg = "인출 실패하였습니당;;";
				
				
				}
				System.out.println(Thread.currentThread().getName() +
						 msg + ",인출금액: " + money + ", 잔고: " + getBank());
			}
			
		
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}

public class Test8 {

	public static void main(String[] args) {
		
		MyThread8 ob = new MyThread8();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();	//0
		t2.start();	//1
		
		
		

	}

}
