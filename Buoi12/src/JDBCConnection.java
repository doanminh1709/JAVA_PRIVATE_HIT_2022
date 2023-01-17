import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

  //DriverManager :1 class quản lý database driver( trình quản lý cơ sở dữ liệu)
  //Driver : 1 interface giao tiếp với cở sở dữ liệu
  //Connection : Quản lý các kết nối từ database đến server
  //Statement : Quản lý các câu lệnh thao tác với csdl
  //ResultSet : Trả về 1 tập kết quả
  //SQLException

  public static Connection getConnection(){
    final String user = "sa";
    final String password = "1";

    String url = "jdbc:sqlserver://localhost:1433;databaseName=test_jdbc;user="+user+";password="+password;
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      return DriverManager.getConnection(url);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  //cách check xem kết nối đã thành công hay chưa
  public static void main(String[] args) {
    Connection connection = getConnection();
    if (connection != null){
      System.out.println("Ket noi thanh cong");
    }else{
      System.out.println("Ket noi that bai");
    }
  }
}
