import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexException {
  public static void main(String[] args) {
    /*TODO : Regex Exception : Nó là 1 biểu thức chính quy để kiểm tra
      tính hợp lệ của chuỗi mình nhập vào chuỗi nhập vào (chuỗi đầu vào)
      Vd : Email , Phone , Password , Username , Name
      */

//TODO:  String email = "doanducminh@gmail.com";//email hợp lệ
//       String email1 = "abc@gmail@.com";//email là không hợp lệ

//TODO: Yêu cầu sdt : Số điện thoại phải có 10 chữ số , không hơn không kém
    String sdt = "0327597973";// Số điện thoại hợp lệ
    String sdt2 = "052367981";// Số điện thoại không hợp lệ

    //tạo nên từ tuổi [0-9] tối thiểu từ 1 chữ số trở nên
    String tuoi;//tuổi này là số dương

    //2 Cái quan trọng , 1 là Matcher , Pattern

    //1. Pattern : là giống như 1 cái bộ lọc , trong pattern thì nó sẽ có chuỗi regex
    //2. Matcher : Cung cấp bộ máy xử lý phương thức chính quy để thao tác chuỗi kí tự.


    //Ví dụ dùng Regex để Phân tách chuỗi tại vị trí 1 hoặc nhiều dấu cách
    String str = "  Hello    moi   nguoi       nhe   ";
    String[] strs = str.split("\\S+");
    for (String item : strs){
      System.out.println(item);
    }

    String regex = "^[\\s+]$";//biểu thức regex sẽ được viết giữa cái ^ và $
/*
  + : có nghĩa là 1 hoặc nhiều kí tự
  - : tu dau den dau
  ^ : có 2 hình thức
    dấu mở đầu 1 chuỗi regex
    nếu như nó dấu thứ 2 trở đi nó có nghĩa là phủ định
  . : bất kì kí tự nào thì nó cũng đúng


  regex ="^[0-9]{10, }$"; : chuỗi đầu vào chỉ có duy nhất 1 kí tự
  Số lượng chỉ định trong regex
  ? : tối thiểu là 0 khi tự và tối đa là 1
  + : tối thiểu nó phải bằng 1 và tối đa thì sẽ được nhiều
  * : tối thiểu là 0 và tối đa của nó là nhiều kí tự
  {n} : mình phải viết đủ n kí tự phù hợp thì chuỗi đầu vào của mình với là đúng
  {n , } : mình phải viết đủ n kí tự có thể xảy ra hơn nhiều n nữa
  {y , x} : tối thiểu là y kí tự , nhưng tối đa chỉ được x kí tự (y < x) và khoảng kí tự thỏa mãn y - x

  Ký tự đặc biệt
  [0-9] regex kiem tra cac so tu 0 - 9
  \d : 1 hoặc nhiều dấu cách

 */
    //0 - 9 co 10 ki tu
    //Ví dụ : check số điện thoại k sử dụng regex
    String sdt_test = "0327597973";
      int cnt = 1;
      for (int i = 0; i < sdt_test.length(); i++) {
        int t = Integer.parseInt(String.valueOf(sdt.charAt(i)));
        if (t >= 0 && t <= 9) cnt++;
      }
      if (cnt == 10) {
        System.out.println(" sdt hop le");
      }else{
        System.out.println("Khong hop le");
      }


    String regex1 = "^[\\d]$";//biểu thức chính quy tiêu chuẩn
//    \w  cách viết tắt [a-zA-Z_0-9]
//    \W ngược lai voi \w : [^a-zA-Z_0-9]
//    "[0|9]"// [\\D] :

    String test = "e";// chuỗi đầu vào e muốn test
    //1 bộ lộc tiêu chuẩn chuỗi regex
    Pattern pattern = Pattern.compile(regex1);//
    Matcher matcher = pattern.matcher(test);
    if (matcher.find()) {
      System.out.println(" Chuỗi test hợp lệ , khớp với regex ");
    } else {
      System.out.println(" Chuỗi test không hợp lệ ");
    }

//TODO : Một số regex có thể cần trong bài tập lớn
// (các e có thể custom theo yêu cầu đầu vào của mình nhé)

    String age = "^[0-9]+$";
    String emails = "^(.+)@(\\S+)$";
//TODO : Regex password : Yêu cầu mk có 8 kí tự trở lên ,
// bắt buộc 1 kí tự a-z,A-Z, 0-9, và 1 kí tự đặc biệt
    String Password = "^((?=.*[A-Z]) .(?=.*[a-z])(?=.*[0-9])(?=.*[&^*%!$#@])  ).{8,}$";

    //Ví dụ sử dụng regex để check địa chỉ hợp lệ trong bài tập lớn
    String diachi_regex = "^([a-zA-Z0-9.\\s]+)$";
    Pattern pattern1;
    Matcher matcher1;
    do {
      System.out.println(" Nhap vao dia chi");
      String diaChi = new Scanner(System.in).nextLine();
      pattern1 = Pattern.compile(diachi_regex);
      matcher1 = pattern1.matcher(diaChi);
      if (!matcher1.find()) {
        System.out.println(" Dia chi k hop le");
      } else {
        break;
      }
    } while (!matcher1.find());
  }
}
