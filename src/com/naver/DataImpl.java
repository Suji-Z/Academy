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
			
			throw new Exception("ID´Â 8~15ÀÚ ÀÌ³»¿©¾ß ÇÕ´Ï´Ù.");
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
			throw new Exception("¿µ¹®ÀÚ ¼ýÀÚ È¥¿ë¸¸ °¡´ÉÇÕ´Ï´Ù.");
		
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
			throw new Exception("¿µ¹®ÀÚ ¼ýÀÚ Æ¯¼ö¹®ÀÚ(!,@,#,$,_) È¥¿ë¸¸ °¡´ÉÇÕ´Ï´Ù.");
		
		
		}	
	}
	
	public void inputNameFormat(String name) throws Exception{
	
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);	
			if(!(ch>='°¡'&&ch<='ÆR')) {
			
				throw new Exception("ÀÌ¸§Àº ÇÑ±Û¸¸ ÀÔ·Â °¡´ÉÇÕ´Ï´Ù.");
			}
		
		}
	
	}
	
	public void inputGenderFormat(int gender) throws Exception{
	
		if(gender<0 || gender>2) {
			throw new Exception("¼ºº° ÀÔ·Â ¿À·ùÀÔ´Ï´Ù.");
		}
}

	public void inputBirthDayFormat(String birth) throws Exception{
		
		if(birth.length()!=8) {
			
			throw new Exception("»ý³â ¿ùÀÏÀº 8ÀÚ·Î ÀÔ·ÂÇØÁÖ¼¼¿ä.(yyyy mm dd)");
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
			throw new Exception("¿µ¹®ÀÚ ¼ýÀÚ Æ¯¼ö¹®ÀÚ('@','_') È¥¿ë¸¸ °¡´ÉÇÕ´Ï´Ù.");
		
	}
}
	
		public void inputPhonNumFormat(String tel) throws Exception{
			
			if(tel.length()!=11) {
				throw new Exception("ÈÞ´ëÀüÈ­¹øÈ£ 11ÀÚ¸®¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
			}
			
			for(int i=0; i<tel.length(); i++) {
				char ch = tel.charAt(i);
				if(ch<'0' && ch>'9') {
					throw new Exception("¿¬¶ôÃ³´Â 11ÀÚ¸®ÀÇ ¼ýÀÚ·Î¸¸ ÀÔ·Â°¡´ÉÇÕ´Ï´Ù.");
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
			
			System.out.print("¾ÆÀÌµð ÀÔ·Â: ");
			String CusName = sc.next();
			vo.setID(CusName);
			
			if(CusName.equals(vo.getName())) {
				System.out.println("ÀÌ¹Ì Á¸ÀçÇÏ´Â ID ÀÔ´Ï´Ù.");
				return;
			}
			
			exc.inputIDFormat(vo.getID());
			
		
			System.out.print("ºñ¹Ð¹øÈ£: ");
			vo.setPw(sc.next());
			
			exc.inputPWFormat(vo.getPw());
			
			System.out.print("ºñ¹Ð¹øÈ£ ÀçÈ®ÀÎ: ");
			String CusPw = sc.next();
			
			if(!CusPw.equals(vo.getPw())) {
				System.out.println("ºñ¹Ð¹øÈ£¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				return;
				}
			
			
			System.out.print("ÀÌ¸§: ");
			vo.setName(sc.next());
			
			exc.inputNameFormat(vo.getName());
			
			
			System.out.println("¼ºº°: [1]³²ÀÚ [2]¿©ÀÚ");
			vo.setGenderCh(sc.nextInt());
			
			exc.inputGenderFormat(vo.getGenderCh());
			
			if(vo.getGenderCh()==1)
				vo.setGender("³²ÀÚ");
			
			else if(vo.getGenderCh()==2)
				vo.setGender("¿©ÀÚ");
					
			System.out.print("'-'¸¦ Á¦¿ÜÇÑ »ý³â¿ùÀÏ 8ÀÚ¸®[yyyy-mm-dd]: ");
			vo.setBirth(sc.next());
			
			exc.inputBirthDayFormat(vo.getBirth());
			
			System.out.print("ÀÌ¸ÞÀÏ: ");
			vo.setEmail(sc.next());
			
			exc.inputEmailFormat(vo.getEmail());
			
			System.out.print("'-'¸¦ Á¦¿ÜÇÑ ÈÞ´ëÀüÈ­¹øÈ£: ");
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
		
		System.out.println("»èÁ¦ÇÒ °èÁ¤ÀÇ ID¿Í PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		System.out.print("ID: ");
		String deID = sc.next();
		
		System.out.print("PW: ");
		String dePW = sc.next();
		
		
		while(it.hasNext()) {
			DataVO vo = it.next();
			
			if(deID.equals(vo.getID()) && dePW.equals(vo.getPw())) {
				lists.remove(vo);
			
			System.out.println("°èÁ¤ÀÌ Á¤»óÀûÀ¸·Î »èÁ¦µÇ¾ú½À´Ï´Ù.");
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
		System.out.print("°Ë»öÇÒ ID: ");
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


