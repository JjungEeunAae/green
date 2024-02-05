package org.example.cart;

import org.example.DBINFO;
import org.example.util.Login;

import javax.security.auth.login.LoginContext;
import java.sql.*;

public class CartDB {
    private CartCLI ccli = new CartCLI();

    public void insert() {
        // 장바구니 등록
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            // insert를 두 번 진행해야 한다(cart, cart_item)
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            stmt = con.prepareStatement("INSERT INTO cart (reg_time, update_time, created_by, member_id) VALUES (NOW(), NOW(), ?, ?)");

            stmt.setString(1, Login.member.getName());
            stmt.setLong(2, Login.member.getMember_id());

            stmt.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException s) {
            System.err.println("장바구니가 이미 있습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertItem() {
        int item_id = ccli.inputItem(); // 상품번호 입력

        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            stmt = con.prepareStatement("INSERT INTO cart_item (`count`, cart_id, item_id) VALUES (2, 10, ?)");

            stmt.setInt(1, item_id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
