package com.mission2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerDataImpl implements CustomerData {
	private List<CustomerVO> lists = new ArrayList<CustomerVO>();
	Scanner sc = new Scanner(System.in);


	@Override
	public void input() {
		CustomerVO vo = new CustomerVO();
	
		System.out.print("손님: ");
		vo.setName(sc.next());
		
		System.out.print("상의 구매갯수: ");
		vo.setT(sc.nextInt());
		
		System.out.print("하의 구매갯수: ");
		vo.setP(sc.nextInt());
		
		vo.setpPrice(vo.getpPrice());
		vo.settPrice(vo.gettPrice());
		vo.setSum(vo.getSum());
		vo.setTot(vo.getTot());
		
		lists.add(vo);
		
	}
	
	@Override
	public void print() {
		Iterator<CustomerVO> it = lists.iterator();
		System.out.print("주문자 이름 입력: ");
		String str = sc.next();
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			if(str.equals(vo.getName())) {
			System.out.printf("%s님의 구매목록 조회 \n상의: %d \n하의: %d \n",str,vo.getT(),vo.getP());
			}
		}
		
	}

	@Override
	public void sale() {
		Iterator<CustomerVO> it = lists.iterator();
		System.out.print("주문자 이름 입력: ");
		String str = sc.next();
		System.out.println("현재 진행중인 이벤트 조회 결과");
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			if(str.equals(vo.getName())) {
			
				if(vo.getSum()>=100000) {
				System.out.printf("***%s님은 구매금액 10%% 할인 적용 대상자 입니다!***\n",str);
			}
		
			else
			System.out.printf("%s님은 이벤트 적용 대상자가 아닙니다.\n",str);
			}
		}
		
	}

	@Override
	public void pay() {
		Iterator<CustomerVO> it = lists.iterator();
		System.out.print("주문자 이름 입력: ");
		String str = sc.next();
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			if(str.equals(vo.getName())) {
				System.out.printf("%s님의 총 결제 금액: %d원\n",str,vo.getTot());
		
			}

		}
	}

	@Override
	public void ascSortName() {	//String
		Comparator<CustomerVO> comp = new Comparator<CustomerVO>() {

			@Override
			public int compare(CustomerVO vo1, CustomerVO vo2) {
				return  vo1.getName().compareTo(vo2.getName());
			}
			
		};
		Collections.sort(lists, comp);
		totPrint();
	}

	

	@Override
	public void totPrint() {
		Iterator<CustomerVO> it = lists.iterator();
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			System.out.printf("%s님의 구매목록 조회 \n상의: %d \n하의: %d \n",vo.getName(),vo.getT(),vo.getP());
		}
	}
}
