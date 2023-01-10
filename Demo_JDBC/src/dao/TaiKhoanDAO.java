package dao;

import model.TaiKhoan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAO {

  public List<TaiKhoan> getAccount() {

    try {
      List<TaiKhoan> listTk = new ArrayList<>();
      String sql = "SELECT tentk , matkhau FROM TaiKhoan";
      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        TaiKhoan tk = new TaiKhoan();
        tk.setTenTk(resultSet.getString("tentk"));
        tk.setMatKhau(resultSet.getString("matkhau"));
        listTk.add(tk);
      }
      return listTk;
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }
}
