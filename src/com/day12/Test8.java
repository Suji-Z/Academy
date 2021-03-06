package com.day12;

import java.util.Scanner;

abstract class SortInt{
	
	private int[] value;	//입력받을 정수 배열
	
	protected abstract void sorting(); //추상메소드, 
	
	public void sort(int[] value) {		//배열 정수를 입력받을 메소드
		this.value = value;
		
		sorting();		//자리바꾸기를 실제 시행한 자식클래스의 오버라이딩 메소드 sorting을 가져와 자리정렬
	}
	
	public int length() {		//배열의 길이 메소드
		if(value==null) {
			return 0;
		}
		return value.length;
					
	}
	
	protected final int compare(int i, int j) {		//반환값이 1이면 (>0), 자리바꾸기
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
