/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DatabaseHelper {

    /**
     * Kết nối với CSDL
     */
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String dburl = "jdbc:mysql://localhost:3307/qlct";
    private static String username = "root";
    private static String password = "hoangtue1998";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     *
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     */
    public static PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, username, password);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = connection.prepareCall(sql);
        } else {
            pstmt = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    /**
     *
     * @param sql
     * @param args
     */
    public static void executeUpdate(String sql, Object... args) {
        try {

            PreparedStatement stmt = prepareStatement(sql, args);
            try {
                stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param sql
     * @param args
     * @return
     */
    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement stmt = prepareStatement(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
