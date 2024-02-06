package org.example;

import org.example.enums.Role;

import javax.xml.transform.Result;
import java.sql.*;

public class ENUM_STUDY_DB {
    private final String url = "jdbc:mysql://192.168.0.38/eunae";
    private final String username = "eunae";
    private final String pw = "1234";
    private PreparedStatement pr = null;
    private Connection con = null;
    public void insert() {
        try {
            con = DriverManager.getConnection(url, username, pw);
            pr = con.prepareStatement("INSERT INTO enum_study " +
                                            " (ROLE) " +
                                            "VALUES " +
                                            " (?)");
            pr.setString(1, Role.ADMIN.toString());

            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pr.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public void select() {
        try {
            con = DriverManager.getConnection(url, username, pw);
            pr = con.prepareStatement("SELECT * FROM enum_study");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getLong("id") + "\t" + rs.getString("role"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void delete(int id) {
        try {
            con = DriverManager.getConnection(url, username, pw);
            pr = con.prepareStatement("DELETE " +
                                            "FROM enum_study " +
                                           "WHERE id = ?");
            pr.setLong(1, id);

            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pr.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public void update(int id) {
        try {
            con = DriverManager.getConnection(url, username, pw);
            pr = con.prepareStatement("UPDATE enum_study " +
                                             "SET ROLE = 'user' " +
                                           "WHERE id = ?");
            pr.setLong(1, id);
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pr.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
