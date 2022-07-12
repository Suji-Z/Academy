package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.db.DBConn;

public class ScoreDAO {//Data Access Object
	//DB�� insert�� ��Ű�� class ����
	
	
	//�߰�(insert)
	
	public int insertData(ScoreDTO dto) {
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			/*
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql+="values ('" + dto.getHak() + "','";
			sql+=dto.getName() + "',";  //statement�� sql query �ۼ��� ���ڴ� ' '�� �� �����۾� �ʿ�
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
			//PSTMT�� value���� �� ���� dto.get-- ��� '?'�� �־��ָ� ��
			sql = "update score set kor=?,eng=?,mat=? ";
			sql += "where hak=?";
			
			pstmt = conn.prepareStatement(sql);  //PSTMT�� ������ ������� �� ���� ���� ���� �˻���(prepare)
			
			//����ǥ ������� �ۼ�
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());
			
			result = pstmt.executeUpdate(); //������ �˻簡 �̹� �����⶧���� sql �Ű������� ���� �ʿ� x
			
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
