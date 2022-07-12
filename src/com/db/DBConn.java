package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection dbConn;
	
	//DB연결 메소드(연결자 생성)
	//여러개 연결이 필요할 경우, 메소드이름만 바꿔 똑같은 형식으로 블록 블록 만들어주면 됨
	public static Connection getConnection()	{
		
		if(dbConn==null) {
			try {
								//type4 방식
				String url = "jdbc:oracle:thin:@localhost:1521:xe"; //서버 ip와 오라클 패킷번호 연결
				
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
		
		dbConn=null;  //초기화 꼭 필요. (여러개 연결 시)
		
		
	}
	
	
	
	
	
	
	
	

}
