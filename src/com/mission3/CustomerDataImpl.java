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
		System.out.print("ȸ�� ��ȣ�� �Է����ּ���: ");
		num = sc.next();
		
		if(searchNum(num)) {
			System.out.print("�̹� �����ϴ� ȸ�� ��ȣ�Դϴ�.");
			return;
		}
		
		CustomerVO vo = new CustomerVO();
		
		System.out.print("�ֹ��� �̸�: ");
		vo.setName(sc.next());
		
		System.out.print("������ ���� ����: ");
		vo.setT(sc.nextInt());
		
		System.out.print("������ ���� ����: ");
		vo.setP(sc.nextInt());
		
		vo.setpPrice(vo.getpPrice());
		vo.settPrice(vo.gettPrice());
		vo.setSum(vo.getSum());
		vo.setTot(vo.getTot());
		vo.setBonus(vo.getBonus());
		
		
		hMap.put(num, vo);
		
		System.out.print("*******���� ����� Ȯ���Ǿ����ϴ�.*******");
		
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
		System.out.println("���� 10���� �̻� ���Ž� 10% ���� �̺�Ʈ�� �������Դϴ�.");
		System.out.print("��ȸ �� ȸ�� ��ȣ�� �Է����ּ���: ");
		num = sc.next();
		
		if(searchNum(num)) {
			CustomerVO vo = hMap.get(num);
			
			if(vo.getSum()>=100000) {
				System.out.printf("***%s���� ���űݾ� 10%% ���� ���� ����� �Դϴ�!***\n",vo.getName());
			}
			else {
				System.out.printf("%s���� �̺�Ʈ ���� ����ڰ� �ƴմϴ�.\n",vo.getName());
			}
		}
		
	}

	@Override
	public void pay() {
		Iterator<String> it = hMap.keySet().iterator();
		
		System.out.print("��ȸ �� ȸ����ȣ�� �Է����ּ���: ");
		num = sc.next();
		
		if(searchNum(num)) {
			CustomerVO vo = hMap.get(num);
			
			System.out.printf("ȸ����ȣ %s��%s���� �� �����ݾ� %d�� �Դϴ�.\n"
					+ "���� ������: %d��\n",num,vo.getName(),vo.getTot(),vo.getBonus());
		}
	}


	@Override
	public boolean searchNum(String num) {
		
		
		return hMap.containsKey(num);
	}


	@Override
	public void update() {
		Iterator<String> it = hMap.keySet().iterator();
		
		System.out.print("���� �� ȸ����ȣ�� �Է����ּ���: ");
		num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("��ȸ ����");
			return;
		}
		
		CustomerVO vo = hMap.get(num);
		
		System.out.print("������ ���� ����: ");
		vo.setT(sc.nextInt());
		
		System.out.print("������ ���� ����: ");
		vo.setP(sc.nextInt());
		
		hMap.put(num, vo);
		
		System.out.println("�ֹ������� ���������� �����Ǿ����ϴ�.");

		vo.setpPrice(vo.getpPrice());
		vo.settPrice(vo.gettPrice());
		vo.setSum(vo.getSum());
		vo.setTot(vo.getTot());
		vo.setBonus(vo.getBonus());
		
		System.out.print("�ֹ����� Ȯ���ϱ�[1] : ");
		
		int check = sc.nextInt();
		
		switch (check) {
		case 1: 
			System.out.printf("%s %s �� ����: %d ����: %d\n(��)�����ݾ�: %d��\n"
					+ "���� ������: %d��\n",num,vo.getName(),vo.getT(),vo.getP(),vo.getSum(),vo.getBonus());	
			break;

		default:
			System.out.print("��ȸ ����");
			break;
		}
		
	}


	@Override
	public void delete() {
		Iterator<String> it = hMap.keySet().iterator();
		
		System.out.print("������ ȸ����ȣ�� �Է����ּ���: ");
		num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("��ȸ ����");
			return;
		}
		
		hMap.remove(num);
		System.out.println("-----ȸ�������� ���������� �����Ǿ����ϴ�.-----");
		
	}




}
