package com.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test5 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;		//���̺��� 5��, �ؽ�Ʈ�ʵ�4��

	private TextField[] tf = new TextField[4];
	private Label result = new Label("", Label.LEFT);	//���� ����(�ؽ�Ʈ�� Null��)
	
	private Button btn1, btn2;
	
	public Test5() {
		
		String[] title = {"�̸�","����","����","����","����"};
		setTitle("����ó��");
		
		setLayout(null);	// 0.0���� ���۵ǵ��� ��ǥ ����.(��ǥ�� �������� ������ �� null �Է� �ʿ�)
		
		for(int i=0; i<5; i++) {
			
			Label lbl = new Label();	//��ü 5�� ����
			lbl.setText(title[i]);
			
			lbl.setBounds(10, (i+1)*30, 50, 40);
			
			add(lbl);	//�������� form�� add�� �� �־��ֱ�
	
		
			if(i<4) {
				
				tf[i] = new TextField();
				tf[i].setBounds(80, (i+1)*30, 70, 20);
				tf[i].addKeyListener(new KeyHandler());	//0~3������ Ű���帮���� ����
				
				add(tf[i]);
				
			}
			else {
				result.setBounds(80, (i+1)*30, 70, 20);
				add(result);
			}
			
		}
		
		//�����ư
		btn1 = new Button("���");
		btn1.setBounds(180, 40, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());	//���� �ν� �� ����� ����ǵ��� Ű���帮���� ����
		
		
		
		//�����ư
		btn2= new Button("����");
		btn2.setBounds(180, 70, 60, 20);
		add(btn2);
		btn2.addActionListener(this);
		

	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(260, 200);
		setResizable(false); 	//�ִ�ȭ â ��Ȱ��ȭ
		setVisible(true);
		
	}
	

	
	public static void main(String[] args) {

		new Test5();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object ob = e.getSource();	//btn1 or btn2 or others...
		
		if(ob instanceof Button) {
			
			Button b = (Button)ob;
			
			if(b==btn1) {	//����
				
				execute();
				
				
			}else if (b==btn2) {	//����
				
				System.exit(0);
			}
			
		}
	
	}
	
	private void execute() {
		
		int tot = 0;
		try {

			for(int i=1; i<=3; i++) {
				
				tot += Integer.parseInt(tf[i].getText());
			}
			
			result.setText(Integer.toString(tot));
			//result.setText(""+tot);
			
		} catch (Exception e2) {
			result.setText("�Է� ����");
		}
	}
	
	
	
	
	class KeyHandler extends KeyAdapter{	//Ű���� ����� ���, ���� �Է½� ���� tf, btn�� ����ǵ���

		@Override
		public void keyPressed(KeyEvent e) {	//Ű�� '������' �� 
			
			Object ob = e.getSource();
			
			if(e.getKeyCode()!=KeyEvent.VK_ENTER) {		//enter�� ������ �ʾ��� ���
				
				return;
			} else {
				//enter 
				//������� ���� 
				
				if(ob instanceof Button) {
					
					Button b = (Button)ob;
					
					if(b==btn1) {
						
						execute();
				
					}
					//�ƴϸ� return
					return;
					
				}
				//TextField���� ����
				
				if(ob instanceof TextField) {
					
					TextField t = (TextField)ob;
					
					for(int i=0; i<tf.length;i++) {
						
						if(i!=3 && tf[i]==t) {
							tf[i+1].requestFocus();
							return;
							
						}else if(tf[3]==t) {
							btn1.requestFocus();
							return;
						}
					}
					
					
				}
			}
		}	
	}
	
}
