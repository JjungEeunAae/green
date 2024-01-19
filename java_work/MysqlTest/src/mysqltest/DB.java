package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	
	public void insert(String a, String b) {
		System.out.println("DB에 할 말 입력하기");
		
		try {
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			sql = "INSERT INTO todo (`할일`,`상태`) VALUES (?,?)";
			// ProparedStatement : SQL 문에 매개변수를 전달하는 데 사용
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
            // 파라미터 설정
            preparedStatement.setString(1, a);
            preparedStatement.setString(2, b);

            // 쿼리 실행
            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("데이터가 성공적으로 삽입되었습니다.");
            } else {
                System.out.println("데이터 삽입 실패");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
	
	public void select() {
		try {
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			stmt = conn.createStatement();
			
			rs =  stmt.executeQuery("SELECT * FROM todo ORDER BY idx DESC");
			
			// 제목열 다음으로 값이 있으면 true 없으면 false
			while(rs.next()) {
				System.out.println(rs.getInt("idx") + ". " + rs.getString("할일") + " [" + rs.getString("상태") + "]");
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
	
	public void update(String a, String b, int idx) {
		try {
			// DB 커넥
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			// 사용할 SQL 쿼리문 작성
			sql = "UPDATE todo SET `할일` = ?, `상태` = ? WHERE `idx` = ?";
			// SQL로 입력값 넘겨주기
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, a);
			pre.setString(2, b);
			pre.setInt(3, idx);
			
			// 쿼리실행
			int rowsAffected = pre.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("수정완료");
			} else {
				System.out.println("수정이 되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
	
	public void delete(int idx) {
		try {
			// SQL 커넥
			conn = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			// sql 쿼리
			sql = "DELETE FROM todo WHERE `idx` = ?";
			// 파라미터 값 받아오기
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setInt(1, idx);
			
			int rowsAffected = pre.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("삭제완료");
			} else {
				System.out.println("삭제되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		System.out.println("종료합니다.");
	};
}
