package dao;

import model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

  public void add(Student st, String username) throws SQLException {
    String sql = "INSERT INTO Student VALUES(? , ? , ? , ? , ?)";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, st.getStudentId());
    preparedStatement.setString(2, st.getName());
    preparedStatement.setInt(3, st.getAge());
    preparedStatement.setString(4, st.getAddress());
    preparedStatement.setString(5, username);
    preparedStatement.executeUpdate();
  }

  public void update(Student st, String username) throws SQLException {
    String sql = "UPDATE Student SET name = ? , age = ? , address = ? WHERE username = ?";
    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

    preparedStatement.setString(1, st.getName());
    preparedStatement.setInt(2, st.getAge());
    preparedStatement.setString(3, st.getAddress());
    preparedStatement.setString(4, username);
    preparedStatement.executeUpdate();
  }


  public void delete(String studentId) {

    try {
      String sql = "DELETE FROM Student WHERE studentId = ?";
      PreparedStatement preparedStatement;
      preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      preparedStatement.setString(1, studentId);
      preparedStatement.executeUpdate();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public List<Student> findAll() throws SQLException {
    List<Student> listSt = new ArrayList<>();
    String sql = "SELECT * FROM Student";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      Student a = new Student();
      a.setStudentId(resultSet.getString("studentId"));
      a.setName(resultSet.getString("name"));
      a.setAge(resultSet.getInt("age"));
      a.setAddress(resultSet.getString("address"));
      a.setUsername(resultSet.getString("username"));
      listSt.add(a);
    }
    return listSt;
  }

  public Student find(String studentId) throws SQLException {
    String sql = "SELECT * FROM Student WHERE studentId = ?";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, studentId);
    ResultSet resultSet = preparedStatement.executeQuery();
    Student a = new Student();
    while (resultSet.next()) {
      a.setStudentId(resultSet.getString("studentId"));
      a.setName(resultSet.getString("name"));
      a.setAge(resultSet.getInt("age"));
      a.setAddress(resultSet.getString("address"));
      a.setUsername(resultSet.getString("username"));
      return a;
    }
    return null;
  }

  public List<Student> findSvByName(String name) throws SQLException {
    List<Student> listSv = new ArrayList<>();
    String sql = "SELECT * FROM Student WHERE name LIKE ?";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, "%" + name + "%");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      Student s = new Student();
      s.setStudentId(resultSet.getString("studentId"));
      s.setName(resultSet.getString("name"));
      s.setAge(resultSet.getInt("age"));
      s.setAddress(resultSet.getString("address"));
      s.setUsername(resultSet.getString("username"));
      listSv.add(s);
    }
    return listSv;
  }

  public static String getName(String username) {
    try {
      String sql = "SELECT name FROM Student WHERE " +
          "username = ?";
      PreparedStatement statement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

      statement.setString(1, username);
      ResultSet resultSet = statement.executeQuery();
      while (resultSet.next()) {
        return resultSet.getString("name");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }

  public static String getStudentId(String username) {
    try {
      String sql = "SELECT studentId FROM Student WHERE username = ?";
      PreparedStatement statement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      statement.setString(1, username);
      ResultSet resultSet = statement.executeQuery();
      while (resultSet.next()) {
        return resultSet.getString("studentId");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }

  public static void updatePassword(String username, String password) {
    String sql = "UPDATE Account SET password = ? WHERE username = ?";
    try {
      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      preparedStatement.setString(1, password);
      preparedStatement.setString(2, username);
      int rs = preparedStatement.executeUpdate();
      if (rs == 1) System.out.println("Update success");
      else System.out.println("Check username again");
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
