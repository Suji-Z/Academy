package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Event
//AWT (Abstract Window Toolkit) -> Swing -> F/X

public class Test1 extends Frame implements WindowListener{	//기본창을 관리하는 I. 'listner : 감시자 역할'
	
	private static final long serialVersionUID = 1L;

	public Test1() {
		
		setTitle("자바 윈도우");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0)); 	// R G B 컬러 좌표 입력
		
		addWindowListener(this);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Test1();
		

	}

	@Override
	public void windowActivated(WindowEvent e) {	//윈도우 프로그램 클릭시 앞으로 나와 활성화되는 상태
	}

	@Override
	public void windowClosed(WindowEvent e) {	//프로그램 완전종료.(종료 후)
	}

	@Override
	public void windowClosing(WindowEvent e) {	//종료시키는 메소드 (과정)
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {		//뒤로 사라지며 비활성화 되는 상태
	}

	@Override
	public void windowDeiconified(WindowEvent e) {	//아이콘이 작아짐
	}

	@Override
	public void windowIconified(WindowEvent e) {	//아이콘이 커짐
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}
