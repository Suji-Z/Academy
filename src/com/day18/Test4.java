package com.day18;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test4 {

	public static void main(String[] args) throws Exception{
		
		int data;
		
		System.out.print("문자열 입력: ");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);	//보급형 writer 사용 sysout print 대체
		
		while((data=rd.read())!=-1) {
			
			wr.write(data);		//출력할 데이터를 담고있음. wirter의 buffer는 데이터가 공간 가득 차야만 출력함
			wr.flush();			//담고있던 데이터를 출력시킴
			
		}
		
		

	}

}
