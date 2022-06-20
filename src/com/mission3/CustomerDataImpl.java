package com.mission3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CustomerDataImpl implements CustomerData {
	private Map<String, CustomerVO> hMap = new TreeMap<String, CustomerVO>();
	Scanner sc = new Scanner(System.in);
	String num;	//key

	@Override
	public void input() {
		System.out.print("회원 번호를 입력해주세요: ");
		num = sc.next();
		
		if(searchNum(num)) {
			System.out.print("이미 존재하는 회원 번호입니다.");
			return;
		}
		
		CustomerVO vo = new CustomerVO();
		
		System.out.print("주문자 이름: ");
		vo.setName(sc.next());
		
		System.out.print("구매할 상의 개수: ");
		vo.setT(sc.nextInt());
		
		System.out.print("구매할 하의 개수: ");
		vo.setP(sc.nextInt());
		
		vo.setpPrice(vo.getpPrice());
		vo.settPrice(vo.gettPrice());
		vo.setSum(vo.getSum());
		vo.setTot(vo.getTot());
		vo.setBonus(vo.getBonus());
		
		
		hMap.put(num, vo);
		
		System.out.print("*******구매 목록이 확정되었습니다.*******");
		
	}


	@Override
	public void totPrint() {
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()){
			String num = it.next();
			CustomerVO vo = hMap.get(num);
			
			System.out.printf(num + " " + vo.toString());
		}
	}

	@Override
	public void sale() {
		Iterator<String> it = hMap.keySet().iterator();
		System.out.println("현재 10만원 이상 구매시 10% 할인 이벤트를 진행중입니다.");
		System.out.print("조회 할 회원 번호를 입력해주세요: ");
		num = sc.next();
		
		if(searchNum(num)) {
			CustomerVO vo = hMap.get(num);
			
			if(vo.getSum()>=100000) {
				System.out.printf("***%s님은 구매금액 10%% 할인 적용 대상자 입니다!***\n",vo.getName());
			}
			else {
				System.out.printf("%s님은 이벤트 적용 대상자가 아닙니다.\n",vo.getName());
			}
		}
		
	}

	@Override
	public void pay() {
		Iterator<String> it = hMap.keySet().iterator();
		
		System.out.print("조회 할 회원번호를 입력해주세요: ");
		num = sc.next();
		
		if(searchNum(num)) {
			CustomerVO vo = hMap.get(num);
			
			System.out.printf("회원번호 %sㅣ%s님의 총 결제금액 %d원 입니다.\n"
					+ "예상 적립금: %d원\n",num,vo.getName(),vo.getTot(),vo.getBonus());
		}
	}


	@Override
	public boolean searchNum(String num) {
		
		
		return hMap.containsKey(num);
	}


	@Override
	public void update() {
		Iterator<String> it = hMap.keySet().iterator();
		
		System.out.print("수정 할 회원번호를 입력해주세요: ");
		num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("조회 실패");
			return;
		}
		
		CustomerVO vo = hMap.get(num);
		
		System.out.print("구매할 상의 개수: ");
		vo.setT(sc.nextInt());
		
		System.out.print("구매할 하의 개수: ");
		vo.setP(sc.nextInt());
		
		hMap.put(num, vo);
		
		System.out.println("주문내역이 정상적으로 수정되었습니다.");

		vo.setpPrice(vo.getpPrice());
		vo.settPrice(vo.gettPrice());
		vo.setSum(vo.getSum());
		vo.setTot(vo.getTot());
		vo.setBonus(vo.getBonus());
		
		System.out.print("주문내역 확인하기[1] : ");
		
		int check = sc.nextInt();
		
		switch (check) {
		case 1: 
			System.out.printf("%s %s ㅣ 상의: %d 하의: %d\n(원)결제금액: %d원\n"
					+ "예상 적립금: %d원\n",num,vo.getName(),vo.getT(),vo.getP(),vo.getSum(),vo.getBonus());	
			break;

		default:
			System.out.print("조회 오류");
			break;
		}
		
	}


	@Override
	public void delete() {
		Iterator<String> it = hMap.keySet().iterator();
		
		System.out.print("삭제할 회원번호를 입력해주세요: ");
		num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("조회 실패");
			return;
		}
		
		hMap.remove(num);
		System.out.println("-----회원정보가 정상적으로 삭제되었습니다.-----");
		
	}




}
