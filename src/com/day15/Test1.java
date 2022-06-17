package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		Iterator<String> it = lists.iterator();
		while(it.hasNext()) {
			String str = it.next();
			
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		//ListsIterator 
		ListIterator<String> it1 = lists.listIterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println();
		
		
		while(it1.hasPrevious()) {		//역순으로 출력 (reverse)
			System.out.print(it1.previous() + " ");
		}
		System.out.println();
		
		List<String> lists1 = new ArrayList<>();
		
		lists1.addAll(lists);	//List를 쓸땐 addAll로
		lists1.add("인천");		
		
		int n = lists1.indexOf("부산");	// n=1. 이때 해당 변수 뒤에 변수를 추가하고 싶다면 n+1에 추가
		lists1.add(n+1, "광주");
		
		for(String s : lists1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		String str;
		Iterator<String> it2 = lists1.iterator();
		while(it2.hasNext()) {
			
			str =it2.next();
			if(str.startsWith("부")) {	//해당 word로 시작하는 변수가 있는지 탐색 but, 클래스가 들어갈 경우엔 사용불가
										// int 혹은 String과 같은 특정 자료형이 있는 경우에만 탐색 가능
										// 단일 자료형의 문자형
										// 클래스를 이용하고 싶은 경우엔 vo.get(name).start- 식으로 ..탐색
				System.out.println(str);
			}
		}
		
	}

}
