package dao;

import model.SinhVien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {

  public void add(SinhVien sv) throws SQLException {
    String sql = "INSERT INTO SinhVien VALUES(? , ? , ? , ?)";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, sv.getMsv());
    preparedStatement.setString(2, sv.getHoTen());
    preparedStatement.setInt(3, sv.getTuoi());
    preparedStatement.setString(4, sv.getDiaChi());

    preparedStatement.executeUpdate();//update lại database
  }

  public void update(SinhVien sv) throws SQLException {
    String sql = "UPDATE SinhVien SET hoten = ? , tuoi = ? , diachi = ? WHERE masv = ?";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

    preparedStatement.setString(1, sv.getHoTen());
    preparedStatement.setInt(2, sv.getTuoi());
    preparedStatement.setString(3, sv.getDiaChi());
    preparedStatement.setString(4, sv.getMsv());

    preparedStatement.executeUpdate();//update lại database
  }


  public void delete(String masv) throws SQLException {
    String sql = "DELETE FROM SinhVien WHERE masv = ?";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, masv);

    preparedStatement.executeUpdate();//update lại database
  }

  public List<SinhVien> findAll() throws SQLException {
    List<SinhVien> listSv = new ArrayList<>();
    String sql = "SELECT * FROM SinhVien";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      SinhVien a = new SinhVien();
      a.setMsv(resultSet.getString("masv"));
      a.setHoTen(resultSet.getString("hoten"));
      a.setTuoi(resultSet.getInt("tuoi"));
      a.setDiaChi(resultSet.getString("diachi"));
      listSv.add(a);
    }
    return listSv;
  }

  public SinhVien find(String msv) throws SQLException {
    String sql = "SELECT * FROM SinhVien WHERE masv = ?";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, msv);
    ResultSet resultSet = preparedStatement.executeQuery();
    SinhVien s = new SinhVien();
    while (resultSet.next()) {
      s.setMsv(resultSet.getString("masv"));
      s.setHoTen(resultSet.getString("hoten"));
      s.setTuoi(resultSet.getInt("tuoi"));
      s.setDiaChi(resultSet.getString("diachi"));
    }
    return s;
  }

  public List<SinhVien> findSvByName(String hoten) throws SQLException {
    List<SinhVien> listSv = new ArrayList<>();
    String sql = "SELECT * FROM SinhVien WHERE hoten LIKE ?";

    PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
    preparedStatement.setString(1, "%" + hoten + "%");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      SinhVien s = new SinhVien();
      s.setMsv(resultSet.getString("masv"));
      s.setHoTen(resultSet.getString("hoten"));
      s.setTuoi(resultSet.getInt("tuoi"));
      s.setDiaChi(resultSet.getString("diachi"));
      listSv.add(s);
    }
    return listSv;
  }

}
