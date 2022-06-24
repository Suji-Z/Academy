package com.day19;

import java.awt.BorderLayout;
import java.awt.Color;

//마우스 이벤트

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
		
		setBackground(new Color(150, 150, 150));//배경색
		setForeground(new Color(0, 0, 255));	//글자색
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("좌표출력");
		setSize(400, 400);
		setVisible(true);
		
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {		//지정한위치에 출력
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
		public void mousePressed(MouseEvent e) {	//마우스를 '누를 때' 실행
			x = e.getX();
			y = e.getY();
			
			repaint();	//update 호출
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {	//마우스를 눌렀다 땠을 때, 실행
			
			
			
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
