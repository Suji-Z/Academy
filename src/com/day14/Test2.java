package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {
	
	private static String city[] = {"서울","부산","대구","인천","광주","대전","울산"};

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();	//원래 생성자에도 자료형 < >를 붙어주어야 하나 생략 가능.
		
		System.out.println("초기 용량: " + v.capacity()); //capacity() 초기용량 확인. 초기용량은 '10' 
		
		for(String c : city) {	//string c에 city 배열 담음
			
			v.add(c);	//변수를 넣어줄땐 add() 로. 꺼낼땐 get()
			
		}
		
		//v.add(10); 데이터타입을 string으로 지정하여 이 외 데이터타입 변수는 들어갈 수 없음
		
		String str;
		
		str = v.firstElement(); //첫번째 호출
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();  // 마지막 호출
		System.out.println(str);
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
			
		}
		
		System.out.println();
		
		for(String c : v) {			//collection도 배열처럼 for-each문으로 변수에 담아 사용 가능
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		//---------------------------------
		//반복자. collection의 자체 for문 용도
		Iterator<String> it = v.iterator();		//vector자체의 iterator()메소드로 값을 해당 Iterator인.페에 저장
		while(it.hasNext()) {	//hasNext() : 데이터가 있을때 까지의 의미
			
			str = it.next();	//1개만 꺼냄. 반복. 실제로 꺼내오는 개념이므로 다 출력하고나면 it 값은 Null이 됨. 초기화.
			System.out.print(str + " ");
			
		}
		
		//한번 더 반복하고 싶을 땐 이미 it는 'Null' 값만 존재하므로 미출력.. 텅 비어있음
		//인터페이스를 한번 더 호출해서 vector의 값을 다시 담아주어야함.
		
		while(it.hasNext()) {		
		
			str = it.next();	
			System.out.print(str + " ");
			
		}
		
		System.out.println();
		
		//변경
		v.set(0, "Seoul");		//기존 저장된 자릿값의 변수들만 각각 새로 세팅.
		v.set(1, "Busan");	
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		//삽입
		v.insertElementAt("대한민국", 0);		//특정 인덱스값에 새로운 변수 추가.
		System.out.println(v.size() + "개");	//기존 개수 7개 -> 8개로 증가
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//검색
		int idx = v.indexOf("대구"); //index번호 찾기. indexOf는 자동 정수 출력이므로 int 정수형
		if(idx != -1) {
			System.out.println("검색 성공! : " + idx);
		}
		else
			System.out.println("검색 실패.. : " + idx);
		
		//오름차순
		Collections.sort(v);	//문자열일경우 A - Z , ㄱ - ㅎ 

		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//내림차순
		Collections.sort(v, Collections.reverseOrder()); 	// 'c' 비교정렬 값 입력. 역순 정렬 메소드 reverseOrder()		
		//Comparator 'c' 값은 수동 입력도 가능
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//삭제
		v.remove("Busan"); //인덱스 번호 혹은 변수 직접 입력하여 삭제.
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 개수: " +  v.capacity());
		System.out.println("데이터 개수: " + v.size());
		
		//공간 증가
		for(int i=1; i<=20; i++) {
			v.add(Integer.toString(i));	//정수를 string으로 반환해주는 메소드 toString() 사용하여 증가
		}
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("공간 개수: " +  v.capacity());	
		System.out.println("데이터 개수: " + v.size());
		
		
		//범위 삭제
		for(int i=1; i<=10; i++) {
			v.remove(5);		// 5번째 인덱스를 10번 지우기를 반복 (5번 한번 지우면 6번이 땡겨와 5번이되고 또 삭제)
		}
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("공간 개수: " +  v.capacity());	
		System.out.println("데이터 개수: " + v.size());
		
		//빈 공간 삭제
		v.trimToSize();
		System.out.println("공간 개수: " +  v.capacity());	
		System.out.println("데이터 개수: " + v.size());
		
		//모든 데이터 삭제	(공간은 그대로)
		v.clear();
		System.out.println("공간 개수: " +  v.capacity());	
		System.out.println("데이터 개수: " + v.size());
		
	}

}
