package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImp();		//scoreimp는 score인터페이스를 구현하였으므로 upcast
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.입력 \n2.출력 \n3.학번 삭제 \n4.학번 검색 \n5.이름 검색" + 
						"\n6.총점 내림차순정렬 \n7.학번 오름차순정렬 \n8.이름 오름차순 정렬 \n9.종료");
				System.out.print("\n-----------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
				
			}while(ch<1);
			
			switch(ch) {
			
				case 1: ob.input(); break;
				case 2: ob.print(); break;
				case 3: ob.deleteHak(); break;
				case 4: ob.searchHak(); break;
				case 5:ob.searchName(); break;
				case 6:ob.descSortTot(); break;
				case 7:ob.ascSortHak(); break;
				case 8:ob.ascSortName(); break;
	
				default:
					System.out.println("학사정보 시스템을 종료합니다.");
					System.exit(0); 	//무조건 프로그램 종료
					
			}
			
		}
		
		
//		ScoreVO vo = new ScoreVO();	//기본 생성자
	
//		vo.set("111","배수지",60,70,80);
		
//		vo.setHak("a123");
//		vo.setName("배수지");
//		vo.setKor(90);
//		vo.setEng(80);
//		vo.setMat(70);

		
//		String str = vo.toString();
//		
//		System.out.println(str);
//		
//		System.out.println(vo.getHak());
//		System.out.println(" " + vo.getEng());
		
		
		/*
		ScoreVO vo1 = new ScoreVO("222", "강아랑", 80, 90, 70);
		
		System.out.println(vo1.toString());

		*/
	}

}
