package org.example.cart;

import org.example.DBINFO;

import java.sql.*;

public class CartDB {
    private CartCLI ccli = new CartCLI();

    public void insert() {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            stmt = con.prepareStatement("");
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
