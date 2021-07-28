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
					
			pstmt = conn.prepareStatement(SQL);	//sql��

			pstmt.setString(1, userID); //?��ȣ�� ����

			rs = pstmt.executeQuery();	//���� ��� ��ȸ select�����ſ���

			if(rs.next()) {//����� �����ϸ�

				if(rs.getString(1).equals(userPassword))	//��й�ȣ �����°Ͱ� ��ġ�ϸ�

					return 1; // �α��� ����

				else

					return 0; // ��й�ȣ Ʋ��

			}

			return -1; // ���̵� ����

		} catch (SQLException e) {

			e.printStackTrace();

		}finally {
			try{if(conn != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(pstmt != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(rs != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			
			
			
		}

		return -2; // �����ͺ��̽� ����

	}//login end
	public int join(UserDTO user) {

		String SQL = "INSERT INTO USER VALUE (?,?,?,?,false)";
		
		PreparedStatement pstmt = null;

		Connection conn=null;;

		 ResultSet rs=null;

		try {	
			conn=DatabaseUtil.getConnection();
					
			pstmt = conn.prepareStatement(SQL);	//sql��

			pstmt.setString(1, user.getUserID()); //?��ȣ�� ����
			pstmt.setString(2, user.getUserPassword()); //?��ȣ�� ����
			pstmt.setString(3, user.getUserEmail()); //?��ȣ�� ����
			pstmt.setString(4, user.getUserEmailHash()); //?��ȣ�� ����
			
			return pstmt.executeUpdate();//insert,delete,update���� ������ 1
		} catch (SQLException e) {

			e.printStackTrace();

		}finally {
			try{if(conn != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(pstmt != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(rs != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			
			
			
		}

		return -1; // �����ͺ��̽� ���� or ȸ������ ����

	}//join end
	public int getUserEmailChecked(String userID) {

		String SQL = "SELECT userEmailChecked FROM USER WHERE userID= ?";
		PreparedStatement pstmt = null;		
		Connection conn=null;
		ResultSet rs=null;

		try {	
			conn=DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);	//sql��
			pstmt.setString(1, userID); //?��ȣ�� ����
			
			
			return pstmt.executeUpdate();//insert,delete,update���� ������ 1
		} catch (SQLException e) {

			e.printStackTrace();

		}finally {
			try{if(conn != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(pstmt != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			try{if(rs != null) conn.close();}catch (Exception e) {e.printStackTrace();}
			
			
			
		}

		return -1; // �����ͺ��̽� ���� or ȸ������ ����

	}//join end

	

	

}



