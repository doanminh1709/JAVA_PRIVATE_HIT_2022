import java.util.Scanner;

public class Buoi3 {
  public static void main(String[] args) {
    //khai bao
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];
    //Gan truc tiep cac phan tu cho mang nay
    int[] array = new int[]{1, 2, 3, 4, 5};

    for (int i = 0; i < 4; i++) {
      System.out.printf(" Nhap vao gia tri a[%d] =", i);
//        arr[i] = sc.nextInt();
      arr[i] = new Scanner(System.in).nextInt();
    }

//    for (type arr:
//         name arr) {
//    }
    //Tac dung : Xuat gia tri cua mảng thay vì dùng for thường
    for (int item :
        arr) {
      System.out.print(item + " ");
    }



    System.out.println(tinhTong1(1, 2));

    //Cách truy cập không dung static
    Buoi3 buoi3 = new Buoi3();
    int c = buoi3.tinhTong(1, 2);
    System.out.println(c);
    hello();

//    System.out.println(tinhTong(2 , 3)); //Error

//    int []arr5 = new int[]{2 , 2, 3 , 4 , 5};
//    for (int i = 0 ; i < arr5.length ; i++){
//      System.out.print(arr5[i] + " ");
//    }
//
//
  }
  //Modifier : public , default , private
  //modifier type static method(argument){
  //  }

//doi voi ham tra ve minh se return int;
  public int tinhTong(int a, int b) {
    return a + b;
  }

  public static int tinhTong1(int a , int b){
      return a+b;
  }


  public static void hello(){
    System.out.println(" Hello moi nguoi ");
  }
  public void input(int []arr , int n){
    for (int i = 0 ; i < n ; i++){
      arr[i] = new Scanner(System.in).nextInt();
    }
  }
  public void output(int []arr , int n){
    for (int item:
         arr) {
      System.out.print(item + " ");
    }
  }

}





