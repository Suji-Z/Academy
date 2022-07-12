package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

//statement (기본형), ' '," "로 구분해서 자료를 추가해야함.. but 속도가 빠름
//PreparedStatement (가장 많이 씀)
//CallableStatement (procedure와 연결시 사용)


public class Test1 {

	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection();
		
		if(conn==null) {
			System.out.println("데이터베이스 연결 실패");
			System.exit(0);
		}
		
		//DB연결 방법
		//1)DriverManager가 Connection을 생성
		//2)Connection이 statement를 생성(SQL구문을 실행하는 인터페이스)
		//3)Statement가 query를 실행
		
		try {
			
			Statement stmt = conn.createStatement();
			String sql;
			
			/*
			 
			[insert]
			
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql+= "values('222','유인나',60,70,60)";
			
			int result = stmt.executeUpdate(sql);  //stmt가 sql을 실행(exec), DML문장은 insert여도 무조건 update 메소드
												   //정상실행시 1 반환, 에러시 0 반환
			
			if(result==1) {
				System.out.println("추가 성공");
			
			}
			*/
			
			//[update]
			
			/*
			sql = "update score set kor=99,eng=99,mat=99 ";
			sql+= "where hak=111";
			
			int result = stmt.executeUpdate(sql);
			
			if(result==1) {
				System.out.println("수정 성공");
			
			}
			*/
			
			//[delete]
			
			sql = "delete score where hak=111";
			
			int result = stmt.executeUpdate(sql);
			
			if(result==1) {
				System.out.println("삭제 성공");
			
			}
			
			
		} catch (Exception e) {
			System.out.println(e.toString());  //ORA- 로 시작되는 에러문구; 오라클에러.
		}
		
		DBConn.close();
		
		
	}

}
