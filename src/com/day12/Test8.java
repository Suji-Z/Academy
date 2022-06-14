package com.day12;

import java.util.Scanner;

abstract class SortInt{
	
	private int[] value;	//�Է¹��� ���� �迭
	
	protected abstract void sorting(); //�߻�޼ҵ�, 
	
	public void sort(int[] value) {		//�迭 ������ �Է¹��� �޼ҵ�
		this.value = value;
		
		sorting();		//�ڸ��ٲٱ⸦ ���� ������ �ڽ�Ŭ������ �������̵� �޼ҵ� sorting�� ������ �ڸ�����
	}
	
	public int length() {		//�迭�� ���� �޼ҵ�
		if(value==null) {
			return 0;
		}
		return value.length;
					
	}
	
	protected final int compare(int i, int j) {		//��ȯ���� 1�̸� (>0), �ڸ��ٲٱ�
		if(value[i]==value[j]) {
			return 0;
		}
		else if(value[i]>value[j]) {
			return 1;
		}
		else {
			return -1;
		}
			
	}
	
	protected final void swap(int i, int j) {
		int temp;
		temp =value[i];
		value[i] = value[j];
		value[j] = temp;
		
	}
	
	public void print() {
		if(value==null) {
			return;
		}
		for(int su : value) {
			System.out.printf("%4d", su);
		}
		
		System.out.println();
		
	}
	
}

class SortTest extends SortInt{

	@Override
	protected void sorting() {
		
		//selection sort
		
		for(int i=0; i<length()-1; i++) {
			for(int j=i+1; j<length(); j++) {
				if(compare(i, j)>0) {
					
					swap(i, j);			
				}
				
				
			}
			
		}
	}
	
}

public class Test8 {

	public static void main(String[] args) {
		SortTest ob = new SortTest();
		
		int[] value = {50,30,10,70,20};
		
		ob.sort(value);
		ob.print();
		
	}

}
