package main;

import dao.SinhVienDAO;
import dao.TaiKhoanDAO;
import model.SinhVien;
import model.TaiKhoan;
import services.SinhVienService;
import services.imp.SinhVienServiceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainSinhVien {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws SQLException {
    int chose = 0;
    do {
      System.out.println(" Dang nhap vao he thong");
      System.out.println(" Nhap vao tai khoan cua ban : ");
      String taiKhoan = scanner.nextLine();
      System.out.println(" Nhap vao mat khau cua ban : ");
      String matkhau = scanner.nextLine();

      //neu nhu dung tai khoan cua thang admin
      List<TaiKhoan> taiKhoans = listTk();
      for (int i = 0; i < taiKhoans.size(); i++) {
        if (taiKhoan.equals("admin") && matkhau.equals(taiKhoans.get(i).getMatKhau())) {
          System.out.println("Day la tai khoan admin");
          do {
            System.out.println(" MENU QUAN LY CAC CHUC NANG CUA ADMIN ");
            System.out.println("1.Them sinh vien ");
            System.out.println("2.Xoa sinh vien theo ma sv");
            System.out.println("3.Tim sinh vien theo ten ");
            System.out.println("4.Tim sinh vien theo ma sv ");
            System.out.println("5.Dang xuat ");
            System.out.println(" Lua chon chuc nang ");
            chose = scanner.nextInt();
            scanner.nextLine();
            switch (chose) {
              case 1: {
                themSv();
                break;
              }
              case 2: {
                xoaSvTheoMsv();
                break;
              }
              case 3: {
                timSvTheoTen();
                break;
              }
              case 4: {
                timSvTheoMsv();
                break;
              }
            }

          } while (chose != 5);
          break;
        }
        //day la tai khoan cua user
        if (!taiKhoan.equals("admin") && taiKhoan.equals(taiKhoans.get(i).getTenTk())
            && matkhau.equals(taiKhoans.get(i).getMatKhau())) {
          System.out.println("Day la tai khoan user");
          do {
            System.out.println(" MENU QUAN LY CAC CHUC NANG CUA USER ");
            System.out.println("1.Sua thong tin cua minh ");
            System.out.println("2.Them mon hoc dang ki ");
            System.out.println("3.Xoa mon hoc dang ");
            System.out.println("4.Dang xuat ");
            chose = scanner.nextInt();
            scanner.nextLine();
            switch (chose) {
              case 1: {
                suaThongTinSv();
                break;
              }
              case 2: {
                System.out.println("Them mon hoc thanh cong");
                break;
              }
              case 3: {
                System.out.println("Huy hoc  phan thanh cong");
                break;
              }
            }
          } while (chose != 4);
        }
        //tai khoan khong hop le
        if (!taiKhoan.equals(taiKhoans.get(i).getTenTk())
            && !matkhau.equals(taiKhoans.get(i).getMatKhau())) {
          System.out.println("Tai khoan khong ton tai");
          break;
        }
      }
    } while (true);
  }

  public static void themSv() throws SQLException {
    SinhVienServiceImp sinhVienServiceImp = new SinhVienServiceImp();
    SinhVienDAO sinhVienDAO = new SinhVienDAO();
    SinhVien sinhVien = new SinhVien();

    sinhVienServiceImp.input(sinhVien);
    sinhVienDAO.add(sinhVien);
    System.out.println("Them sv thanh cong");
  }

  public static void xoaSvTheoMsv() {
    SinhVienDAO sinhVienDAO = new SinhVienDAO();
    System.out.println(" Nhap ma sv muon xoa :");
    String msv = scanner.nextLine();

    try {
      sinhVienDAO.delete(msv);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    System.out.println("Xoa sinh vien thanh cong");
  }

  public static void timSvTheoTen() {
    SinhVienDAO sinhVienDAO = new SinhVienDAO();
    System.out.println(" Nhap ten sv muon tim ");
    String hoten = scanner.nextLine();

    try {
      List<SinhVien> sinhViens = sinhVienDAO.findSvByName(hoten);
      for (SinhVien sv :
          sinhViens) {
        System.out.println(sv.getMsv() + " " + sv.getHoTen() + " " + sv.getTuoi() + " " + sv.getDiaChi());
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void timSvTheoMsv() throws SQLException {
    SinhVienDAO sinhVienDAO = new SinhVienDAO();
    System.out.println(" Nhap ma sv muon tim ");
    String msv = scanner.nextLine();
    try {
      SinhVien sv = sinhVienDAO.find(msv);
      System.out.printf("%-10s %-10s %-10s %-10s\n", "Msv", "Ho ten", "Tuoi", "Dia chi");
      System.out.printf("%-10s %-10s %-10d %-10s\n", sv.getMsv(), sv.getHoTen(), sv.getTuoi(), sv.getDiaChi());
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void inDanhSinhVien() {
    SinhVienDAO sinhVienDAO = new SinhVienDAO();
    try {
      List<SinhVien> sinhViens = sinhVienDAO.findAll();
      System.out.println("Danh sach sinh vien ");
      System.out.printf("%-10s %-10s %-10s %-10s\n", "Msv", "Ho ten", "Tuoi", "Dia chi");
      for (SinhVien sv :
          sinhViens) {
        System.out.printf("%-10s %-10s %-10d %-10s\n", sv.getMsv(), sv.getHoTen(), sv.getTuoi(), sv.getDiaChi());
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void suaThongTinSv() throws SQLException {
    SinhVienService sinhVienService = new SinhVienServiceImp();
    SinhVienDAO sinhVienDAO = new SinhVienDAO();
    SinhVien sinhVien = new SinhVien();

    sinhVienService.input(sinhVien);
    sinhVienDAO.update(sinhVien);
    System.out.println("Sua thong tin thanh cong");
  }

  //tai khoan
  public static List<TaiKhoan> listTk() {
    TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
    return taiKhoanDAO.getAccount();
  }
}
