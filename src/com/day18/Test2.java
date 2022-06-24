package com.day18;

import java.io.IOException;
import java.io.OutputStream;

//out

public class Test2 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;	//sysout은 콘솔창으로 바로 출력해줌 (다른곳으로는 전송 x)
		
		byte[] b = new byte[3];		//buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); 	// stream은 데이터 출력 후 close() 필요.
						// close() 하는 순간 sysout도 함께 막혀 이후 콘솔창으로 출력 불가
		
		System.out.println("오잉");
	}

}
