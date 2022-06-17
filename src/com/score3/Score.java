package com.score3;

public interface Score {
	
	public void input();		//입력
	
	public void print();	//출력
	
	public void deleteHak();	//학생정보삭제
	public void searchHak();	//학번 검색
	public void searchName();	//이름 검색
	public void descSortTot();	//총점 내림차순 정렬 (큰 순서로)
	public void ascSortHak();	//학번 오름차순 정렬
	
	public void ascSortName();
	
	
	
}
