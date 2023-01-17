import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestJDBC {

  public static void main(String[] args) throws SQLException {

    /*RollBack Transaction : Nếu như trong 1 method có nhiều câu lệnh , mà 1 câu lệnh bị lỗi
     toàn bộ dữ liệu sẽ được rollback lại

     Connection conneciton = JDBCConnection.getConnection();
     gồm 2 bước :
        B1.connection.setAutoCommit(false) : chưa commit đến
        B2.connection.commit() sau khi chạy xong tất cả câu lệnh thì commit đến
    */

    //Demo 1 chuong trinh quan ly sinh vien don gian
    int chose;
    do {
      System.out.print("==>MENU QUAN LY SINH VIEN <==" +
          "\n1.Thêm sinh vien" +
          "\n2.Sửa thông tin sinh viên theo id " +
          "\n3.Xóa sinh viên theo id" +
          "\n4.Tìm sinh viên theo tên" +
          "\n5.In ra tất cả thông tin của các sinh viên" +
          "\n6.In ra tất cả thông tin sv theo thứ tự giảm dần của tuổi" +
          "\n7.Thoát chương trình");
      System.out.print("\nNhập lựa chọn của bạn : ");
      chose = new Scanner(System.in).nextInt();
      switch (chose) {
        case 1:
          insetTablePerson();
          break;
        case 2:
          updateTablePerson();
          break;
        case 3:
          deletePersonById();
          break;
        case 4:
          findPersonByName();
          break;
        case 5:
          findAll();
          break;
        case 6:
          showListSVSortDESCByAge();
          break;
        case 7: {
          System.out.println("Ket thuc chuong trinh");
          System.exit(0);
        }
      }
    } while (true);
  }

  public static void insetTablePerson() {
//Todo : Nhập dữ liệu cho Person thay vì truyền tham số vào
    SinhVien sv = new SinhVien();
    sv.input();

//Todo : Tạo connection : để quản lý các kết nối
    Connection connection = JDBCConnection.getConnection();
//Statement
//    try {
//TODO:      Statement statement = connection.createStatement();
//      String sql = "INSERT INTO Person VALUES('"+id+"' , '"+name+"' , '"+age+"')";
//      int rs = statement.executeUpdate(sql);
//      System.out.println("Rs : " + rs);//1 la ok , 0 la loi
//    } catch (SQLException throwables) {
//      throwables.printStackTrace();
//    }

    //todo : PrepareStatement va Statement : quản lý các câu lệnh
    //viet cau lenh sql truoc
    try {
      String sql = "INSERT INTO Person VALUES(? , ? , ?)";
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, sv.getId());
      preparedStatement.setString(2, sv.getNames());
      preparedStatement.setInt(3, sv.getAge());
      //Đối với prepareStatement thì lúc execute update k cần truyền vào
      //Kết quả trả về là 0 hoặc 1 , 1 là true , 0 là false
      int rs = preparedStatement.executeUpdate();
      if (rs == 1) System.out.println("Them thanh cong ");
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void updateTablePerson() {
    SinhVien sv = new SinhVien();
    sv.input();

    String sql = "UPDATE Person SET names = ? , age = ? WHERE id = ?";
    try {
      //viet truc tiep k can tao doi tuong Connection
      PreparedStatement preparedStatement = JDBCConnection.getConnection().prepareStatement(sql);
      preparedStatement.setString(1, sv.getNames());
      preparedStatement.setInt(2, sv.getAge());
      preparedStatement.setString(3, sv.getId());
      int rs = preparedStatement.executeUpdate();
      if (rs == 1) System.out.println("Sửa thanh cong ");

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void deletePersonById() {

    System.out.println(" Nhap id cua person muon xoa : ");
    String id = new Scanner(System.in).nextLine();
    String sql = "DELETE FROM Person WHERE id = ?";
    try {
      //viet truc tiep k can tao doi tuong Connection
      PreparedStatement preparedStatement = JDBCConnection.getConnection().prepareStatement(sql);
      preparedStatement.setString(1, id);
      int rs = preparedStatement.executeUpdate();
      if (rs == 1) System.out.println("Xóa thành công ");
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void findPersonByName() {

    System.out.println(" Nhập tên sinh viên : ");
    String name = new Scanner(System.in).nextLine();
    //TODO :lấy ra 1 số trường dữ liệu cần thiết thay vi lấy ra tất cả các dữ liệu

    String sql = "SELECT names , age FROM Person WHERE names LIKE ?";//in ra các sv có tên là ...
    try {
      PreparedStatement preparedStatement = JDBCConnection.getConnection().prepareStatement(sql);
      preparedStatement.setString(1, "%" + name + "%");

      ResultSet resultSet = preparedStatement.executeQuery();
      System.out.println("Name" + " Age");
      while (resultSet.next()) {
        SinhVien sv = new SinhVien();
        sv.setNames(resultSet.getString("names"));
        sv.setAge(resultSet.getInt("age"));
        System.out.println(sv.getNames() + " " + sv.getAge());
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void showListSVSortDESCByAge() {
    String sql = "SELECT * FROM Person ORDER BY age DESC";//in ra các sv có tên là ...
    try {
      PreparedStatement preparedStatement = JDBCConnection.getConnection().prepareStatement(sql);

      ResultSet resultSet = preparedStatement.executeQuery();
      title();
      while (resultSet.next()) {
        SinhVien sv = new SinhVien();
        sv.setId(resultSet.getString("id"));
        sv.setNames(resultSet.getString("names"));
        sv.setAge(resultSet.getInt("age"));
        sv.output();
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void findAll() throws SQLException {

    Connection connection = JDBCConnection.getConnection();

    String sql = "SELECT * FROM Person";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

    //đối với những câu lệnh select thì mình k cần execudeUpdate()
    //Khởi chạy câu lệnh preparestement và trả ra dữ liệu cho a
    ResultSet resultSet = preparedStatement.executeQuery();
    List<SinhVien> svs = new ArrayList<>();
    //doc du lieu tren tung dong
    while (resultSet.next()) {
      SinhVien person = new SinhVien();
      String id = resultSet.getString("id");
      int age = resultSet.getInt("age");
      person.setId(id);
      person.setNames(resultSet.getString("names"));
      person.setAge(age);
      //add vao list
      svs.add(person);
    }
    title();
    for (SinhVien i : svs) {
      i.output();
    }
  }

  public static void title() {
    System.out.printf("%-10s %-10s %-10s\n", "Id", "Name", "Age");
  }
}
