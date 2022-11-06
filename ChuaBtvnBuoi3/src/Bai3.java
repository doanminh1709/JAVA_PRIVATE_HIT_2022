import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Nhap n phan tu ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int cnt = 1, max = 1;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        cnt++;
      } else {
        if (max < cnt) {
          max = cnt;
          cnt = 1;
        }
      }
    }
    if (cnt == n)  System.out.println("Max:"+cnt);
    else System.out.println("Max:"+max);
  }

}
