package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame{
	
	public Test2() {
		
		setTitle("������");
		setSize(200, 300);
						
						//class�� ������ ��ü�����Ͽ� ���
		addWindowListener(new MyWindowAdapter()); 	//���� public class���� windowlistner�� �������� �ʾұ⶧����
													//������ ���� class(adapter)�� �����Ͽ� �޼ҵ� ��뿩�� �ǵ�
		setVisible(true);	//���������� ���α׷��� ���̰� ���ִ� �޼ҵ�			
	}
	
	//����Ŭ����
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}
	

	public static void main(String[] args) {
	
		new Test2();

	}
}
