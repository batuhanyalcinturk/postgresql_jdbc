package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Constants {
    public static final String USER = "postgres";

    public static final String PASSWORD = "159951";

    public static final String URL = "jdbc:postgresql://localhost:5432/OBS";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
