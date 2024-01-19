package mysqltest;

import java.sql.Connection;
import java.sql.Statement;

public class INFO {
	private Connection conn;
	private Statement stmt;
	
	static final String JDBC_URL = "jdbc:mysql://192.168.0.38/eunae?serverTimezone=UTC";
    static final String USERNAME = "eunae";
    static final String PASSWORD = "1234";
}
