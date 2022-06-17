package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImp implements Score {
	
	private List<ScoreVO> lists = new ArrayList<>();	//ScoreVO�� ������ ��� ����, vector�� ���� ����
	Scanner sc = new Scanner(System.in);
	//�������̽� List�� ��� ���
	//UPCAST (��ӹ��� Ŭ���� arryList -> �������̽� List)

	@Override
	public void input() {
		
		
		ScoreVO vo = new ScoreVO();

		System.out.print("�й�: ");
		vo.setHak(sc.next());
		
		System.out.print("�̸�: ");
		vo.setName(sc.next());
		
		System.out.print("���� ����: ");
		vo.setKor(sc.nextInt());
		
		System.out.print("���� ����: ");
		vo.setEng(sc.nextInt());
		
		System.out.print("���� ����: ");
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
		
		System.out.print("������ �й�: ");
		String str = sc.next();
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			
			if(str.equals(vo.getHak())) {
				lists.remove(vo);
			
			System.out.println("�й��� ���������� �����Ǿ����ϴ�.");
			break;
			}
	
			
		}

		}
		
	
	@Override
	public void searchHak() {		//�߰��� ��ġ�ϸ� for�� ��������. name�� ������ Ž��
		
		System.out.print("�˻��� �й�: ");	//222
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
		System.out.print("�˻��� �̸�: ");
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
		
		//������ Ŭ������ �������̽� ��ü����. (������ new�� x)
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
