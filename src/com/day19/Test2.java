package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame{
	
	public Test2() {
		
		setTitle("윈도우");
		setSize(200, 300);
						
						//class는 무조건 객체생성하여 사용
		addWindowListener(new MyWindowAdapter()); 	//현재 public class에선 windowlistner를 구현하지 않았기때문에
													//별개로 만든 class(adapter)를 감시하여 메소드 사용여부 판독
		setVisible(true);	//실질적으로 프로그램을 보이게 해주는 메소드			
	}
	
	//내부클래스
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
