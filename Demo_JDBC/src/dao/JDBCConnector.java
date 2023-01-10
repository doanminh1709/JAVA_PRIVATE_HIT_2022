package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
  public static Connection getJDBCConnection() {
    final String user = "sa";
    final String password = "1";

    final String url = "jdbc:sqlserver://localhost:1433;databaseName=qlsv_demo;user=" + user + ";password=" + password;

    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      return DriverManager.getConnection(url);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  //Cách check kết nối xem thành công hay chưa
  public static void main(String[] args) {
    Connection connection = getJDBCConnection();
    if (connection != null){
      System.out.println("Ket noi thanh cong");
    }else{
      System.out.println("Ket noi that bai");
    }
  }
}
