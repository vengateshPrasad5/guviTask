package com.training.taskmysql.java.Q2;

import java.sql.*;

public class Q2 {
    public static void main(String[] args) {

        try {
//        Connection Established
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/EmpDetails?user=root&password=Vengat5796!");
//        Data need to insert in the table
            String addSql = "INSERT INTO employee VALUES (101, 'Jenny', '25', 10000) ," +
                                                     "(102, 'Jacky', '30', 20000) , " +
                                                     "(103, 'Joe' , 20 , 40000) , " +
                                                     "(104, 'John' , 40 , 80000) , " +
                                                      "(105, 'Shameer' , 25 , 90000) ";
//        Insert data into table
            Statement statement = connection.createStatement();
            statement.executeUpdate(addSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}