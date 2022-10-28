import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    int n, cnt=0;
    int[] arr = new int[1000];
    do{
      System.out.println(" Nhap vao n : ");
      n = new Scanner(System.in).nextInt();
    }while(n <= 0);

    while(n>0){
      int m = n%10; n/=10;
      if(m == 1 || m == 4 || m == 9){
        arr[cnt++] = m;
      }
    }
    if(cnt==0){
      System.out.println("No");
    }else{
      for(int i = cnt -1 ; i >= 0 ; i--)
        System.out.print(arr[i] + " ");
    }
  }
}
