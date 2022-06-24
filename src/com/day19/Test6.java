package com.day19;

import java.awt.BorderLayout;
import java.awt.Color;

//���콺 �̺�Ʈ

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test6 extends Frame{

	private int x,y;
	private Label lbl = new Label("",Label.CENTER);
	
	
	public Test6() {
		
		add(lbl,BorderLayout.SOUTH);
		
		addMouseListener(new MouserHandler());
		addMouseMotionListener(new MouseMotionHandler());
		
		setBackground(new Color(150, 150, 150));//����
		setForeground(new Color(0, 0, 255));	//���ڻ�
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("��ǥ���");
		setSize(400, 400);
		setVisible(true);
		
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {		//��������ġ�� ���
		String str;
		str = "(" + x + "," + y + ")";
		g.drawString(str, x, y);
		
	}


	@Override
	public void update(Graphics g) {
		paint(g);
	}

	class MouserHandler extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {	//���콺�� '���� ��' ����
			x = e.getX();
			y = e.getY();
			
			repaint();	//update ȣ��
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {	//���콺�� ������ ���� ��, ����
			
			
			
		}
		
	}
	
	class MouseMotionHandler extends MouseMotionAdapter{
		
		@Override
		public void mouseDragged(MouseEvent e) {
			
			x = e.getX();
			y = e.getY();
			
			repaint();
			
			
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
			String str = String.format("(%d, %d)", e.getX(),e.getY());
			
			lbl.setText(str);
			
		}
		
		
	}




	public static void main(String[] args) {
		
		new Test6();
		

	}

}
