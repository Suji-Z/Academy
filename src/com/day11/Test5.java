package com.day11;

public class Test5 {

	public static void main(String[] args) {
		
		String s1 = "����,�λ�,�뱸";
		String ss[] = s1.split(","); // ","�� �����ؼ� �迭�� ���ڸ� ����
		//ex) ss[0] = ����, ss[1]= �λ� ss[2] = �뱸
		
		for(String s : ss) {
			System.out.print(s + " ");			
		}
		
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2 == s3); //false
		System.out.println(s2.equals(s3)); //false
		System.out.println(s2.equalsIgnoreCase(s3)); //Igonrecase: ��ҹ��� ������ �ʰ� ��
		
		String s4 = "abc.def.hij";
		
		System.out.println(s4.indexOf(".")); //0���� ������ �ش� ���ڰ� ó�� ��Ÿ���� �ε�����
		System.out.println(s4.lastIndexOf(".")); //�ڿ������� ������ �ش� ���ڰ� ó�� ��Ÿ���� �ε�����
		System.out.println(s4.indexOf("def")); //4
		
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����");
		
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); //a  b  c , ���� ���鸸 ����
		System.out.println(s7.replaceAll(" ", "")); //��� ���� null�� ��ü�Ͽ� ����, abc
		System.out.println(s7.replaceAll("\\s", "")); // '\\s' ����ȭ ǥ����
		
		char ch = "abcdefg".charAt(2);	//���ڿ��� index 2 (0,1,2..) �� ch�� ����
		System.out.println(ch);
		
		System.out.println("abcdefg".startsWith("abc")); //true , �ش� ���ڿ��� ������ " "�� ������ ��� true
		System.out.println("�ڹ����α׷�".startsWith("�ڹ�"));
		
		System.out.println("abcdefg".length()); //7
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//������ ����
		System.out.println(s8.compareTo(s9)); //-1 , �ƽ�Ű�ڵ带 �������� �� (e=101, f=102), e-f = -1
		System.out.println(s9.compareTo(s8)); //1  (f-e = 1)
		
	}

}
