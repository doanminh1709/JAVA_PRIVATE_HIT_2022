package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
  public static Connection getJDBCConnection() {
    final String user = "sa";
    final String password = "1";

    final String url = "jdbc:sqlserver://localhost:1433;databaseName=qlsv;user=" + user + ";password=" + password;

    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      return DriverManager.getConnection(url);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
