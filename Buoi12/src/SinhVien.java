import java.util.Scanner;

public class SinhVien {
  private String id;
  private String names;
  private int age;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhập dữ liệu cho Person");

    System.out.print(" Nhập id : ");
    setId(scanner.nextLine());

    System.out.print(" Nhập tên : ");
    setNames(scanner.nextLine());

    System.out.print(" Nhập tuổi : ");
    setAge(scanner.nextInt());
  }

  public void output() {
    System.out.printf("%-10s %-10s %-10d\n", getId(), getNames(), getAge());
  }
}
