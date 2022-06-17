package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key, value> (I)	key엔 주로 자료형,	value엔 주로 class를 사용.
//Hashtable (C)	 - Vector
//HashMap 	(C)	 - ArrayList (빠름)

//Key는 중복값을 가질 수 없음 (Key는 Set이라는 인터페이스가 자료형)
//키가 중복값을 갖게 되면 수정이 됨
//map은 Iterator가 없음.. but, set이 컬렉션이기 때문에 set의 iterator를 사용 가능
//put(데이터 추가), get(데이터 가져오기)

public class Test2 {

	public static final String tel[] = 
		{"111-111","222-222","333-333","111-111","444-444"}; //key
	
	public static final String name[] = 			
		{"배수지","유인나","정인선","강아랑","박신혜"};		//value
	
	
	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i=0; i<name.length; i++) {
			h.put(tel[i], name[i]);			//name[0]과 name[3]의 tel[i], key값이 중복이므로 자동으로 name[0]은 삭제
		}
		
		System.out.println(h);				//입력 순서와 상관없이 가장 빠른 속도로 출력가능한 데이터 순으로 출력.
		
		String str;
		str = h.get("111-111");		//key를 입력하면 해당 key의 value를 가져오는 메소드
		if(str == null) {
			System.out.println("자료 없음");
		}
		
		else {
			System.out.println(str);
		}
		
		if(h.containsKey("222-222")){		//해당 key의 값이 있으면 true, 없으면 false
											//remove 필요시 메소드로 true일때 삭제하도록 설정 가능
				System.out.println("222-222 있다.");

		} else {
			System.out.println("222-222 없다.");
		}
		
		if(h.containsValue("강아랑1")) {			//class를 value에 넣어 사용하게 될 경우엔 ex)vo.getName()을 넣어 비교
			System.out.println("강아랑 있다.");
		}else {
			System.out.println("강아랑1 없다.");
		}
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext())	{
			
			String key = it.next();		// it.next()는 key만 꺼내옴
			String value = h.get(key); //다시 get() 으로 key의 value 꺼내옴. get은 value를 반환하므로
			
			System.out.println(key + " " + value);
		}
		
		
		
		

	}
}
