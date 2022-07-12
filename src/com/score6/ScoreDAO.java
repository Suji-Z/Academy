package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.db.DBConn;

public class ScoreDAO {//Data Access Object
	//DB에 insert만 시키는 class 역할
	
	
	//추가(insert)
	
	public int insertData(ScoreDTO dto) {
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			/*
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql+="values ('" + dto.getHak() + "','";
			sql+=dto.getName() + "',";  //statement로 sql query 작성시 문자는 ' '로 꼭 구분작업 필요
			sql+=dto.getKor() + ",";
			sql+=dto.getEng() + ",";
			sql+=dto.getMat() + ")";
			*/
			
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql+= "values(?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	//update
	public int updateData(ScoreDTO dto) {
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			//PSTMT는 value값이 들어갈 곳에 dto.get-- 대신 '?'로 넣어주면 됨
			sql = "update score set kor=?,eng=?,mat=? ";
			sql += "where hak=?";
			
			pstmt = conn.prepareStatement(sql);  //PSTMT는 본인이 만들어질 때 먼저 문법 등을 검사함(prepare)
			
			//물음표 순서대로 작성
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());
			
			result = pstmt.executeUpdate(); //위에서 검사가 이미 끝났기때문에 sql 매개변수를 넣을 필요 x
			
			pstmt.close();
	
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
	public int deleteData(String delhak) {
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			sql = "delete score where hak = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,delhak);
			
			result = pstmt.executeUpdate();
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
		
		
		
	}
	

}
