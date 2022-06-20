package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws AuthenticationException{
		
		String[] temp = str.split(",");
		
		if(temp.length!=2) {	//사용자가 입력한 값이 제대로 입력되었는지 확인하는 메소드
			throw new AuthenticationException("숫자 입력 형식 오류: " + str);
		}
	}
	
	@SuppressWarnings("unused") //사용하지 않는 변수에대한 노란 줄 처리 지우는 annotation
								//실사용목적이 아닌, 단순 체크할 목적으로 설정한 변수이기 때문
	public void number(String str) throws AuthenticationException{
		
		try {
			
			if(str.indexOf(".")!=-1) {	//점이 없지 않으면(==있으면) 실수 (>0)
				
				double num = Double.parseDouble(str);
				
			}else {						//점이 없으면 정수
				int num = Integer.parseInt(str);
			}
				
			
		} catch (NumberFormatException e) {		//숫자 입력값이 오류일때 나타나는 에러
			
			throw new AuthenticationException("숫자 변환 불가: " + str);
	
		}
	}
	
	public void operator(char ch) throws AuthenticationException{
		
		switch(ch) {
		case '+' : case '-' : case '*' : case '/':
			return;
			
		default:
			throw new AuthenticationException("연산자 오류" + ch);
		}
		
		
		
		
		
		
	}
}
