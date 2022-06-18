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
	
		System.out.print("�մ�: ");
		vo.setName(sc.next());
		
		System.out.print("���� ���Ű���: ");
		vo.setT(sc.nextInt());
		
		System.out.print("���� ���Ű���: ");
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
		System.out.print("�ֹ��� �̸� �Է�: ");
		String str = sc.next();
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			if(str.equals(vo.getName())) {
			System.out.printf("%s���� ���Ÿ�� ��ȸ \n����: %d \n����: %d \n",str,vo.getT(),vo.getP());
			}
		}
		
	}

	@Override
	public void sale() {
		Iterator<CustomerVO> it = lists.iterator();
		System.out.print("�ֹ��� �̸� �Է�: ");
		String str = sc.next();
		System.out.println("���� �������� �̺�Ʈ ��ȸ ���");
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			if(str.equals(vo.getName())) {
			
				if(vo.getSum()>=100000) {
				System.out.printf("***%s���� ���űݾ� 10%% ���� ���� ����� �Դϴ�!***\n",str);
			}
		
			else
			System.out.printf("%s���� �̺�Ʈ ���� ����ڰ� �ƴմϴ�.\n",str);
			}
		}
		
	}

	@Override
	public void pay() {
		Iterator<CustomerVO> it = lists.iterator();
		System.out.print("�ֹ��� �̸� �Է�: ");
		String str = sc.next();
		
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			
			if(str.equals(vo.getName())) {
				System.out.printf("%s���� �� ���� �ݾ�: %d��\n",str,vo.getTot());
		
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
			
			System.out.printf("%s���� ���Ÿ�� ��ȸ \n����: %d \n����: %d \n",vo.getName(),vo.getT(),vo.getP());
		}
	}
}
