package database;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DB implements interfaces {
    Connection conn;

    @Override
    public void print() {

    }

    public DB() {
        String url = "jdbc:sqlserver://DESKTOP-2TIF5O4\\sqlexpress;databaseName=facebook";
        String user = "sa";
        String password = "nameuser";
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Not connected");
            e.printStackTrace();
        }
    }
}