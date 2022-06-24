package com.birth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BirthData {
	
	private List<BirthVO> lists;
	
	Scanner sc = new Scanner(System.in);
	
	File f = new File("c:\\doc\\birth.txt");
	
	public BirthData() {
		try {

			if(!f.exists()) {
				lists = new ArrayList<>();
		
			}
			else {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				lists = (List<BirthVO>)ois.readObject();
		
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

	public void input() {
		
		
		BirthVO vo = new BirthVO();
		
		System.out.print("이름: ");
		vo.setName(sc.next());
		
		System.out.print("생일(yyyy-mm-dd): ");
		vo.setBirthDay(sc.next());

		System.out.print("점수: ");
		vo.setScore(sc.nextInt());
		
		lists.add(vo);

	}
	
	public void print() {
		Iterator<BirthVO> it = lists.iterator();
		
		while(it.hasNext()) {
			BirthVO vo = it.next();
			
			System.out.println(vo.toString());
			
			
		}
		
		
	}
	
public void save() {
		
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			
			oos.writeObject(lists);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
