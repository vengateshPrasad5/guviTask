package com.training;

import java.sql.*;

public class JDBCdemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employeedb?user=root&password=Vengat5796!");

        PreparedStatement preparedStatement = connection.prepareStatement(" SELECT * FROM employee");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
         System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
        }
    }

}
