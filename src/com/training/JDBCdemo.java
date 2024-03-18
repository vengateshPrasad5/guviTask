package com.training;

import java.sql.*;

public class JDBCdemo {
        static String url = "jdbc:mysql://localhost/empdetails";
        static String userName = "root";
        static String password = "Vengat5796!";

    public static void main(String[] args) throws SQLException {

        updateRecord();

    }

    private static void updateRecord() throws SQLException {
        Connection connection = DriverManager.getConnection(url,userName,password);

        int empCode = 123;
        String empname = "ravi";
        int empAge = 25;
        int esalary = 8000;

        String query  = "insert into employee values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,empCode);
        preparedStatement.setString(2,empname);
        preparedStatement.setInt(3,empAge);
        preparedStatement.setInt(4,esalary);

        int rows = preparedStatement.executeUpdate();
        System.out.println("no of rows inserted " + rows);
    }

}
