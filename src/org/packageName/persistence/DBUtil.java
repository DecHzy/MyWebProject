package org.packageName.persistence;


import java.sql.*;

public class DBUtil {
    private final static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private final static String CONNECTION_STRING= "jdbc:mysql://localhost:3306/demo";
    //?useUnicode=true&characterEncoding=utf8&useSSL=false
    //黄章延的mysql对应的账号密码
    private final static String USERNAME = "root";
    private final static String PASSWORD = "123456";

    public static Connection getConnection() throws Exception {
        Class.forName(DRIVER_CLASS);
        Connection connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        return connection;
    }

    public static void closeConnection(Connection connection) throws Exception {
        if (connection != null) {
            connection.close();
        }
    }

    public static void closeStatement(Statement statement) throws Exception {
        if (statement != null) {
            statement.close();
        }
    }

    public static void closePreparedStatement(PreparedStatement preparedStatement) throws Exception {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
    }

    public static void closeResultSet(ResultSet resultSet) throws Exception {
        if (resultSet != null) {
            resultSet.close();
        }
    }

    public static void main(String[] args) {
        try {
            Connection connection=DBUtil.getConnection();
            System.out.println(connection.toString());
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }

    }
}