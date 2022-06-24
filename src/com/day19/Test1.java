package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Event
//AWT (Abstract Window Toolkit) -> Swing -> F/X

public class Test1 extends Frame implements WindowListener{	//�⺻â�� �����ϴ� I. 'listner : ������ ����'
	
	private static final long serialVersionUID = 1L;

	public Test1() {
		
		setTitle("�ڹ� ������");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0)); 	// R G B �÷� ��ǥ �Է�
		
		addWindowListener(this);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Test1();
		

	}

	@Override
	public void windowActivated(WindowEvent e) {	//������ ���α׷� Ŭ���� ������ ���� Ȱ��ȭ�Ǵ� ����
	}

	@Override
	public void windowClosed(WindowEvent e) {	//���α׷� ��������.(���� ��)
	}

	@Override
	public void windowClosing(WindowEvent e) {	//�����Ű�� �޼ҵ� (����)
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {		//�ڷ� ������� ��Ȱ��ȭ �Ǵ� ����
	}

	@Override
	public void windowDeiconified(WindowEvent e) {	//�������� �۾���
	}

	@Override
	public void windowIconified(WindowEvent e) {	//�������� Ŀ��
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}
