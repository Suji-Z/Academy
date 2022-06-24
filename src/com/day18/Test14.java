package com.day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test14 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("c:\\doc\\out5.txt");	//파일 읽어오기
		ObjectInputStream ois =new ObjectInputStream(fis);		//직렬화된 파일로 데려오도록 ois로 감싸줌
		
		Hashtable<String, String> h =
				(Hashtable<String, String>)ois.readObject();	//object이므로.. hashtable로 형변환 필요
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + ":" + value);
		}
		
		

	}

}
