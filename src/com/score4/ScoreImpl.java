package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score{
			 //key,'hak'
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();	//���� �������
	Scanner sc = new Scanner(System.in);
	String hak;	//key
	
	@Override
	public void input() {
		
		System.out.print("�й� �Է�: "); //key
		hak = sc.next();
		
		if(searchHak(hak)) {	//�Է��ؾ��ϴ� ���� true�϶� ������� ���, '!'�� �Է�
			System.out.println("�̹� ���� �ϴ� �й��Դϴ�.");
			return;		//�ٽ� �Է��ϰ� input�޼ҵ� �������� ���ư�
		}
		
		ScoreVO vo = new ScoreVO();
		System.out.print("�̸� �Է�: ");
		vo.setName(sc.next());
		
		System.out.print("���� ����: ");
		vo.setKor(sc.nextInt());
		
		System.out.print("���� ����: ");
		vo.setEng(sc.nextInt());
		
		System.out.print("���� ����: ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("-------�߰� ����-------");
			
		
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
			String hak = it.next();	 //key�� ����������
			ScoreVO vo = hMap.get(hak);			// key�� value�� ����������

			System.out.println(hak + " " + vo.toString());
		}
	
	}

	@Override
	public void delete() {

		
		System.out.println("������ �й�: ");
		hak = sc.next();
		
			if(searchHak(hak)) {
				hMap.remove(hak);
				System.out.println("���������� �����Ǿ����ϴ�.");
				
		}
	}

	@Override
	public void update() {

		
		System.out.println("������ �й�: ");
		hak = sc.next();

			if(searchHak(hak)) {
				ScoreVO vo = new ScoreVO();
				
				System.out.print("�̸� �Է�: ");
				vo.setName(sc.next());
				
				System.out.print("���� ����: ");
				vo.setKor(sc.nextInt());
				
				System.out.print("���� ����: ");
				vo.setEng(sc.nextInt());
				
				System.out.print("���� ����: ");
				vo.setMat(sc.nextInt());
				
				hMap.put(hak, vo);
				
				System.out.println("-------���� ����-------");
				
		}
	}

	@Override
	public void findHak() {
	
		System.out.print("�˻��� �й�: ");
		hak = sc.next();

			if(searchHak(hak)) {
				ScoreVO vo = hMap.get(hak);
				System.out.println(hak + " " + vo.toString());

			
		}
		
	}

	@Override
	public void findeName() {
		Iterator<String> it = hMap.keySet().iterator();

		System.out.print("�˻��� �̸�: ");
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
