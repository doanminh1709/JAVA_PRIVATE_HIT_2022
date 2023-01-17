package dao;

import model.Account;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

  public void add(Account tk) throws SQLException {
    String sql = "INSERT INTO Account VALUES(? , ? , ?)";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, tk.getUsername());
    preparedStatement.setString(2, tk.getPassword());
    preparedStatement.setString(3, tk.getRole());
    preparedStatement.executeUpdate();
  }

  public List<Account> getAccount() {
    try {
      List<Account> listTk = new ArrayList<>();
      String sql = "SELECT * FROM Account";
      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        Account tk = new Account();
        tk.setUsername(resultSet.getString("username"));
        tk.setPassword(resultSet.getString("password"));
        tk.setRole(resultSet.getString("role"));
        listTk.add(tk);
      }
      return listTk;
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }

  public void deleteAccount(String username) {
    try {
      String sql = "DELETE FROM Account WHERE username = ?";
      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      preparedStatement.setString(1, username);
      preparedStatement.executeUpdate();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public void updatePassword(String username, String password) {
    String sql = "UPDATE Account SET password = ? WHERE username = ?";
    try {
      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      preparedStatement.setString(1, password);
      preparedStatement.setString(2, username);
      preparedStatement.executeUpdate();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
