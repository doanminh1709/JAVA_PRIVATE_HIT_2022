import java.util.Locale;
import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    String str = new Scanner(System.in).nextLine();
    str = str.trim().toLowerCase(Locale.ROOT);
    String sfm = String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT);

    for (int i = 1; i < str.length(); i++) {
      //Gặp số thì bỏ qua
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        continue;
      }
      //Gặp dấu cách thì kiểm tra
      if (str.charAt(i-1) == ' ' && str.charAt(i) >= 'a' && str.charAt(i) <='z'){
        sfm+=str.charAt(i-1);
        sfm+=String.valueOf(str.charAt(i)).toUpperCase(Locale.ROOT);
      }else if(str.charAt(i-1) != ' ' && str.charAt(i) != ' '){
        sfm+=str.charAt(i);
      }
    }
    System.out.println(sfm) ;
  }
}
