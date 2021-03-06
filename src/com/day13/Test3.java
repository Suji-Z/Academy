package com.day13;

import java.util.Scanner;

interface FruitA{
	
	String Won = "원";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA {
	
	public String getItems();
	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
	
}

public class Test3 {

	public void packing(ItemFruit ob) {
		
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test3 t = new Test3();
		
		System.out.print("1.오렌지 2.사과 : ");
		int n = sc.nextInt();	//번호(1 or 2)
		
		if(n==1)
		
		t.packing(new Orange());		// ItemFruit ob의 ;ob'자리에 new Orange. 
										// ob = new Orange; 였기때문에
		else if (n==2)	
		
		t.packing(new Apple());
		

		
		/*
		 * int ob1;
		 * 0b 1 = 10;
		 * System.out.println(ob1);		// 10
		 * 
		 * ob1 = 20;
		 * System.out.println(ob1);		// 20
		 * 
		 * 
		 */
		
	}

}
