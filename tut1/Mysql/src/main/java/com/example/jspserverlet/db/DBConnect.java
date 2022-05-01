package com.example.jspserverlet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/book_db";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "1";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
