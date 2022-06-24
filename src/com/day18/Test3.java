package com.day18;

import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader <-> OutputStreamWriter
//1byte stream을 2byte stream으로 변환
//Bridge stream
//

public class Test3 {

	public static void main(String[] args) throws Exception{

		int data;
		System.out.print("문자열 입력: ");
		
		Reader rd = new InputStreamReader(System.in);	//bufferedreader에 불러오지 않아도 출력 가능
		
		while((data=rd.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);		//계속 입력 받으므로 ctrl+z로 종료
		}
	}

}
