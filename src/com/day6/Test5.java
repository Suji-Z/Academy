package com.day6;

import java.util.Scanner;

//�ֹε�Ϲ�ȣ �����

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

//		�ֹι�ȣ : 900110-2053126
//		index :    01234567890123  �� 14 
//		���� chk��:234567 892345
		
//		��(�ֹι�ȣ*chk��) : (9*2)+(0*3)+...+(2*5)
//		��= 11-��%11 (0-10) , ���� ù��° ������ 11-��%11. ex) 11-(18%11)
//		��= ��%10
//		��==6
//		
		
		
		String jumin;
		int[] chk = {2,3,4,5,7,8,9,2,3,4,5};
		int i,tot,n;
		
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]: ");
		jumin = sc.next();
		
		if(jumin.length()!=14) {
			System.out.println("�Է� ����");
			return;	//stop. True�� �ؿ� ���ڵ尡 �� �־ �������� ����
		}
		
		tot = 0;
		
		for(i=0; i<12; i++) {
			
			if(i>=6) {	//�ֹι�ȣ ���ڸ�
				tot += chk[i]*Integer.parseInt(jumin.substring(i+1, i+2)); // '-' �����ؾ��ؼ�..+1�� ��
			}else {		//�������
				tot += chk[i]*Integer.parseInt(jumin.substring(i, i+1)); //'�� �ܾ ��������'
				
			}
		}
		
		n = 11 - tot % 11;
		n = n % 10;
		
		if(n==Integer.parseInt(jumin.substring(13))){
			System.out.println("���ѹα� �����Դϴ�.");
			
		}else {
			System.out.println("���ѹα� ������ �ƴմϴ�.");
		}
		
		
		
		
	}

}





/*
		String str = "seoul korea";
		//index :     0123456789 10  �ڵ� ����

 		System.out.println(str.substring(0, 3)); //end index�� -1. ����� 0~2 ������
		System.out.println(str.substring(6, 8));
		System.out.println(str.substring(6)); //���� index ���� ������ ��� (6~10)
*/