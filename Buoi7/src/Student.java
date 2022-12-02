import java.util.Scanner;

public class Student extends Person {

  private String masv;

  private String tenLop;

  private int khoaHoc;

  //Kế thừa : Sử dụng lại những thuộc tính và phương thức của thằng cha mà class con được sử dụng


  public Student() {
    super();
  }

  public Student(String name, String diaChi, int tuoi, String masv, String tenLop, int khoaHoc) {
    super(name, diaChi, tuoi);// Gọi đến cái constructor của thằng cha
//    this.diaChi = diaChi;
    this.masv = masv;
    this.tenLop = tenLop;
    this.khoaHoc = khoaHoc;
  }

  public Student(String masv, String tenLop, int khoaHoc) {
    this.masv = masv;
    this.tenLop = tenLop;
    this.khoaHoc = khoaHoc;
  }

  public String getMasv() {
    return masv;
  }

  public void setMasv(String masv) {
    this.masv = masv;
  }

  public String getTenLop() {
    return tenLop;
  }

  public void setTenLop(String tenLop) {
    this.tenLop = tenLop;
  }

  public int getKhoaHoc() {
    return khoaHoc;
  }

  public void setKhoaHoc(int khoaHoc) {
    this.khoaHoc = khoaHoc;
  }

  public void input(){
    //Supper : Từ khóa dùng để tham chiếu đến thằng cha gần nhất
    //supper. gọi đến các phương thức của thằng cha đã định nghĩa sẵn
    super.input();

    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap ma sv : ");
    setMasv(scanner.nextLine());

    System.out.println(" Nhap ten lop : ");
    setTenLop(scanner.nextLine());

    System.out.println(" Nhap nien khoa : ");
    setKhoaHoc(scanner.nextInt());
  }

  public void output(){
    //Sử dụng keyword này để tham chiếu đến thằng cha
    super.output();

    System.out.printf("%-10s %-10s %-10d" ,
        getMasv() , getTenLop() , getKhoaHoc());
  }
}
