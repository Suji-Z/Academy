package com.day18;

//Stream
//데이터 입출력시 모든 데이터의 형태와는 관계없이 일련된 흐름으로 데이터를 전송하는 class
//Stream은 단방향(-> or <-) 흐름으로 데이터를 전송하는 클래스
//수도꼭지의 파이프 (물이 이동하는 곳)와 같은 역할

//in(.read) : 자바의 가장 기본 입력 stream(byte stream) , out(.print) : 자바의 가장 기본 출력 stream

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		int data;
		
		System.out.print("문자열: ");	//abcd
		while((data=System.in.read())!=-1) { 	//in.read는 byte 단위로 데이터를 읽어옴. 입력 stream
												//키보드로 입력한 문자를 받아옴
		
			char ch = (char)data;
			System.out.print(ch);
			
			
		}
	}

}
