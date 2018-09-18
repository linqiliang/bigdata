package com.qiliang.myjdbc;


import java.sql.*;

public class jdbcTest {


    public static void main(String[] args) throws Exception {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_day2?characterEncoding=utf-8", "root", "123456");

            String sql = "select * from d_user where username = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "wang");

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                System.out.println(resultSet.getString("id") + resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(resultSet!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
