import java.util.Scanner;

public class LopHoc {
  private String maLop;

  private String tenLop;
  public LopHoc(){}
  public LopHoc(String maLop, String tenLop) {
    this.maLop = maLop;
    this.tenLop = tenLop;
  }

  public String getMaLop() {
    return maLop;
  }

  public void setMaLop(String maLop) {
    this.maLop = maLop;
  }

  public String getTenLop() {
    return tenLop;
  }

  public void setTenLop(String tenLop) {
    this.tenLop = tenLop;
  }

  public void input(){
    System.out.println(" Nhap ma lop : ");
    setMaLop(new Scanner(System.in).nextLine());

    System.out.println(" Nhap ten lop : ");
    setTenLop(new Scanner(System.in).nextLine());
  }
  public void output(){
    System.out.println("Ma lop : " + getMaLop());
    System.out.println("Ten lop : " + getTenLop());
  }


}
