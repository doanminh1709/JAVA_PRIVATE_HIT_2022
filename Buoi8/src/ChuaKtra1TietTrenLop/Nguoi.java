package ChuaKtra1TietTrenLop;

import java.util.Scanner;

public class Nguoi {
  private String hoTen;

  private String ngaySinh;

  private String gioiTinh;

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(String ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Nhap ho ten : ");
    setHoTen(sc.nextLine());

    System.out.println(" Nhap ngay sinh : ");
    setNgaySinh(sc.nextLine());

    System.out.println(" Nhap gioi tinh : ");
    setGioiTinh(sc.nextLine());

  }

  public void output() {
    System.out.printf("%-10s %-10s %-10s ",
        getHoTen(), getNgaySinh(), getGioiTinh());
  }

}
