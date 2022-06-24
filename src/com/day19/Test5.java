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

	private static final long serialVersionUID = 1L;		//레이블은 5개, 텍스트필드4개

	private TextField[] tf = new TextField[4];
	private Label result = new Label("", Label.LEFT);	//왼쪽 정렬(텍스트는 Null값)
	
	private Button btn1, btn2;
	
	public Test5() {
		
		String[] title = {"이름","국어","영어","수학","총점"};
		setTitle("성적처리");
		
		setLayout(null);	// 0.0부터 시작되도록 좌표 설정.(좌표를 수동으로 넣을땐 꼭 null 입력 필요)
		
		for(int i=0; i<5; i++) {
			
			Label lbl = new Label();	//객체 5개 생성
			lbl.setText(title[i]);
			
			lbl.setBounds(10, (i+1)*30, 50, 40);
			
			add(lbl);	//마지막에 form에 add로 값 넣어주기
	
		
			if(i<4) {
				
				tf[i] = new TextField();
				tf[i].setBounds(80, (i+1)*30, 70, 20);
				tf[i].addKeyListener(new KeyHandler());	//0~3까지의 키보드리스너 생성
				
				add(tf[i]);
				
			}
			else {
				result.setBounds(80, (i+1)*30, 70, 20);
				add(result);
			}
			
		}
		
		//결과버튼
		btn1 = new Button("결과");
		btn1.setBounds(180, 40, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());	//엔터 인식 후 결과가 실행되도록 키보드리스너 생성
		
		
		
		//종료버튼
		btn2= new Button("종료");
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
		setResizable(false); 	//최대화 창 비활성화
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
			
			if(b==btn1) {	//연산
				
				execute();
				
				
			}else if (b==btn2) {	//종료
				
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
			result.setText("입력 오류");
		}
	}
	
	
	
	
	class KeyHandler extends KeyAdapter{	//키보드 어댑터 사용, 엔터 입력시 다음 tf, btn이 실행되도록

		@Override
		public void keyPressed(KeyEvent e) {	//키를 '눌렀을' 때 
			
			Object ob = e.getSource();
			
			if(e.getKeyCode()!=KeyEvent.VK_ENTER) {		//enter가 눌리지 않았을 경우
				
				return;
			} else {
				//enter 
				//결과에서 엔터 
				
				if(ob instanceof Button) {
					
					Button b = (Button)ob;
					
					if(b==btn1) {
						
						execute();
				
					}
					//아니면 return
					return;
					
				}
				//TextField에서 엔터
				
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
