import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Nhap n phan tu ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    boolean mark = false;
    for (int item: arr ){
      if (priceMaster(item)){
        System.out.println(item);
        mark = true;
      }
    }
    if(!mark){
      System.out.println("NO");
    }

  }
  public static boolean priceMaster(int n){
    int cnt1 = 1 , cnt2 = 1;
    while (n>0){
      cnt1++;
      int m = n%10;
      n/=10;
      if(price(m)) cnt2++;
    }
    return cnt1 == cnt2;
  }

  public static boolean price(int n){
    if(n<2)return false;
    for (int i = 2; i*i<=n;i++){
      if(n % i == 0) return false;
    }
    return true;
  }
}
