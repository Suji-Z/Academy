package com.day17;

class MyThread8 implements Runnable{
	
	private int bank = 100000000;	//�ܰ�
	public int getBank() {		//�ܾ� ��������
		return bank;
	}
	
	private int drawMoney(int m) {	//������ �ݾ� return
		bank -= m;
		return m;
	}
	
	//������ ����ȭ
	@Override
	public void run() {
	
		int money_need = 4000;	//�����
		int money;
		String msg = "";
		
		try {
			
			//����ȭ ��
			synchronized (this) {	//�ٸ� �����尡 ó���߿� ���� �� ������ Lock
				
				if(getBank()>=money_need) {
				
					money = drawMoney(money_need);
					msg = "���� ����";
				
				}else {
					money = 0;
					msg = "���� �����Ͽ����ϴ�;;";
				
				
				}
				System.out.println(Thread.currentThread().getName() +
						 msg + ",����ݾ�: " + money + ", �ܰ�: " + getBank());
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
