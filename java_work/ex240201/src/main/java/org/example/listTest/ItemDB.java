package org.example.listTest;

import org.example.listTest.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDB {
    private String dbURL = "jdbc:mysql://192.168.0.38:3306/eunae";
    private String dbUSER = "eunae";
    private String dbPW = "1234";

    public List<Item> findAll() {
        List<Item> list = new ArrayList<>();

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(dbURL, dbUSER, dbPW);
            stmt = con.prepareStatement("SELECT * FROM item");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Item item = new Item();

                item.setItem_nm(rs.getString("item_nm"));
                item.setPrice(rs.getInt("price"));
                item.setItem_id(rs.getLong("item_id"));
                item.setReg_time(rs.getString("reg_time"));
                item.setItem_detail(rs.getString("item_detail"));
                item.setItem_sell_status(rs.getString("item_sell_status"));

                list.add(item);
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
        return list;
    }
}
