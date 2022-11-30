import java.util.Scanner;

public class Student {
  private String maSv;

  private String hoTen;

  private int tuoi;

  private String gioiTinh;

  private static Scanner scanner = new Scanner(System.in);

  public void input() {
    System.out.println(" Nhap msv : ");
    setMaSv(scanner.nextLine());

    System.out.println(" Nhap ho ten : ");
    setHoTen(scanner.nextLine());

    System.out.println(" Nhap tuoi : ");
    setTuoi(scanner.nextInt());
    scanner.nextLine();

    System.out.println(" Nhap gioi tinh : ");
    setGioiTinh(scanner.nextLine());
  }

  public void output() {
    System.out.printf("%-10s %-10s %-10d %-10s\n",
        getMaSv(), getHoTen(), getTuoi(), getGioiTinh());
  }

  public Student(){}
  public Student(String maSv, String hoTen, int tuoi, String gioiTinh) {
    this.maSv = maSv;
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.gioiTinh = gioiTinh;
  }

  public String getMaSv() {
    return maSv;
  }

  public void setMaSv(String maSv) {
    this.maSv = maSv;
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
}
