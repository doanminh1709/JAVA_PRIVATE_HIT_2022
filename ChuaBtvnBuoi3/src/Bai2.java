import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    System.out.println(" Nhap n phan tu ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int [n];
    for (int i = 0 ; i < n ; i++){
      arr[i] = sc.nextInt();
    }
//Cách 1 
    boolean check = false;
    for (int i  = 0 ; i < n-1 ; i++){
        while (arr[i] + 1 != arr[i+1]){
          arr[i]+=1;  check = true;
          System.out.println(arr[i]);
      }
    }
    if (!check){
      System.out.println("YES");
    }

//Cách 2 : Bn Vinh 
      /*
    int maxx = a[n-1],minn= a[0];
    int j =0;
    boolean d = true;
    for(int i=minn;i<=maxx;i++){
      if(i != a[j]){
        d=false;
        System.out.print(i + " ");
        continue;
      }j++;
    }
    if(d){
      System.out.println("YES");
    }
  }

}
