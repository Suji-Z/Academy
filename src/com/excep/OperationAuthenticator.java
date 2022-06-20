package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws AuthenticationException{
		
		String[] temp = str.split(",");
		
		if(temp.length!=2) {	//����ڰ� �Է��� ���� ����� �ԷµǾ����� Ȯ���ϴ� �޼ҵ�
			throw new AuthenticationException("���� �Է� ���� ����: " + str);
		}
	}
	
	@SuppressWarnings("unused") //������� �ʴ� ���������� ��� �� ó�� ����� annotation
								//�ǻ������� �ƴ�, �ܼ� üũ�� �������� ������ �����̱� ����
	public void number(String str) throws AuthenticationException{
		
		try {
			
			if(str.indexOf(".")!=-1) {	//���� ���� ������(==������) �Ǽ� (>0)
				
				double num = Double.parseDouble(str);
				
			}else {						//���� ������ ����
				int num = Integer.parseInt(str);
			}
				
			
		} catch (NumberFormatException e) {		//���� �Է°��� �����϶� ��Ÿ���� ����
			
			throw new AuthenticationException("���� ��ȯ �Ұ�: " + str);
	
		}
	}
	
	public void operator(char ch) throws AuthenticationException{
		
		switch(ch) {
		case '+' : case '-' : case '*' : case '/':
			return;
			
		default:
			throw new AuthenticationException("������ ����" + ch);
		}
		
		
		
		
		
		
	}
}
