package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {

    public void insert(Member mem) {
        try {
            Connection con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            PreparedStatement pstmt = con.prepareStatement("insert into member " +
                    "(reg_time, update_time, created_by, modified_by, address, email, name, password, role) " +
                    "values " +
                    "(now(),NOW(),'','',?,?,?,?,'user')");
            pstmt.setString(1, mem.getAddr());
            pstmt.setString(2, mem.getEmail());
            pstmt.setString(3, mem.getName());
            pstmt.setString(4, mem.getPassword());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("정상종료");
    }
}
