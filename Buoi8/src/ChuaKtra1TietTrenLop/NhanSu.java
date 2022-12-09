package ChuaKtra1TietTrenLop;

import java.util.Scanner;

public class NhanSu extends Nguoi implements NgheNghiep {
  private String manv;

  private String soCmnd;

  private String ngheNghiep;

  public String getManv() {
    return manv;
  }
  private BacLuong bacLuong = new BacLuong();

  public void setManv(String manv) {
    this.manv = manv;
  }

  public BacLuong getBacLuong() {
    return bacLuong;
  }

  public void setBacLuong(BacLuong bacLuong) {
    this.bacLuong = bacLuong;
  }

  public String getSoCmnd() {
    return soCmnd;
  }

  public void setSoCmnd(String soCmnd) {
    this.soCmnd = soCmnd;
  }

  public String getNgheNghiep() {
    return ngheNghiep;
  }

  public void setNgheNghiep(String ngheNghiep) {
    this.ngheNghiep = ngheNghiep;
  }

  @Override
  public String nhapNgheNghiep() {
    return ngheNghiep;
  }

  public void input(){
    super.input();
    System.out.println(" Nhap ma nv : ");

    setManv(new Scanner(System.in).nextLine());
    bacLuong.input();

    System.out.println(" Nhap so cmnd : ");
    setSoCmnd(new Scanner(System.in).nextLine());

    System.out.println(" Nhap nghe nghiep : ");
    setNgheNghiep(new Scanner(System.in).nextLine());

  }
  public void output(){
    super.output();
    System.out.printf("%-10s %-10s %-10s" , getManv() , getSoCmnd() , getNgheNghiep());
    bacLuong.output();
  }
}
