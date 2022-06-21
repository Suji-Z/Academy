package com.day17;

import java.util.Random;
import java.util.Scanner;

class PtMem implements Runnable{
	
	private static String[] name = 
		{"오세라","안수언","엄희성","김성현","윤다영",
		"김희진","이동우","최재혁","김홍수","서수현",
		"윤재일","정영진","박선미","전은지","류창주",
		"김수지","이은지","박수정","정성경","심민정",
		"윤채련","김영운","안시연","이정민","박수진",
		"윤서혜","정민정"};
	
	public void print(int num) {
		Random rd = new Random();
	
		int[] cnt = new int[name.length];
		
		for(int i=0; i<num; i++) {
			cnt[i] = rd.nextInt(name.length);
			
			for(int j=0; j<i; j++) {
				
				if(cnt[i]==cnt[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"번 발표자 : " + name[cnt[i]]);
		}
		
	}
	
	private String charact = "...........ㅜㅜ";
	
	
	private int num = 0;
	
	@Override
	public void run() {

		System.out.print("고민중");
		
		for(int i=0; i<charact.length(); i++) {
			char ch = charact.charAt(i);

			System.out.print(ch);

			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			}
		}
		
}

public class Mission {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			PtMem pm = new PtMem();
			
			Thread t = new Thread(pm);
			
			System.out.print("발표자 인원 수: ");
			int num = sc.nextInt();
			
			t.start();
			
			try {
				t.join();
				
			} catch (Exception e) {

			}
			
			System.out.println();
			
			System.out.printf("\n축하합니다!! 발표자 입니다.\n\n");
			
			pm.print(num);
			
	}
}
