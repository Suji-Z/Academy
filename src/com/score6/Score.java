package com.score6;

import java.util.Scanner;

public class Score {
	//사용자에게 데이터를 받아내는 역할을 할 class
	
	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	//입력
	
	public void insert() {
		
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("학번: ");
		dto.setHak(sc.next());
		
		System.out.print("이름: ");
		dto.setName(sc.next());
		
		System.out.print("국어: ");
		dto.setKor(sc.nextInt());
		
		System.out.print("영어: ");
		dto.setEng(sc.nextInt());
	
		System.out.print("수학: ");
		dto.setMat(sc.nextInt());
		
		int result = dao.insertData(dto); //매개변수 dao에 dto 값들을 다 넣어줌
		
		if(result!=0) {
			System.out.println("추가 성공");
			
		}else {
			System.out.println("추가 실패");
		}
		
	}
	
	//수정(update)
	public void update() {
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("수정 할 학번: ");
		dto.setHak(sc.next());
		
		System.out.print("국어: ");
		dto.setKor(sc.nextInt());
		
		System.out.print("영어: ");
		dto.setEng(sc.nextInt());
	
		System.out.print("수학: ");
		dto.setMat(sc.nextInt());
		
		int result = dao.updateData(dto);
		
		if(result!=0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		
	}
	
	//삭제(delete)
	public void delete() {
		
		System.out.print("삭제 할 학번: ");
		String delhak = sc.next();
		
		int result = dao.deleteData(delhak);
		
		if(result!=0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
	}
	

}
