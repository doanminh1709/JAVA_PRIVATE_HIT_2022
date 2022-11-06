import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Nhap n phan tu ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int cnt = 1;

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        cnt++;
      }
      else {
        System.out.println(arr[i] + " : " + cnt);
        cnt = 1;
      }
    }
      System.out.println(arr[n - 1] + " : " + cnt);
  }
}
