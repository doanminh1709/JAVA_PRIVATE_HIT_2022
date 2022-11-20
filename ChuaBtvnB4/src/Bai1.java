import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {

    String str = new Scanner(System.in).nextLine();
    countOfCharacter(str);
    countOfCharacter2(str);

  }

  public static void countOfCharacter(String str) {
    int[] count = new int[300];

    str = str.toLowerCase(Locale.ROOT);
    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ' && count[str.charAt(i)] != 0)
        System.out.println(str.charAt(i) + " : " + count[str.charAt(i)]);
      count[str.charAt(i)] = 0;
    }
  }

  //Cach 2 : Sử dụng collection Map
  public static void countOfCharacter2(String str) {

    str = str.toLowerCase(Locale.ROOT);
    Map<Character, Integer> counts = new LinkedHashMap<>();

    for (int i = 0; i < str.length(); i++) {
      if (counts.containsKey(str.charAt(i))){
        int cnt = counts.get(str.charAt(i))+1;
        counts.put(str.charAt(i), cnt);
      }
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'
          && !counts.containsKey(str.charAt(i))) {
        counts.put(str.charAt(i), 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

  }
}
