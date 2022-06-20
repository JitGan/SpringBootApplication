package com.example.springboot.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    public static Connection getMSSQLConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Loaded the driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/record_company1?characterEncoding=latin1&useConfigs=maxPerformance","root","warlock72!");
        return con;
    }
}
