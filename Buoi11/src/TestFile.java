import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {
  public static void main(String[] args) throws IOException {
    //Khi nhắc đến thao tác vời file :file.txt
    //1. Đọc từ file ra ngoài màn hình
    //2. Ghi dữ liệu vào trong file
//c1 : truyền vao 1 string là tên file
    FileWriter fileWriter = new FileWriter("input.txt");
//c2 : truyền vao 1 file

    File file = new File("input.txt");//file da co

    File file1 = new File("input1.txt");
    if (file1.exists()) {//kiem tra neu đúng là file đó không tồn tại thì tạo luôn file mới 
      file1.createNewFile();
    }

    //append : true , ghi tiep , nguoc lai xoa di ghi lai tu dau
    FileWriter fileWriter1 = new FileWriter(file1, true);
    try {
      fileWriter1.write("\nChao mung moi nguoi ");
      fileWriter1.close();

      fileWriter.write("Hello moi nguoi nhe");
      fileWriter.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Success...");

    //contructor FileWriter có 2 loại truyền vào 1 file hoặc 1 tên file
    //BufferedWriter : ghi file , thay vì ghi trực tiếp vào file , thì nó sẽ
    //ghi ra 1 lớp đệm , trước tiên nó ghi ra cái lớp đệm đấy , sau khi mà
    // ghi xong ở lớp đệm đấy thì nó với ghi vào file , quá tring nâng cao hiệu suất đọc ghi file

    //Khác với fileWriter : ghi trực tiếp vào file luôn còn cái BufferedWriter thì nó sẽ ghi ra bộ nhớ đệm trước
    try {
      //Khi mà kết hợp 3 cái này lại , hiệu suất của nó vừa nhanh mà
      //nó có thể đọc được nhiều kiểu dữ liệu khác nhau
      FileWriter fileWriter2 = new FileWriter("input3.txt");
      BufferedWriter buffer = new BufferedWriter(fileWriter2);
      PrintWriter printWriter = new PrintWriter(buffer);

      printWriter.printf("I am %d years old.", 20);

      //Cai nao khai bao o sau thi phai đóng nó lại trước
      printWriter.close();
      buffer.close();
      fileWriter.close();
      System.out.println("Success...");
    } catch (IOException e) {
      System.out.println(e);
    }

    //PrintWriter : Có tác dụng ghi file , nhưng mà nó đọc các kiểu dữ liệu nguyên thủy cho người dùng

    try {
      //trong constructer nó sẽ truyền vào 1 cái wirter
      // writer nó là class cha của các cái class con , class con : BufferedWriter , FileWriter
      PrintWriter output = new PrintWriter("output.txt");
      int age = 25;
      output.printf("I am %d years old.", age);
      output.close();
    } catch (Exception e) {
      e.getStackTrace();
    }

// Đọc file : ĐỌC DỮ LIỆU TỪ FILE RA NGOÀI MÀN HÌNH CHẠY
    //Paths.get("x") : x la ten file ma minh muon doc
    Scanner fileScanner = new Scanner(Paths.get("input4.txt"));

    while (fileScanner.hasNext()) {//tra ve true , hết dữ liệu thì nó trả về false
//      String s = fileScanner.next();//mỗi lần đọc trên 1 dòng
//      String[] s1 = fileScanner.nextLine();//mỗi lần đọc trên 1 dòng
//      System.out.println(s);
      String[] array = fileScanner.nextLine().split(" ");
      for (int i = 0; i < array.length; i++) {
        int c = Integer.parseInt(array[i]);
        System.out.println(c);
      }
//next() :sẽ đọc từ ở trên 1 dòng , gặp dấu cách thì xuống dòng
//nextLine() : đọc từng dòng , bỏ qua dấu cách
    }
  }

}
