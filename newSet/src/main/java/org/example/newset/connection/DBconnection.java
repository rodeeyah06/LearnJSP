package org.example.newset.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static Connection connection = null;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce");
            System.out.println("Connected to database");
        }
        return connection;
    }


}
