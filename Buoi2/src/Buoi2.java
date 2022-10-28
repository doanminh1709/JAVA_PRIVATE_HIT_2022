import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Buoi2 {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Nhap thang : ");
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//    int maxx  =a;
//    // lon nhat
//    if(maxx <b)
//      maxx=b;
//     if(maxx<c)
//       maxx = c;
//    System.out.println("So lon nhat"+ maxx);
//    // be nhat
//    int minn=a;
//    if(minn>b)
//      minn=b;
//     if(minn>c)
//       minn= c;
//    System.out.println("So be nhat"+ minn);

//    switch (bien){
//      case 1 : .... break;
//      case 2 : ... break
//          ....
//      default:
//    }
//

//    switch (a)
//    {
//      case 1:
//      case 3:
//      case 5 :
//      case 7:
//      case 8:
//      case 10:
//      case 12:
//        System.out.println("Thang co 31 ngay!");
//        break;
//      case 4:
//      case 6:
//      case 9 :
//      case 11:
//        System.out.println("Thang co 30 ngay!");
//        break;
//      case 2:
//        System.out.println("Thang co 28 ngay!");
//        break;
//      default : System.out.println("Khong biet nuaa");
//    }

//    for , while, do while

//    nhap vao 1 so nguyen tu ban phim
//        kiem tra xem so day la so nguyen to khong
//        neu co in ra no
//        neu khong in ra yes
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Nhap so nguyen: ");
//    int n = sc.nextInt();
//    if(n==2){
//      System.out.println("No");
//      return;
//    }
//    for(int i=3;i*i<=n;i+=2){
//      if(n%i==0){
//        System.out.println("k la so nguyen to");
//        return;
//      }
//    }
//        if(n<=1 || n%2==0){
//          System.out.println("k la so nguyen to");
//        }else{
//          System.out.println("la so nguyen to");
//        }

      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      if (a<=1){
        System.out.println("k la so nguyen to");
      }
      int dem = 0;
      for (int i =1; i<=a; i++){
        if (a%i==0){
          dem++;
        }
      }
      if (dem == 2) {
        System.out.println("la so nguyen to");
      }
      else
        System.out.println("k la so nguyen to");
  }
}

// toan tu
// + - * / % ++ -- += -= *= /= %=
//i=i-1 => i-=1
//i = i*2 => i*=2

// so sanh
//> < == >= <= !=
//    a =3 b=3
//a == b

//nhap vao tu ban phim 3 SO, tim va in ra man hinh
//so  lon nhat va so be nhat