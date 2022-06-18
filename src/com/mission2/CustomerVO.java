package com.mission2;

public class CustomerVO {
	
	private String name;
	private int t,p,sum;
	private int tot;
	private int tPrice;
	private int pPrice;
	
	public int getT() {
		return t;
	}
	
	public void setT(int t) {
		this.t = t;
	}
	
	public int getP() {
		return p;
	}
	
	public void setP(int p) {
		this.p = p;
	}
	
	public int gettPrice() {
		
		return t*20000;
	}

	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}

	public int getpPrice() {
		return p*30000;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSum() {
		return tPrice+pPrice;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getTot() {
		if(getSum()>=100000) {
			return (int) (sum*0.9);
		}
		return sum;
	}
	
	public int setTot(int tot) {
		return this.tot = tot;
		
	}

}
