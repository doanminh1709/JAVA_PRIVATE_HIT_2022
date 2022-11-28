import java.util.Scanner;

public class HocSinh {
  private String msv;

  private String tenSv;

  private int tuoi;

  private LopHoc lopHoc = new LopHoc();

  public HocSinh(){}
//  public HocSinh(String msv, String tenSv, int tuoi , LopHoc lopHoc) {
//    this.msv = msv;
//    this.tenSv = tenSv;
//    this.tuoi = tuoi;
//    this.lopHoc = new LopHoc();
//  }
//  public HocSinh(String msv, String tenSv, int tuoi) {
//    this.msv = msv;
//    this.tenSv = tenSv;
//    this.tuoi = tuoi;
//  }

  public void input(){
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap vao ma msv : ");
    setMsv(scanner.nextLine());

    System.out.println(" Nhap ten sv : ");
    setTenSv(scanner.nextLine());

    System.out.println(" Nhap vao tuoi sv : ");
    setTuoi(scanner.nextInt());
    scanner.nextLine();
    //Goi đến hàm input của đối tượng lớp học
    lopHoc.input();

  }

  public void output(){
    System.out.println(" Masv  : " + getMsv());
    System.out.println(" Tensv : " + getTenSv());
    System.out.println(" Tuoi  : " + getTuoi());
    lopHoc.output();
  }

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public String getTenSv() {
    return tenSv;
  }

  public void setTenSv(String tenSv) {
    this.tenSv = tenSv;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public LopHoc getLopHoc() {
    return lopHoc;
  }

  public void setLopHoc(LopHoc lopHoc) {
    this.lopHoc = lopHoc;
  }

  public static void main(String[] args) {

    LopHoc lopHoc = new LopHoc("12345" ,"CNTT2");
//    HocSinh hs1 = new HocSinh("20023" ,"Nguyen Van B" , 21 ,lopHoc);
//    HocSinh hs2 = new HocSinh("3443" , "Nguyen Van C" , 22 ,
//        new LopHoc("MS323", "KTPM"));

    HocSinh hs = new HocSinh();
    hs.input();
    hs.output();
  }
}
