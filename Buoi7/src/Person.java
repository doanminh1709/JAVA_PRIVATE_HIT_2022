import java.util.Scanner;

public class Person {
  //Modifier : public , private , protected , default
  //Tính đóng gói dữ liệu : những thuộc tính ở lớp nào thì chỉ
  // thuộc về lớp đấy , nó cho phép gọi sử dụng ở trong lớp đấy

  //Tính kế thừa thì những thuộc tính của class cha thì sẽ để là protected

  //Đơn kế thừa

  protected String name;

  protected String diaChi;

  protected int tuoi;

  public Person(String name, String diaChi, int tuoi) {
    this.name = name;
    this.diaChi = diaChi;
    this.tuoi = tuoi;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  //Ghi đè phương thức
  public void thucDay(){
    System.out.println(" Thức dậy lúc 7h sáng ");
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Nhap ten : ");
    setName(scanner.nextLine());

    System.out.println(" Nhap dia chi : ");
    setDiaChi(scanner.nextLine());

    System.out.println(" Nhap tuoi : ");
    setTuoi(scanner.nextInt());
    scanner.nextLine();
  }

  public void output() {
    System.out.printf("%-10s %-10s %-10d", getName(), getDiaChi(), getTuoi());
  }
}
