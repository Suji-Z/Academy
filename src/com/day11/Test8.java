package com.day11;

import java.util.Scanner;

class Sum {
	
	protected int num1, num2, result;
	protected String oper;
	
	public void write() {
		
		System.out.printf("%d %s %d = %d", num1,oper,num2,result);
	}
}


class Calc extends Sum{
		Scanner sc = new Scanner(System.in);

		public void cal()	{
		
			System.out.print("수식 입력: ");
			String str = sc.next();
			
			String op[] = {"+","-","*","/"};
			
			for(int i=0; i<op.length; i++) {
				
				int cnt = str.indexOf(op[i]);

				if(cnt>-1) {
					
					this.num1 = Integer.parseInt(str.substring(0, cnt));
					this.num2 = Integer.parseInt(str.substring(cnt+1));
					
					this.result = 0;
					this.oper = str.valueOf(str.charAt(cnt));
					
					switch(oper) {
					
					case "+":
						result = num1 + num2; break;
					case "-":
						result = num1 - num2; break;
					case "*":
						result = num1 * num2; break;
					case "/":
						result = num1 / num2; break;
						
					}
					
				}
				
			}
		
	}
	
	
}


public class Test8 {

	public static void main(String[] args) {
		
		Calc ob = new Calc();
		
		ob.cal();
		ob.write();

	}

}
