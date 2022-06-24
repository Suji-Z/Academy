package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception{
	
		FileOutputStream fos = new FileOutputStream("c:\\doc\\out6.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new MyData("배수지", 30));
		oos.writeObject(new MyData("유인나", 40));
		oos.writeObject(new MyData("정인선", 30));
		oos.writeObject(new MyData("정인아", 32));
		
		oos.close();
		fos.close();
		
		//역직렬화
		
		FileInputStream fis = new FileInputStream("c:\\doc\\out6.txt");
		// out6에 oos로 출력해놓은 MyData 객체들을 다시 fis로 읽어옴  
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyData ob = null;
		
		try {
			
			while(true) {
				
				ob = (MyData)ois.readObject(); 	//ois 객체들의 자료형이 mydata이므로 object -> MyData로 형변환
				
				if(ob==null)
					break;
				
				System.out.println(ob.toString());	//객체들이 private로 선언되었기때문에 toString()으로 overriding 후 호출
			}	
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			ois.close();
			fis.close();
			
		
	}
}
