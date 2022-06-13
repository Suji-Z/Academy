package com.day11;

//StringBuffer : ����ȭ �۾��� ����(�ӵ��� ����)
//STringBuilder : ����ȭ �۾��� ���� ����(�ӵ��� ����)

public class Test3 {
	
//	public void StringTime() {
//		
//		System.out.println("String...");
//		
////		�ý��� �ð� ����
////		long start = System.currentTimeMillis();
//		long start = System.nanoTime(); //���� �ð�
//		
//		String str = "A";
//		for(int i=1; i<50000; i++) {		//A�� �����Ϳ� �����ϱ���� �ɸ��� �ҿ�ð�
//			str += "A";
//		}
//		
//		long end = System.nanoTime(); //������ �ð�
//		
//		System.out.println("����ð�: " + (end-start) + "ms");
//	}
	
	public void stringBufferTime() { //class�� 
		System.out.println("StringBuffer...");
			
//			�ý��� �ð� ����
//			long start = System.currentTimeMillis();
			long start = System.nanoTime(); //���� �ð�
			
			StringBuffer str = new StringBuffer("A");
			
			for(int i=1; i<50000; i++) {
				str.append("A");
			}
			
			long end = System.nanoTime(); //������ �ð�
			
			System.out.println("����ð�: " + (end-start) + "ms");
		}
	
	public void stringBuilderTime() { //class�� 
		System.out.println("StringBuilder...");
			
//			�ý��� �ð� ����
//			long start = System.currentTimeMillis();
			long start = System.nanoTime(); //���� �ð�
			
			StringBuilder str = new StringBuilder("A");
			
			for(int i=1; i<50000; i++) {
				str.append("A");
			}
			
			long end = System.nanoTime(); //������ �ð�
			
			System.out.println("����ð�: " + (end-start) + "ms");
		}
	

	public static void main(String[] args) {

		Test3 ob = new Test3();
		
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
	}

}
