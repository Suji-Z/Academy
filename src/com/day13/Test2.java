package com.day13;

interface Test{
	
	public int total();

	public void write();
	
}

class TestImpl implements Test{

	private String hak, name;
	private int kor, eng;
	
	public TestImpl(String hak, String name, int kor, int eng) {	//�����ڷ� �ʱ�ȭ
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void set(String hak, String name, int kor, int eng) {	
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak + ":" + name + ":" +total());
	}

	@Override
	//objectŬ������ equals �޼ҵ带 ������ overriding
	public boolean equals(Object ob) {		// TestImpl ob1.equals(ob2)  TestImpl
											//object�� �ڽ� ob2�� Object ������ �� upcast
		boolean flag = false; 	//�⺻��
		
		if(ob instanceof TestImpl) {	//ob (ob2)�� ���� ������Ÿ����? == TestImpl
			TestImpl t = (TestImpl)ob;	// object������ ob(ob2)�� �ٽ� TestImpl�� ����ȯ downcast, t = ob2
			
			if(this.hak.equals(t.hak)&&name.equals(t.name)) { 
				//equals�� String hak�� �޼ҵ�� ���� �ּҰ� �ƴ� ������Ÿ�� ��ü�� ��
				flag = true;
			}	
		}
		return flag;
	}
	
	
	
	
}

public class Test2 {

	public static void main(String[] args) {
		
		//�������̽� = new Ŭ����
		//�������̽� �ȿ� �ִ� �޼ҵ��θ� ��� �������� ���� ������ ����
		
		Test ob1 = new TestImpl("1111", "�����", 80, 90);	//����� �޼ҵ尡 �θ��� �޼ҵ�� �����ϱ⶧���� ����
		Test ob2 = new TestImpl("1111", "�����", 100, 100);	//new�� ���� ��ü������ �߱⶧����, �ٸ� �ּҷ� �ν�
		
		if(ob1.equals(ob2)) //Object�� �޼ҵ� equals() , ob1�� ob2�� ������?
			System.out.println("ob1�� ob2�� ���� �ι�..");
		else
			System.out.println("ob1�� ob2�� �ٸ� �ι�..");
		
		ob1.write();
		ob2.write();

	}

}
