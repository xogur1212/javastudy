package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

	public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://localhost:3307/LectureEvaluation";	//	

			String dbID = "root";

			String dbPassword = "6647784";

			Class.forName("com.mysql.jdbc.Driver");

				return DriverManager.getConnection(dbURL,dbID,dbPassword);	
				//���� ���� ��ü�� ��ȯ
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null; //������
	}
}
