package org.example.item;

import org.example.DBINFO;
import org.example.util.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemDB {
    private ItemCLI icli = new ItemCLI();
    private Connection conn = null;         // db 연결
    private PreparedStatement stmt = null; // sql 문장담기

    public void insert() throws SQLException {
        // System.out.println("상품 등록 기능");
        Item item = icli.inputItem();

        try {
            conn = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            stmt = conn.prepareStatement("INSERT INTO item " +
                                                "(reg_time,  created_by, item_detail, " +
                                                 "item_nm, item_sell_status, price, stock_number) " +
                                                "VALUES " +
                                                 "(NOW(), ?, ?," +
                                                 " ?, ?, ?, ?)");

            stmt.setString(1, Login.member.getName());
            stmt.setString(2, item.getItem_detail());
            stmt.setString(3, item.getItem_nm());
            stmt.setString(4, item.getItem_sell_status());
            stmt.setInt(5, item.getPrice());
            stmt.setInt(6, item.getStock_number());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            stmt.close();
        }
    }
}
