package com.score4;


public interface Score {

	public void input();
	public boolean searchHak(String hak);	//사용자가 입력할 때 중복되는 값이 있는지 서치.(삭제,수정,검색)
	public void print();
	
	public void delete();		//학생
	public void update();		//학생
	public void findHak();		//학생
	public void findeName();	//학생
	
}
