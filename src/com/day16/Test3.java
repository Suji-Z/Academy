package com.day16;

class MyException extends Exception {

//	private static final long serialVersionUID = 1L;	//exception class 파일이 크기때문에 이클립스자체에서 용량 설정위해 자동 생성하는 문구
	
	public MyException(String msg) {
		
		super(msg); //new Exception("연산자 입력 오류"); 와 동일한 작업
					//오버로딩된 생성자로 객체가 생성되어 msg값을 입력받음	
	}
	
}

public class Test3 {

	private int value;
	
	public void setValue1(int value) throws MyException{		
		
		//direct로 Exception을 사용하는것이 아니므로, try{}catch문 불필요
		
		if(value < 0) {
			throw new MyException("수는 0보다 작을 수 없습니다.");
		}else {
			this.value = value;		//작지 않을 경우, 입력받은 value값을 기존 value에 초기화
		}
	
	}
	
	public void setValue2(int value) throws MyException{		
		
		//direct로 Exception을 사용하는것이 아니므로, try{}catch문 불필요
		
		if(value > 10) {
			throw new MyException("수는 10보다 클 수 없습니다.");
		}else {
			this.value = value;		//작지 않을 경우, 입력받은 value값을 기존 value에 초기화
		}
	
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		
		Test3 ob = new Test3();
		
		try {
//			ob.setValue1(-20);
			ob.setValue2(20);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println(ob.getValue());
	}

}
