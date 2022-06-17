package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImp implements Score {
	
	private List<ScoreVO> lists = new ArrayList<>();	//ScoreVO의 변수를 모두 담음, vector와 목적 동일
	Scanner sc = new Scanner(System.in);
	//인터페이스 List에 모두 담기
	//UPCAST (상속받은 클래스 arryList -> 인터페이스 List)

	@Override
	public void input() {
		
		
		ScoreVO vo = new ScoreVO();

		System.out.print("학번: ");
		vo.setHak(sc.next());
		
		System.out.print("이름: ");
		vo.setName(sc.next());
		
		System.out.print("국어 점수: ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 점수: ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 점수: ");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		
		
		
	}

	@Override
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			System.out.println(vo.toString());
			
//			System.out.printf("%5s %6s %4d %4d %4d %4d %4.1f\n",
//					vo.getHak(),vo.getHak(),
//					vo.getKor(),vo.getEng(),vo.getMat(),
//					(vo.getKor()+vo.getEng()+vo.getMat()),
//					(vo.getKor()+vo.getEng()+vo.getMat())/3.0);
			
		}
		
	}

	@Override
	public void deleteHak() {
		
		System.out.print("삭제할 학번: ");
		String str = sc.next();
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			
			if(str.equals(vo.getHak())) {
				lists.remove(vo);
			
			System.out.println("학번이 정상적으로 삭제되었습니다.");
			break;
			}
	
			
		}

		}
		
	
	@Override
	public void searchHak() {		//중간에 일치하면 for문 빠져나옴. name은 끝까지 탐색
		
		System.out.print("검색할 학번: ");	//222
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
				
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				System.out.println(vo.toString());
				break;
			}
		}
		
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름: ");
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			
			if(name.equals(vo.getName())) {
				System.out.println(vo.toString());
			}
		}
	}

	@Override
	public void descSortTot() {
		
		//무명의 클래스로 인터페이스 객체생성. (원래는 new로 x)
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot()<vo2.getTot() ? 1:-1 ;	
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
	}

	@Override
	public void ascSortHak() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
		
		/*
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return Integer.parseInt(vo1.getHak()) < Integer.parseInt(vo2.getHak()) ? 1:-1 ;	
			}
		};

		
		
		Collections.sort(lists, comp);
		
		print();
		*/
	}

	@Override
	public void ascSortName() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>(){

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getName().compareTo(vo2.getName());
			}
			
		};
		
		Collections.sort(lists, comp);
		print();
	}

}
