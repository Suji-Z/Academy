package com.day12;

//Singleton
//static
//��ü�� ������ �����ص� �޸� ������ 1���� ����

class Sing{
	
	private static Sing ob;
	
	public static Sing getInstance() {
		if(ob==null) {
			ob = new Sing();
		}
		return ob;
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();	//call by reference
		Sing ob2 = Sing.getInstance();
		
		if(ob1==ob2)
			System.out.println("���� ��ü�Դϴ�.");
	}

}