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
		
		//Set : �ߺ��� ��� ����
		
		Set<String> s = new HashSet<>();
		
		s.add("����");
		s.add("�λ�");
		s.add("�뱸");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		s.add("����");	
		System.out.println(s);		//�ϳ��� ��ϵ�
	
		//Stack	(Collection)	:������� ������ �������� ���. Last Output
		Stack<String> st = new Stack<>();	
		
		st.push("����");
		st.push("�λ�");
		
		st.add("����");	//add�� ����
		
		while(!st.empty()) {
			System.out.print(st.pop() + " ");	
		}
		System.out.println();
		
		//Queue	(Collection)	: 	FirstOutput
		Queue<String> q = new LinkedList<>();
		
		q.offer("�λ�");
		q.offer("�뱸");
		q.add("���");	//add ����
		
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
		list2.add("����");
		list2.add("�λ�");
		list2.add("�뱸");
		
		list2.addAll(list1);	//��ü ��ü�� ���������. addAll()
		
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
		
		list2.subList(2, 5).clear();		//index 2<= n <5 ������ �� ����
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println("\n---------\n");
		
		//�迭
		String[] str = {"��","��","��","��","��","��"};
		
		for(String sss : str) {
			System.out.print(sss + " ");
		}
		System.out.println();
		
		Arrays.sort(str);	//�ڵ� ���� Ŭ���� (��-��, A - Z, Collectionr.sort()�� ���������� ��ȯ�ؾ���.
							// Array.sort()�� ���ڿ� �״�� ��ȯ�ؼ� ����
		for(String sss : str) {
			System.out.print(sss + " ");
		}
		System.out.println();
		
		
		
		
		
		
		}
	}

