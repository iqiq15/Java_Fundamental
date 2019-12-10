package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnection=true",
					"acorn12",
					"acorn12");
			System.out.println("데이터 베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?;");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, "MININGS");
			pstmt.setString(2, "SILICONVALLEY");
			pstmt.setInt(3, 60);
			
			int result = pstmt.executeUpdate();
			
			System.out.println("갱신된 행의 수 : "+result);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
}
