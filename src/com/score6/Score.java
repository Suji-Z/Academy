package com.score6;

import java.util.Scanner;

public class Score {
	//����ڿ��� �����͸� �޾Ƴ��� ������ �� class
	
	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	//�Է�
	
	public void insert() {
		
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("�й�: ");
		dto.setHak(sc.next());
		
		System.out.print("�̸�: ");
		dto.setName(sc.next());
		
		System.out.print("����: ");
		dto.setKor(sc.nextInt());
		
		System.out.print("����: ");
		dto.setEng(sc.nextInt());
	
		System.out.print("����: ");
		dto.setMat(sc.nextInt());
		
		int result = dao.insertData(dto); //�Ű����� dao�� dto ������ �� �־���
		
		if(result!=0) {
			System.out.println("�߰� ����");
			
		}else {
			System.out.println("�߰� ����");
		}
		
	}
	
	//����(update)
	public void update() {
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("���� �� �й�: ");
		dto.setHak(sc.next());
		
		System.out.print("����: ");
		dto.setKor(sc.nextInt());
		
		System.out.print("����: ");
		dto.setEng(sc.nextInt());
	
		System.out.print("����: ");
		dto.setMat(sc.nextInt());
		
		int result = dao.updateData(dto);
		
		if(result!=0) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		
	}
	
	//����(delete)
	public void delete() {
		
		System.out.print("���� �� �й�: ");
		String delhak = sc.next();
		
		int result = dao.deleteData(delhak);
		
		if(result!=0) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		
	}
	

}
