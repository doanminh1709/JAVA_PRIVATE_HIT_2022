import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
  //Ví dụ : Tạo tài khoản ở trong file , lấy thông tin ra và đăng nhập
  static List<Account> accountList = new ArrayList<>();


  public static void main(String[] args) throws IOException {
    //ghi thong so account vao file
//    writeFile();

    //doc thong tin cac du lieu trong file
    readFile();
    login();

    addAccountToFile();
  }

  public static void writeFile() throws IOException {
    FileWriter fileWriter = new FileWriter("output.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    PrintWriter printWriter = new PrintWriter(bufferedWriter);

    for (Account account : accountList) {
      printWriter.write(account.getUsername() + "|" + account.getPassword() + "\n");
    }
    //dong file
    printWriter.close();
    bufferedWriter.close();
    fileWriter.close();
  }

  public static void login() {
    System.out.println(" Nhap thong tin tai khoan cua ban ");

    System.out.print(" Username : ");
    String username = new Scanner(System.in).nextLine();

    System.out.print(" Password : ");
    String password = new Scanner(System.in).nextLine();

    for (Account account : accountList) {
      if (username.equals(account.getUsername()) && password.equals(account.getPassword()) && username.equals("admin")) {
        System.out.println(" Tai khoan admin");
      }
    }
  }

  public static void addAccountToFile() throws IOException {
    System.out.println(" Nhap thong tin tai khoan cua ban ");

    System.out.print(" Username : ");
    String username = new Scanner(System.in).nextLine();

    System.out.print(" Password : ");
    String password = new Scanner(System.in).nextLine();

    FileWriter fileWriter = new FileWriter("output.txt", true);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    PrintWriter printWriter = new PrintWriter(bufferedWriter);

    printWriter.write(username + "|" + password + "\n");
    //ghi xong nho dong lai file
    printWriter.close();
    bufferedWriter.close();
    fileWriter.close();
  }

  public static void readFile() throws IOException {
    Scanner scanner = new Scanner(Paths.get("output.txt"));

    while (scanner.hasNext()) {
      String[] word = scanner.nextLine().split("\\|");
      accountList.add(new Account(word[0], word[1]));
    }
  }
}
