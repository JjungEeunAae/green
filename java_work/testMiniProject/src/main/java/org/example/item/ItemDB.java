package org.example.item;

import org.example.DBINFO;
import org.example.util.Login;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public void select() {
        List<Item> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.pw);
            stmt = con.prepareStatement("SELECT * FROM item");
            rs = stmt.executeQuery();

            while (rs.next()) {
                list.add(
                        new Item(rs.getLong("item_id"),
                                rs.getString("reg_time"),
                                rs.getString("update_time"),
                                rs.getString("created_by"),
                                rs.getString("modified_by"),
                                rs.getString("item_detail"),
                                rs.getString("item_nm"),
                                rs.getString("item_sell_status"),
                                rs.getInt("price"),
                                rs.getInt("stock_number"))
                );
            }

            for(int i = 0 ; i < list.size() ; i++) {
                System.out.println(list.get(i).getItem_id() + "\t" +
                                    list.get(i).getItem_nm() + "\t" +
                                    list.get(i).getItem_sell_status() + "\t" +
                                    list.get(i).getItem_detail() + "\t");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
