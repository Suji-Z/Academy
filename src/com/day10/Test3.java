package com.day10;

class SuperD{
	
	private String title;
	protected int area;
	
	public SuperD(String title) {
		
		this.title = title;
		
	}
	
	public void print() {
		
		System.out.println(title + ":" + area);
		
	}
}

class RectD extends SuperD{
	
//	public RectD() {
//		super();		
//	}			
	 //����Ŭ���� default������ �ȿ� �������ִ� ����Ŭ����ȣ�� �޼ҵ� , super()
	//����Ŭ������ �⺻������ ������ �������� �Ű������� �ڷ����� �����ϰ� �־��ָ� ��
	//ex. super("a");
	
	
	private int w,h;
	
	public RectD(int w, int h) {
		super("�簢��");	//���ο� 1���� ���� ����
							//�θ�Ŭ���� ���� �ʱ�ȭ �� ��, �ڽ�Ŭ���� �ʱ�ȭ ����
		
		this.w = w;
		this.h = h;
		
	}
	
	public void recArea() {
		area = w*h;
	}

	
}

public class Test3 {

	public static void main(String[] args) {
		
		RectD ob = new RectD(10,20);
		
		ob.recArea();
		ob.print();
		
	}

}
