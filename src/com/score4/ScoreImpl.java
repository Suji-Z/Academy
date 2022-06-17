package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score{
			 //key,'hak'
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();	//정렬 출력해줌
	Scanner sc = new Scanner(System.in);
	String hak;	//key
	
	@Override
	public void input() {
		
		System.out.print("학번 입력: "); //key
		hak = sc.next();
		
		if(searchHak(hak)) {	//입력해야하는 값이 true일때 길어지는 경우, '!'를 입력
			System.out.println("이미 존재 하는 학번입니다.");
			return;		//다시 입력하게 input메소드 시작으로 돌아감
		}
		
		ScoreVO vo = new ScoreVO();
		System.out.print("이름 입력: ");
		vo.setName(sc.next());
		
		System.out.print("국어 점수: ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 점수: ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 점수: ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("-------추가 성공-------");
			
		
	}

	@Override
	public boolean searchHak(String hak) {
		
//		if(hMap.containsKey(hak)) {
//			return true;
//			
//		}
		return hMap.containsKey(hak);
	}
	


	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			String hak = it.next();	 //key를 꺼내오도록
			ScoreVO vo = hMap.get(hak);			// key가 value를 꺼내오도록

			System.out.println(hak + " " + vo.toString());
		}
	
	}

	@Override
	public void delete() {

		
		System.out.println("삭제할 학번: ");
		hak = sc.next();
		
			if(searchHak(hak)) {
				hMap.remove(hak);
				System.out.println("정상적으로 삭제되었습니다.");
				
		}
	}

	@Override
	public void update() {

		
		System.out.println("수정할 학번: ");
		hak = sc.next();

			if(searchHak(hak)) {
				ScoreVO vo = new ScoreVO();
				
				System.out.print("이름 입력: ");
				vo.setName(sc.next());
				
				System.out.print("국어 점수: ");
				vo.setKor(sc.nextInt());
				
				System.out.print("영어 점수: ");
				vo.setEng(sc.nextInt());
				
				System.out.print("수학 점수: ");
				vo.setMat(sc.nextInt());
				
				hMap.put(hak, vo);
				
				System.out.println("-------수정 성공-------");
				
		}
	}

	@Override
	public void findHak() {
	
		System.out.print("검색할 학번: ");
		hak = sc.next();

			if(searchHak(hak)) {
				ScoreVO vo = hMap.get(hak);
				System.out.println(hak + " " + vo.toString());

			
		}
		
	}

	@Override
	public void findeName() {
		Iterator<String> it = hMap.keySet().iterator();

		System.out.print("검색할 이름: ");
		String name = sc.next();
		
		while(it.hasNext()) {
			String str = it.next();
			ScoreVO vo = hMap.get(str);
			if(vo.getName().equals(name)) {
				System.out.println(str + " " + vo.toString());
				break;
				}
			}
		}
}
