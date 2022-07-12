package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection dbConn;
	
	//DB���� �޼ҵ�(������ ����)
	//������ ������ �ʿ��� ���, �޼ҵ��̸��� �ٲ� �Ȱ��� �������� ��� ��� ������ָ� ��
	public static Connection getConnection()	{
		
		if(dbConn==null) {
			try {
								//type4 ���
				String url = "jdbc:oracle:thin:@localhost:1521:xe"; //���� ip�� ����Ŭ ��Ŷ��ȣ ����
				
				String user = "suzi";
				String pwd = "a1234";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url, user, pwd);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		return dbConn;
	}
	
	public static void close() {
		
		if(dbConn!=null) {
			try {
				
				if(!dbConn.isClosed()) {
					dbConn.close();
					
					
				}
				
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		dbConn=null;  //�ʱ�ȭ �� �ʿ�. (������ ���� ��)
		
		
	}
	
	
	
	
	
	
	
	

}
