package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {
	
	private static String city[] = {"����","�λ�","�뱸","��õ","����","����","���"};

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();	//���� �����ڿ��� �ڷ��� < >�� �پ��־�� �ϳ� ���� ����.
		
		System.out.println("�ʱ� �뷮: " + v.capacity()); //capacity() �ʱ�뷮 Ȯ��. �ʱ�뷮�� '10' 
		
		for(String c : city) {	//string c�� city �迭 ����
			
			v.add(c);	//������ �־��ٶ� add() ��. ������ get()
			
		}
		
		//v.add(10); ������Ÿ���� string���� �����Ͽ� �� �� ������Ÿ�� ������ �� �� ����
		
		String str;
		
		str = v.firstElement(); //ù��° ȣ��
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();  // ������ ȣ��
		System.out.println(str);
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
			
		}
		
		System.out.println();
		
		for(String c : v) {			//collection�� �迭ó�� for-each������ ������ ��� ��� ����
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		//---------------------------------
		//�ݺ���. collection�� ��ü for�� �뵵
		Iterator<String> it = v.iterator();		//vector��ü�� iterator()�޼ҵ�� ���� �ش� Iterator��.�信 ����
		while(it.hasNext()) {	//hasNext() : �����Ͱ� ������ ������ �ǹ�
			
			str = it.next();	//1���� ����. �ݺ�. ������ �������� �����̹Ƿ� �� ����ϰ��� it ���� Null�� ��. �ʱ�ȭ.
			System.out.print(str + " ");
			
		}
		
		//�ѹ� �� �ݺ��ϰ� ���� �� �̹� it�� 'Null' ���� �����ϹǷ� �����.. �� �������
		//�������̽��� �ѹ� �� ȣ���ؼ� vector�� ���� �ٽ� ����־����.
		
		while(it.hasNext()) {		
		
			str = it.next();	
			System.out.print(str + " ");
			
		}
		
		System.out.println();
		
		//����
		v.set(0, "Seoul");		//���� ����� �ڸ����� �����鸸 ���� ���� ����.
		v.set(1, "Busan");	
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		//����
		v.insertElementAt("���ѹα�", 0);		//Ư�� �ε������� ���ο� ���� �߰�.
		System.out.println(v.size() + "��");	//���� ���� 7�� -> 8���� ����
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//�˻�
		int idx = v.indexOf("�뱸"); //index��ȣ ã��. indexOf�� �ڵ� ���� ����̹Ƿ� int ������
		if(idx != -1) {
			System.out.println("�˻� ����! : " + idx);
		}
		else
			System.out.println("�˻� ����.. : " + idx);
		
		//��������
		Collections.sort(v);	//���ڿ��ϰ�� A - Z , �� - �� 

		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//��������
		Collections.sort(v, Collections.reverseOrder()); 	// 'c' ������ �� �Է�. ���� ���� �޼ҵ� reverseOrder()		
		//Comparator 'c' ���� ���� �Էµ� ����
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//����
		v.remove("Busan"); //�ε��� ��ȣ Ȥ�� ���� ���� �Է��Ͽ� ����.
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("���� ����: " +  v.capacity());
		System.out.println("������ ����: " + v.size());
		
		//���� ����
		for(int i=1; i<=20; i++) {
			v.add(Integer.toString(i));	//������ string���� ��ȯ���ִ� �޼ҵ� toString() ����Ͽ� ����
		}
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("���� ����: " +  v.capacity());	
		System.out.println("������ ����: " + v.size());
		
		
		//���� ����
		for(int i=1; i<=10; i++) {
			v.remove(5);		// 5��° �ε����� 10�� ����⸦ �ݺ� (5�� �ѹ� ����� 6���� ���ܿ� 5���̵ǰ� �� ����)
		}
		
		for(String c : v)	{
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("���� ����: " +  v.capacity());	
		System.out.println("������ ����: " + v.size());
		
		//�� ���� ����
		v.trimToSize();
		System.out.println("���� ����: " +  v.capacity());	
		System.out.println("������ ����: " + v.size());
		
		//��� ������ ����	(������ �״��)
		v.clear();
		System.out.println("���� ����: " +  v.capacity());	
		System.out.println("������ ����: " + v.size());
		
	}

}
