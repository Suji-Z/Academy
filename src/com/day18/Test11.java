package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File
//파일 및 폴더를 관리할 수 있는 기능을 제공하는 클래스
//파일 내용을 입출력 하기위한 메소드는 없다

public class Test11 {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\doc\\test.txt");		//매개변수로 경로를 가진 inputstream 변수를 넣어도 ok
		
		System.out.println("파일명: "+f.getName());
		System.out.println("파일 크기: "+f.length());
		System.out.println("파일 경로: " + f.getAbsolutePath());
		System.out.println("표준 경로: " + f.getCanonicalPath());
		System.out.println("만든날: " + new Date(f.lastModified())); //변경된 날짜를 Date의 매개변수로
		System.out.println("폴더경로: " + f.getParent());
		System.out.println("읽기속성: " + f.canRead());
		System.out.println("쓰기속성: " + f.canWrite());
		
		//** Date : '날짜'만 불러옴. calendar보다 가볍다
		
		
		
		
		
	}

}
