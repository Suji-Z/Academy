package com.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		
		//Set : 중복값 허용 안함
		
		Set<String> s = new HashSet<>();
		
		s.add("서울");
		s.add("부산");
		s.add("대구");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		s.add("서울");	
		System.out.println(s);		//하나만 등록됨
	
		//Stack	(Collection)	:집어넣은 데이터 역순으로 출력. Last Output
		Stack<String> st = new Stack<>();	
		
		st.push("서울");
		st.push("부산");
		
		st.add("광주");	//add도 가능
		
		while(!st.empty()) {
			System.out.print(st.pop() + " ");	
		}
		System.out.println();
		
		//Queue	(Collection)	: 	FirstOutput
		Queue<String> q = new LinkedList<>();
		
		q.offer("부산");
		q.offer("대구");
		q.add("울산");	//add 가능
		
		while(q.peek()!=null) {
			System.out.print(q.poll() + " ");
		}
			System.out.println();
			
		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		
		List<String> list2 = new LinkedList<>();
		list2.add("서울");
		list2.add("부산");
		list2.add("대구");
		
		list2.addAll(list1);	//객체 전체를 집어넣을때. addAll()
		
		System.out.println("\nlist1...");
		for(String ss : list1) {
			System.out.print(ss + " ");
		}
		
		System.out.println("\n---------");
		
		System.out.println("list2...");
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println("\n--------\n");
		
		list2.subList(2, 5).clear();		//index 2<= n <5 까지의 값 삭제
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println("\n---------\n");
		
		//배열
		String[] str = {"라","다","가","마","나","바"};
		
		for(String sss : str) {
			System.out.print(sss + " ");
		}
		System.out.println();
		
		Arrays.sort(str);	//자동 정렬 클래스 (가-하, A - Z, Collectionr.sort()는 정수값으로 반환해야함.
							// Array.sort()는 문자열 그대로 반환해서 정렬
		for(String sss : str) {
			System.out.print(sss + " ");
		}
		System.out.println();
		
		
		
		
		
		
		}
	}

