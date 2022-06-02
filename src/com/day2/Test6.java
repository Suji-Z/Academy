package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test6 {

	public static void main(String[] args) throws IOException {
		//πÿ∫Ø(w)∞˙ ≥Ù¿Ã(h)∏¶ ¿‘∑¬πﬁæ∆ ªÔ∞¢«¸¿« ≥–¿Ã(a) ±∏«œ±‚
		//πÿ∫Ø? 23.5
		//≥Ù¿Ã? 34.7
		//≥–¿Ã : xxx.xx
		//≥–¿Ã = πÿ∫Ø * ≥Ù¿Ã/2
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		double w,h,a;
		
		System.out.print("πÿ∫Ø : ");
		w = Double.parseDouble(br.readLine());
		
		System.out.print("≥Ù¿Ã : ");
		h = Double.parseDouble(br.readLine());
		
		
		a = w * h/2;
		
		System.out.println("≥–¿Ã : " + a);
		

	}

}
