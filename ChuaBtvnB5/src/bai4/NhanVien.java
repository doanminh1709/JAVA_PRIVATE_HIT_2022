package bai4;

import java.util.Scanner;

public class NhanVien {

  private String hoTen;

  private int tuoi;

  private String gioiTinh;

  private String diaChi;

  private int soGioLv;

  private int soTienMh;

  private static Scanner scanner = new Scanner(System.in);


  public NhanVien() {
  }

  public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, int soGioLv, int soTienMh) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.gioiTinh = gioiTinh;
    this.diaChi = diaChi;
    this.soGioLv = soGioLv;
    this.soTienMh = soTienMh;
  }


  public double luong() {
    double tienLuong;
    if (getSoGioLv() >= 45) {
      tienLuong = (45 + (getSoGioLv() - 45) * 1.5) * getSoTienMh();
    } else {
      tienLuong = getSoGioLv() * getSoTienMh();
    }
    return tienLuong;
  }

  public double thue(){
    if (luong() > 300){
      return luong() * 0.2;
    }else {
      return 0;
    }
  }

  public void input() {
    System.out.println(" Nhap ho ten : ");
    setHoTen(scanner.nextLine());

    System.out.println(" Nhap tuoi : ");
    setTuoi(scanner.nextInt());
    scanner.nextLine();

    System.out.println(" Nhap gioi tinh : ");
    setGioiTinh(scanner.nextLine());

    System.out.println(" Nhap dia chi : ");
    setDiaChi(scanner.nextLine());

    System.out.println(" Nhap so gio lam viec :  ");
    setSoGioLv(scanner.nextInt());

    System.out.println(" Nhap so tien moi gio lam viec");
    setSoTienMh(scanner.nextInt());
    scanner.nextLine();


  }

  public void output(){
    System.out.printf("%-15s %-10d %-15s %-15s %-10d %-10d %-10f %10f\n" ,
        getHoTen() , getTuoi() , getGioiTinh() , getDiaChi(),
        getSoGioLv() , getSoTienMh(), luong() , thue());
  }


  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public int getSoGioLv() {
    return soGioLv;
  }

  public void setSoGioLv(int soGioLv) {
    this.soGioLv = soGioLv;
  }

  public int getSoTienMh() {
    return soTienMh;
  }

  public void setSoTienMh(int soTienMh) {
    this.soTienMh = soTienMh;
  }
}
