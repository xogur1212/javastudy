package user;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import Util.DatabaseUtil;



public class UserDAO {

	public int login(String userID, String userPassword) {

		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
		
		PreparedStatement pstmt = null;

		Connection conn=null;;

		 ResultSet rs=null;

		try {	
			conn=DatabaseUtil.getConnection();
					
			pstmt = conn.prepareStatement(SQL);	//sql문

			pstmt.setString(1, userID); //?번호에 대입

			rs = pstmt.executeQuery();	//실행 결과 조회 select같은거에씀

			if(rs.next()) {//결과가 존재하면

				if(rs.getString(1).equals(userPassword))	//비밀번호 가져온것과 일치하면

					return 1; // 로그인 성공

				else

					return 0; // 비밀번호 틀림

			}

			return -1; // 아이디 없음

		} catch (SQLException e) {

			e.printStackTrace();

		}finally {
			try{if(conn != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(pstmt != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(rs != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			
			
			
		}

		return -2; // 데이터베이스 오류

	}//login end
	public int join(UserDTO user) {

		String SQL = "INSERT INTO USER VALUE (?,?,?,?,false)";
		
		PreparedStatement pstmt = null;

		Connection conn=null;;

		 ResultSet rs=null;

		try {	
			conn=DatabaseUtil.getConnection();
					
			pstmt = conn.prepareStatement(SQL);	//sql문

			pstmt.setString(1, user.getUserID()); //?번호에 대입
			pstmt.setString(2, user.getUserPassword()); //?번호에 대입
			pstmt.setString(3, user.getUserEmail()); //?번호에 대입
			pstmt.setString(4, user.getUserEmailHash()); //?번호에 대입
			
			return pstmt.executeUpdate();//insert,delete,update에씀 성공시 1
		} catch (SQLException e) {

			e.printStackTrace();

		}finally {
			try{if(conn != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(pstmt != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(rs != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			
			
			
		}

		return -1; // 데이터베이스 오류 or 회원가입 실패

	}//join end
	public int getUserEmailChecked(String userID) {

		String SQL = "SELECT userEmailChecked FROM USER WHERE userID= ?";
		PreparedStatement pstmt = null;		
		Connection conn=null;
		ResultSet rs=null;

		try {	
			conn=DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);	//sql문
			pstmt.setString(1, userID); //?번호에 대입
			
			
			return pstmt.executeUpdate();//insert,delete,update에씀 성공시 1
		} catch (SQLException e) {

			e.printStackTrace();

		}finally {
			try{if(conn != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(pstmt != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(rs != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			
			
			
		}

		return -1; // 데이터베이스 오류 or 회원가입 실패

	}//join end

	

	

}



