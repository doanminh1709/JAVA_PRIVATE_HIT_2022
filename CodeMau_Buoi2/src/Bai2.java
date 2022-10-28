import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long max , min , max2 , sp;
    System.out.print(" Nhap vao so thu 1 : ");
    max = sc.nextLong();

    System.out.print(" Nhap vao so thu 2 : ");
    min = sc.nextLong();

    if(max < min){
      long temp = min; min = max; max= temp;
    }
    max2 = min;
    for(int i =  0 ; i < 2 ; i++){
      System.out.print(" Nhap vao so thu " + (i+3) + " : ");
      sp = sc.nextLong();
      if(sp > max){
        max2 = max; max = sp;
      }
      if(sp < max && sp > max2){
        max2 = sp;
      }
    }
    if(max == max2){
      System.out.println("Khong ton tai so lon thu 2");
    }else{
      System.out.println(" Max2 : " + max2);
    }
  }
}
