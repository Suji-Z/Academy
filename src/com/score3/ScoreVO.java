package com.score3;

public class ScoreVO { 		//Value Object	, 데이터 저장 공간
	
	private String hak;		//일단 무조건 private로 시작
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;

	//getter , setter 메소드 (오른쪽버튼->source->generate getter and setter -> select all)
	//hak만 초기화 하는 법. set변수이름(앞글자 대문자)
	//특정 점수만 가져오기
	
	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {		//왜 set이 필요하지 않은지? kor,eng,mat을 각각 가져와 쓸거라?
		return kor+eng+mat;
	}

	@Override
	public String toString() {
		if(hak==null || hak.equals("")) {
			return null;
		}
		
		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f",
									hak,name,kor,eng,mat,getTot(),getTot()/3.0);
		
		return str;
	}

	
}
