import java.util.Scanner;

public class SinhVien {

  private String msv;
  private int tuoi;
  public String gioitinh;
  static String college = "Bưu Chính Viễn Thông";

  static void change() {
    // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
    college = "Đại Học Công Nghiệp";
  }

  //Khai báo biến static
  private static Scanner scanner = new Scanner(System.in);

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public String getGioitinh() {
    return gioitinh;
  }

  public void setGioitinh(String gioitinh) {
    this.gioitinh = gioitinh;
  }

  public void input() {
//    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap masv : ");
    setMsv(scanner.nextLine());

    System.out.println(" Nhap tuoi : ");
    setTuoi(scanner.nextInt());

    //Xu ly cai truong hop ma khi nhập số sau nhập chuỗi
    scanner.nextLine();

    System.out.println(" Nhap gioi tinh : ");
    setGioitinh(scanner.nextLine());
  }


  public void output() {
//    System.out.println(" Ma sv : " + getMsv());
//
//    System.out.println(" Tuoi : "+ getTuoi());
//
//    System.out.println(" Gioi tinh : " + getGioitinh());

    System.out.printf("%-10s %-10d %-10s %-10s\n"
        , getMsv(), getTuoi(), getGioitinh(), college);
  }

  public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

    System.out.println(" Nhap n sinh vien : ");
    int n = scanner.nextInt();
    scanner.nextLine();

//    SinhVien sv1 = new SinhVien();
//    SinhVien sv2 = new SinhVien();
//    SinhVien sv3 = new SinhVien();
//
//    sv1.input();
//    sv2.input();
//    sv3.input();


    SinhVien[] sv = new SinhVien[n];

    for (int i = 0; i < n; i++) {
      sv[i] = new SinhVien();
      sv[i].input();
    }

    System.out.printf("%-10s %-10s %-10s %-10s\n"
        , "Ma sv", "Tuoi", "Gioi tinh\n", "Truong");
    change();
    for (int i = 0; i < n; i++) {
      sv[i].output();
    }

  }
}
