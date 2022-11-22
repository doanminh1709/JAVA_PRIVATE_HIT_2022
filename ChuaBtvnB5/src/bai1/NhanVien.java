package bai1;

import java.util.Scanner;

public class NhanVien {
  private int id;

  private String hoTen;

  private String kieuNv;

  private int soNgayLam;

  private int namVaoLam;

  private static int cnt = 1;

  private static Scanner sc = new Scanner(System.in);

  //Cach tao id tang dan dua vao bien static
  public NhanVien() {
    this.id = cnt++;
  }

  //Phu cap
  public long phuCap() {
    return 100 + (2022 - namVaoLam) * 200L;
  }

  public long luong() {
    if (kieuNv.equals("San xuat")) {
//    if (kieuNv.compareTo("San xuat") == 0){
      return soNgayLam * 350L;
    } else {
      return soNgayLam * 400L;
    }
  }

  public void input() {
    System.out.print(" Nhap vao ho ten nv : ");
    setHoTen(sc.nextLine());

    String kieuNv=null;
    do {
      System.out.print(" Nhap vao kieu nhan vien : ");
       kieuNv = sc.nextLine();
    } while (!kieuNv.equals("San xuat") && !kieuNv.equals("Van phong"));
    setKieuNv(kieuNv);

    System.out.print(" Nhap vao so ngay lam : ");
    setSoNgayLam(sc.nextInt());

    System.out.print(" Nhap vao nam vao lam : ");
    setNamVaoLam(sc.nextInt());

    sc.nextLine();
  }

  public void output() {
    System.out.printf("%-10d %-15s %-10s %-10d %-10d %-10d %-10d %-10d\n",
        getId(), getHoTen(), getKieuNv(), getSoNgayLam(), getNamVaoLam(),
        luong(), phuCap(), luong() + phuCap());
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getKieuNv() {
    return kieuNv;
  }

  public void setKieuNv(String kieuNv) {
    this.kieuNv = kieuNv;
  }

  public int getSoNgayLam() {
    return soNgayLam;
  }

  public void setSoNgayLam(int soNgayLam) {
    this.soNgayLam = soNgayLam;
  }

  public int getNamVaoLam() {
    return namVaoLam;
  }

  public void setNamVaoLam(int namVaoLam) {
    this.namVaoLam = namVaoLam;
  }
}
