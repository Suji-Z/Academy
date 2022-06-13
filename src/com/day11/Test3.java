package com.day11;

//StringBuffer : 동기화 작업을 지원(속도가 느림)
//STringBuilder : 동기화 작업을 지원 안함(속도가 빠름)

public class Test3 {
	
//	public void StringTime() {
//		
//		System.out.println("String...");
//		
////		시스템 시간 설정
////		long start = System.currentTimeMillis();
//		long start = System.nanoTime(); //시작 시간
//		
//		String str = "A";
//		for(int i=1; i<50000; i++) {		//A를 데이터에 누적하기까지 걸리는 소요시간
//			str += "A";
//		}
//		
//		long end = System.nanoTime(); //끝나는 시간
//		
//		System.out.println("실행시간: " + (end-start) + "ms");
//	}
	
	public void stringBufferTime() { //class형 
		System.out.println("StringBuffer...");
			
//			시스템 시간 설정
//			long start = System.currentTimeMillis();
			long start = System.nanoTime(); //시작 시간
			
			StringBuffer str = new StringBuffer("A");
			
			for(int i=1; i<50000; i++) {
				str.append("A");
			}
			
			long end = System.nanoTime(); //끝나는 시간
			
			System.out.println("실행시간: " + (end-start) + "ms");
		}
	
	public void stringBuilderTime() { //class형 
		System.out.println("StringBuilder...");
			
//			시스템 시간 설정
//			long start = System.currentTimeMillis();
			long start = System.nanoTime(); //시작 시간
			
			StringBuilder str = new StringBuilder("A");
			
			for(int i=1; i<50000; i++) {
				str.append("A");
			}
			
			long end = System.nanoTime(); //끝나는 시간
			
			System.out.println("실행시간: " + (end-start) + "ms");
		}
	

	public static void main(String[] args) {

		Test3 ob = new Test3();
		
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
	}

}
