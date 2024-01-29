package org.example.member;

import org.example.DBINFO;

import java.sql.*;

public class MemberDB {
    public MemberCLI cli = new MemberCLI();
    public void insert() {
        Member mem = cli.inputMember();
        boolean result = findByEmail(mem.getEmail());

        if(!result) {
            Connection con = null;
            try {
                con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
                PreparedStatement pstmt = con.prepareStatement("insert into member " +
                        "(reg_time, update_time, created_by, modified_by, address, email, name, password, role) " +
                        "values " +
                        "(NOW(),NOW(),'','',?,?,?,?,'user')");
                pstmt.setString(1, mem.getAddress());
                pstmt.setString(2, mem.getEmail());
                pstmt.setString(3, mem.getName());
                pstmt.setString(4, mem.getPassword());
                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(null != con) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println("입력되었습니다.");
        } else {
            System.err.println("중복된 아이디가 있습니다.");
        }

    }

    // 아이디 중복 확인
    public boolean findByEmail(String email) {
        // 중복되는 아이디가 있으면 true, 없으면 false
        try {
            Connection conn = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM member WHERE email = ?");
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();

            if(result.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Member login() {
        Member mem = cli.loginMember();

        try {
            Connection conn = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            PreparedStatement pre = conn.prepareStatement("SELECT * FROM member WHERE email = ? AND password = ?");
            pre.setString(1, mem.getEmail());
            pre.setString(2, mem.getPassword());

            ResultSet rs = pre.executeQuery();

            if(rs.next()) {
                mem.setName(rs.getString("name"));
                mem.setRole(rs.getString("role"));
                System.out.println("로그인 성공!");
                return mem;
            } else {
                System.err.println("로그인 실패, 이메일과 패스워드를 확인하세요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
