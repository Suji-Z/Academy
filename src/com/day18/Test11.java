package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File
//���� �� ������ ������ �� �ִ� ����� �����ϴ� Ŭ����
//���� ������ ����� �ϱ����� �޼ҵ�� ����

public class Test11 {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\doc\\test.txt");		//�Ű������� ��θ� ���� inputstream ������ �־ ok
		
		System.out.println("���ϸ�: "+f.getName());
		System.out.println("���� ũ��: "+f.length());
		System.out.println("���� ���: " + f.getAbsolutePath());
		System.out.println("ǥ�� ���: " + f.getCanonicalPath());
		System.out.println("���糯: " + new Date(f.lastModified())); //����� ��¥�� Date�� �Ű�������
		System.out.println("�������: " + f.getParent());
		System.out.println("�б�Ӽ�: " + f.canRead());
		System.out.println("����Ӽ�: " + f.canWrite());
		
		//** Date : '��¥'�� �ҷ���. calendar���� ������
		
		
		
		
		
	}

}
