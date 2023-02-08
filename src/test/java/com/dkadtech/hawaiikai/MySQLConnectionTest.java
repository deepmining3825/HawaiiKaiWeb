package com.dkadtech.hawaiikai;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hawaiikai?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";

    private static final String USER = "ekzm3825";

    private static final String PASSWORD = "gjsqud-010";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
