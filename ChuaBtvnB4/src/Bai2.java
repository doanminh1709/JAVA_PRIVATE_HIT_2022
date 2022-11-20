import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    String str1 = new Scanner(System.in).nextLine();
    String str2 = new Scanner(System.in).nextLine();
    findMaxLengthSubString(str1, str2);

  }

  public static void findMaxLengthSubString(String str1, String str2) {

    int maxLength = 0;
    for (int i = 0; i < str2.length(); i++) {
      for (int j = i + 1; j <= str2.length(); j++) {
        if (str1.contains(str2.substring(i, j)))
          maxLength = Math.max(maxLength, j - i);
      }
    }
    System.out.println(maxLength);
  }
}
