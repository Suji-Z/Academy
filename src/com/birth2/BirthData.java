package com.birth2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BirthData {
	private List<BirthVO> lists;
	private String path = System.getProperty("user.dir");	//��ġ�� �ҷ�����?, java-Demo ����
	private File f = new File(path, "\\data\\birth2.txt");	// path���� �ش� ��α���
	
	
	public BirthData() {
	
		
		try {
		
		if(!f.getParentFile().exists()) {	//��ü f�� ��ΰ� �ִ���? Ȯ��. 
			f.getParentFile().mkdirs();
			
		}
		
		if(f.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			lists = (List<BirthVO>) ois.readObject();	//list ���� <birthVO>�� ����� ����

			ois.close();
		}
	
		} catch (Exception e) {
		
		}
		
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		BirthVO vo = new BirthVO();
		
		System.out.print("�̸�: ");
		vo.setName(sc.next());
		
		System.out.print("�������: ");
		vo.setBirthDay(sc.next());
		
		System.out.print("����: ");
		vo.setScore(sc.nextInt());
		
		//ó������ �� ������ �Է½� ��ü�� ����
		if(lists==null) {
			
			lists = new ArrayList<BirthVO>();
		}
		
		lists.add(vo);

	}

	
	public void print() {
		Iterator<BirthVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			BirthVO vo = it.next();
			
			System.out.println(vo.toString());
		}
		
	}
	
	public void save() {
		
		try {
			
		if(lists!=null) {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(lists);
			
			oos.close();
			
			System.out.print("���� ���� ����");
			
			}
			
		} catch (Exception e) {
			
		}

		
	}

}

//�����ڷ� static �ٷ� �����ϴ°Ͱ� �޼ҵ�� input ���۰� ���ÿ� �޼ҵ带 �����Ű�°��� ����?
//������ if�� lists ��ü�� �������� �ʰ� input���� if�� ���� �߰��ϴ� ����?