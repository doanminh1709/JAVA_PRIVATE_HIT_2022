import java.util.Scanner;

public class Person {
  //Khai báo đối tượng Scanner có từ khóa static để nhập cho toàn bô chương tình
  private static Scanner scanner = new Scanner(System.in);
  //sử dụng static dể làm stt tự động tăng
  private static int temp = 0;
  private int stt;
  private int age;
  private String name;
  //khai báo những đối tượng person có cùng địa chỉ HaNoi mình sẽ tạo nó là biến static
  private static String diachi="HANOI";

  public void input(){
    System.out.println(" Nhap vao tuoi ");
    age = scanner.nextInt();

    //Note : khi nhập số xong nhập chữ mình sẽ phải loại bỏ bộ nhớ đệm
    scanner.nextLine();// cú pháp để loại bộ nhớ đẹm sau khi nhập số

    System.out.println(" Nhap vao name : ");
    name = scanner.nextLine();
    //lưu ý khi
  }
  public Person(int age, String name) {
    stt = temp++;
    this.age = age;
    this.name = name;
  }
  //Phướng thức static
  //Khi không muốn khai báo những đối tượng ở hà nôij nữn mà chuyển về đối tượng ở thanh hóa
  //mình sẽ sử dụng phương thức static
  public static void Change(){
    diachi = "Thanh Hoa";
  }

  //Khối static : khởi tạo thành viên lớp dữ liệu , sẽ chạy trước hàm main
  static {
//        temp = 1;
//        diachi = "HaiPhong";
    System.out.println(" Đây là thông tin trong khối static");
  }
  public static void main(String[] args) {
    System.out.println(" Đây là thông tin trong hàm main");
  }
}
