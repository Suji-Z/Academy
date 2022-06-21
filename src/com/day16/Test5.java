package com.day16;

import java.util.ArrayList;
import java.util.List;

//람다식

public class Test5 {

	public static void main(String[] args) {
		
		List<String> lists = new ArrayList<String>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		lists.add("인천");
		
		for(String str : lists) {
			System.out.print(str + " ");
		}
		
		System.out.println("\n---------------------");
		
		lists.stream()
		.forEach(a -> System.out.print(a + " ")); 	//위의 for-each 문을 람다식으료 표현
		
		System.out.println("\n---------------------");
		
		lists.stream()
		.filter(x -> x.startsWith("부산"))
		.forEach(x -> System.out.print(x + " "));
		
		System.out.println("\n---------------------");
		
		lists.stream()
		.map(x -> x + 10)
		.forEach(x -> System.out.print(x + " "));
		
		System.out.println("\n---------------------");
		
		List<Integer> lists1 = new ArrayList<>();
		
		lists1.add(10);
		lists1.add(20);
		lists1.add(30);
		lists1.add(40);
		
		for(int i=0; i<lists1.size(); i++) {
			int x = lists1.get(i);
		
			if(x % 20 != 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println("\n---------------------");
		
		lists1.stream()
		.filter(x -> x%20 !=0)
		.forEach(x -> System.out.print(x + " "));
		
		System.out.println("\n---------------------");
		
		int sum=0;
		
		sum = lists1.stream()
			  .filter(x -> x%20!=0)	//10, 30
			  .mapToInt(x -> x*2)	//10*2, 30*2 
			  .sum();				// 20+60 == 80
		
		System.out.println(sum);
		
		
		
		
		
	}
}
