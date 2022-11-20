import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {

    String str = new Scanner(System.in).nextLine();
    int sum = 0, cnt = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) <= '9') {
        cnt++;
        int number = Integer.parseInt(String.valueOf(str.charAt(i)));//C1
        sum += number;
//           C2:     sum += str.charAt(i) - 48;
//           C3:     sum += str.charAt(i) - '0';
      }
    }
    if (sum != 0) {
      System.out.println("true");
      System.out.printf("%.3f", (float) sum / cnt);
    } else {
      System.out.println("false");
    }
  }
}
