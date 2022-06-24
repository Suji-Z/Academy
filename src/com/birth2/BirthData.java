package com.birth2;

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
	private String path = System.getProperty("user.dir");	//위치를 불러오는?, java-Demo 까지
	private File f = new File(path, "\\data\\birth2.txt");	// path부터 해당 경로까지
	
	
	public BirthData() {
	
		
		try {
		
		if(!f.getParentFile().exists()) {	//전체 f의 경로가 있는지? 확인. 
			f.getParentFile().mkdirs();
			
		}
		
		if(f.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			lists = (List<BirthVO>) ois.readObject();	//list 뒤의 <birthVO>는 안적어도 가능

			ois.close();
		}
	
		} catch (Exception e) {
		
		}
		
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		BirthVO vo = new BirthVO();
		
		System.out.print("이름: ");
		vo.setName(sc.next());
		
		System.out.print("생년월일: ");
		vo.setBirthDay(sc.next());
		
		System.out.print("점수: ");
		vo.setScore(sc.nextInt());
		
		//처음실행 후 데이터 입력시 객체를 생성
		if(lists==null) {
			
			lists = new ArrayList<BirthVO>();
		}
		
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
			
		if(lists!=null) {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(lists);
			
			oos.close();
			
			System.out.print("파일 저장 성공");
			
			}
			
		} catch (Exception e) {
			
		}

		
	}

}

//생성자로 static 바로 실행하는것과 메소드로 input 시작과 동시에 메소드를 실행시키는것의 차이?
//생성자 if에 lists 객체를 생성하지 않고 input에서 if를 따로 추가하는 이유?