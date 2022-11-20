import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) {
    String str = new Scanner(System.in).nextLine();

    int number = 0, sum = 0 , temp = 0;
    for (int i = str.length()-1 ; i >= 0 ; i--) {
      switch (str.charAt(i)) {
        case 'I': number = 1;    break;
        case 'V': number = 5;    break;
        case 'X': number = 10;   break;
        case 'L': number = 50;   break;
        case 'C': number = 100;  break;
        case 'D': number = 500;  break;
        case 'M': number = 1000; break;
      }
      if (number < temp) {
        sum -= number;
      } else {
        sum += number;
      }
      temp = number;
    }
    System.out.println(sum);
  }
}
