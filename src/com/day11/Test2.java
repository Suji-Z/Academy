package com.day11;

//String : 자료형이 아닌, 'class'. 자료형처럼 사용
//저장할 데이터는 크고 사용 빈도는 높기 때문에 
//String은 불변의 법칙


public class Test2 {

	public static void main(String[] args) {
		
		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1==ob2: " + (ob1==ob2));	//true
		System.out.println("ob1==ob3: " + (ob1==ob3));	//new로 새 객체를 생성, 주소값이 달라짐
		
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3)); //true
	
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));
		
		ob2 = "japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));
		
		ob2 = "china";
		System.out.println("ob1==ob2: " + (ob1==ob2));
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));
				
		
		System.out.println(ob2);	//String은 자료형처럼 쓰이기때문에 해쉬코드가 아닌 데이터자체를 출력
		
		
	}

}
