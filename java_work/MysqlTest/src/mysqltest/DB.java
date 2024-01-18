package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DB {
	private Connection conn;
	private Statement stmt;
	
	public void insert() {
		System.out.println("DB에 할 말 입력하기");
		
		// 예외처리
		try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.0.38/eunae?serverTimezone=UTC","eunae","1234");
			System.out.println("connection success");
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
	
	public void select() {
		Map<String, Object> tempMap = new HashMap<String, Object>();
        List<Object> resultList = new ArrayList<Object>();
		System.out.println("DB에 할 일 목록 보여주기");
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.0.38/eunae?serverTimezone=UTC","eunae","1234");
			System.out.println("connection success");
			stmt = conn.createStatement();
			
			stmt.executeLargeUpdate("use eunae");
			ResultSet rs =  stmt.executeQuery("select * from todo order by idx desc");
			
			while(rs.next()) {
				for(int i = 0 ; i < rs.getMetaData().getColumnCount();i++) {
					tempMap.put(rs.getMetaData().getColumnName(i+1), rs.getString(rs.getMetaData().getColumnName(i+1)));
				}
				resultList.add(tempMap);
                tempMap = new HashMap<>();    // tempMap reset
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Object i : resultList) {
			System.out.println(i);
		}
	};
	
	public void close() {
		System.out.println("종료합니다.");
	};
}
