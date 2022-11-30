import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

  //  static ArrayList<Student> students = new ArrayList<>(10); Tạo cố định là được 10 sv
  static ArrayList<Student> students = new ArrayList<>();

  public static void main(String[] args) {

//    int n = 10;
//c1 : Sử dụng mảng đối tượng để lưu trữ nhiều sv
//    Student[] students = new Student[1000];

//c2 : Sử dụng ArrayList
 /*Vd : Làm menu thực hiện các chức năng sau
    1. Nhập vào 1 sinh viên
    2. In ra thông tin tất cả các sinh viên
    3. Tìm kiếm 1 sinh viên theo mã sv
    4. Sắp xếp sinh viên tăng dần theo tuổi
    5 .Sắp xếp sinh viên giảm dần theo tên sinh viên
    6.Thoát chương trình
    */
    do {
      System.out.println(
          "\nMENU" + "\n1. Nhập vào 1 sinh viên" +
              "\n2. In ra thông tin tất cả các sinh viên" +
              "\n3. Tìm kiếm 1 sinh viên theo mã sv" +
              "\n4. Sắp xếp sinh viên tăng dần theo tuổi" +
              "\n5.Sắp xếp sinh viên giảm dần theo tên sinh viên" +
              "\n6.Thoát chương trình");
      System.out.println(" Nhập vào lựa chọn của bạn : ");
      int chose = new Scanner(System.in).nextInt();
      new Scanner(System.in).nextLine();
      switch (chose) {
        case 1: {
          nhap();
          break;
        }
        case 2: {
          xuat();
          break;
        }
        case 3: {
          timKiemTheoMsv();
          break;
        }
        case 4: {
          sapXepTheoTuoi();
          break;
        }
        case 5: {
          sapXepTheoTen();
          break;
        }
        case 6: {
          System.out.println("Thoat chuong trinh");
          System.exit(0);
        }
        default: {
          System.out.println(" Chức năng không hợp lệ ");
          break;
        }

      }
    } while (true);

  }

  private static void nhap() {
    System.out.println(" Nhap vao thong tin sinh vien ");
    Student newStudent = new Student();
    newStudent.input();
    students.add(newStudent);
  }

  private static void title() {
    System.out.printf("%-10s %-10s %-10s %-10s\n",
        "Masv", "HoTen", "Tuoi", "GioiTinh");
  }

  private static void xuat() {
//    System.out.println(students);
    if (listEmpty()) {
      title();
      for (Student item :
          students) {
        item.output();
      }
    } else {
      System.out.println(" Chưa có sinh viên nào!");
    }
//    for (int i = 0; i < students.size(); i++) {
//      students.get(i).output();
//    }
  }

  private static void timKiemTheoMsv() {
    if (listEmpty()) {
      System.out.println(" Nhập vào mã sv : ");
      String msv = new Scanner(System.in).nextLine();

      for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getMaSv().equals(msv)) {
          title();
          students.get(i).output();
          break;
        }
      }
    } else {
      System.out.println(" Chưa có sinh viên nào!");
    }
  }

  private static void sapXepTheoTuoi() {
    if (students.size() >= 2) {
      for (int i = 0; i < students.size() - 1; i++) {
        for (int j = i; j < students.size(); j++) {
          if (students.get(i).getTuoi() > students.get(j).getTuoi()) {
            Student item = students.get(i);
            students.set(i, students.get(j));
            students.set(j, item);
          }
        }
      }
      xuat();
    } else {
      System.out.println("Không đủ 2 sinh viên trở lên!");
    }
  }

  private static void sapXepTheoTen() {
    if (students.size() >= 2) {
      for (int i = 0; i < students.size() - 1; i++) {
        for (int j = i; j < students.size(); j++) {
          if (students.get(i).getHoTen().compareTo(students.get(j).getHoTen()) < 0) {
            Student item = students.get(i);
            students.set(i, students.get(j));
            students.set(j, item);
          }
        }
      }
      xuat();
    } else {
      System.out.println("Không đủ 2 sinh viên trở lên!");
    }
  }

  public static boolean listEmpty() {
//    return students.size() != 0;
    if (students.size() != 0) return true;
    else return false;
  }

}
