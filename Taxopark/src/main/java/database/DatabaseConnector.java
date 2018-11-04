package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.DatabaseConstants.*;

public class DatabaseConnector {

    private static Connection connection;
    private static boolean isConnected;

    private DatabaseConnector() {
    }

    public static Connection getConnection() {
        isConnected = false;
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(URL, USER, "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            isConnected = connection != null;
        }
        System.out.println("[Connected to database:] " + isConnected);
        return connection;
    }
}
