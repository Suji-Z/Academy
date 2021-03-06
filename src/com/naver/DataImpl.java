package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class MyExcept extends Exception{
	
	public void inputIDFormat(String id) throws Exception{
		
		if(id.length()<8 || id.length()>15) {
			
			throw new Exception("ID는 8~15자 이내여야 합니다.");
		}
		
		int engcnt = 0;
		int numcnt = 0;

		for(int i=0; i<id.length(); i++) {
			char ch = id.charAt(i);	
			if((ch>='A' && ch<='Z') || (ch>='a' &&  ch<='z')) {
				engcnt++;

			}
			else if(ch>='0' && ch<='9') {
				numcnt++;
			}
			
		}
		if(engcnt==0 || numcnt==0) {
			throw new Exception("영문자 숫자 혼용만 가능합니다.");
		
		}
		
		
	}
	
	public void inputPWFormat(String pw) throws Exception{
		
		
		int engcnt = 0;
		int numcnt = 0;
		int spCh = 0;

		for(int i=0; i<pw.length(); i++) {
			char ch = pw.charAt(i);	
			if((ch>='A' && ch<='Z') || (ch>='a' &&  ch<='z')) {
				engcnt++;

			}
			else if(ch>='0' && ch<='9') {
				numcnt++;
			}
			
			else if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='_') {
				spCh++;
			}
			
		}
		if(engcnt==0 || numcnt==0 || spCh==0) {
			throw new Exception("영문자 숫자 특수문자(!,@,#,$,_) 혼용만 가능합니다.");
		
		
		}	
	}
	
	public void inputNameFormat(String name) throws Exception{
	
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);	
			if(!(ch>='가'&&ch<='힣')) {
			
				throw new Exception("이름은 한글만 입력 가능합니다.");
			}
		
		}
	
	}
	
	public void inputGenderFormat(int gender) throws Exception{
	
		if(gender<0 || gender>2) {
			throw new Exception("성별 입력 오류입니다.");
		}
}

	public void inputBirthDayFormat(String birth) throws Exception{
		
		if(birth.length()!=8) {
			
			throw new Exception("생년 월일은 8자로 입력해주세요.(yyyy mm dd)");
		}
	}
	
	public void inputEmailFormat(String email) throws Exception{
		int engcnt = 0;
		int numcnt = 0;
		int spCh = 0;

		for(int i=0; i<email.length(); i++) {
			char ch = email.charAt(i);	
			if((ch>='A' && ch<='Z') || (ch>='a' &&  ch<='z')) {
				engcnt++;

			}
			else if(ch>='0' && ch<='9') {
				numcnt++;
			}
			
			else if(ch=='@' || ch=='_') {
				spCh++;
			}
			
		}
		if(engcnt==0 || numcnt==0 || spCh==0) {
			throw new Exception("영문자 숫자 특수문자('@','_') 혼용만 가능합니다.");
		
	}
}
	
		public void inputPhonNumFormat(String tel) throws Exception{
			
			if(tel.length()!=11) {
				throw new Exception("휴대전화번호 11자리를 입력해주세요.");
			}
			
			for(int i=0; i<tel.length(); i++) {
				char ch = tel.charAt(i);
				if(ch<'0' && ch>'9') {
					throw new Exception("연락처는 숫자로만 입력가능합니다.");
				}
				
			}
		}
	
}
	


public class DataImpl {

	private List<DataVO> lists = new ArrayList<DataVO>();
	Scanner sc = new Scanner(System.in);
	
	MyExcept exc = new MyExcept();

	public void joinID() {
		
		try {
			
			DataVO vo = new DataVO();
			
			System.out.print("아이디 입력: ");
			String CusName = sc.next();
			
			
			if(CusName.equals(vo.getName())) {
				System.out.println("이미 존재하는 ID 입니다.");
				return;
			}
			
			vo.setID(CusName);
			exc.inputIDFormat(vo.getID());
			
		
			System.out.print("비밀번호: ");
			String pw1 = sc.next();
			
			if(pw1.equals(vo.getPw())) {
				System.out.println("이미 존재하는 패스워드 입니다.");
				return;
			}
			
			vo.setPw(pw1);
			exc.inputPWFormat(vo.getPw());
			
			System.out.print("비밀번호 재확인: ");
			String pw2 = sc.next();
			
			if(!pw2.equals(vo.getPw())) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return;
				}
			
			
			System.out.print("이름: ");
			vo.setName(sc.next());
			
			exc.inputNameFormat(vo.getName());
			
			
			System.out.println("성별: [1]남자 [2]여자");
			vo.setGenderCh(sc.nextInt());
			
			exc.inputGenderFormat(vo.getGenderCh());
			
			if(vo.getGenderCh()==1)
				vo.setGender("남자");
			
			else if(vo.getGenderCh()==2)
				vo.setGender("여자");
					
			System.out.print("'-'를 제외한 생년월일 8자리[yyyy-mm-dd]: ");
			vo.setBirth(sc.next());
			
			exc.inputBirthDayFormat(vo.getBirth());
			
			System.out.print("이메일: ");
			vo.setEmail(sc.next());
			
			exc.inputEmailFormat(vo.getEmail());
			
			System.out.print("'-'를 제외한 휴대전화번호: ");
			vo.setTel(sc.next());
			
			exc.inputPhonNumFormat(vo.getTel());
			
			
			lists.add(vo);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	public void print() {
		Iterator<DataVO> it = lists.iterator();

		while(it.hasNext()) {
			DataVO vo = it.next();
		
			System.out.printf("%s %s %s %s %s %s %s\n",vo.getID(),vo.getPw(),vo.getName(),vo.getGender(),vo.getBirth(),
					vo.getEmail(),vo.getTel());

	}

}
	
	public void delete() {
		Iterator<DataVO> it = lists.iterator();
		
		System.out.println("삭제할 계정의 ID와 PW를 입력해주세요.");
		System.out.print("ID: ");
		String deID = sc.next();
		
		System.out.print("PW: ");
		String dePW = sc.next();
		
		
		while(it.hasNext()) {
			DataVO vo = it.next();
			
			if(deID.equals(vo.getID()) && dePW.equals(vo.getPw())) {
				lists.remove(vo);
			
			System.out.println("계정이 정상적으로 삭제되었습니다.");
			break;
			}
		
		}
	
	}
	
	public void ascSortName() {	
		Comparator<DataVO> comp = new Comparator<DataVO>() {

			@Override
			public int compare(DataVO vo1, DataVO vo2) {
				return vo1.getName().compareTo(vo2.getName());
			}
			
		};
		
		Collections.sort(lists, comp);
		print();
	}
	
	public void searchID() {
		System.out.print("검색할 ID: ");
		String ID = sc.next();
		
		Iterator<DataVO> it = lists.iterator();
		
		while(it.hasNext()) {
			DataVO vo = it.next();
			
			if(ID.equals(vo.getID())) {
				System.out.printf("%s %s %s %s %s %s %s\n",vo.getID(),vo.getPw(),vo.getName(),vo.getGender(),vo.getBirth(),
						vo.getEmail(),vo.getTel());
			}
		}
	}
	
}
