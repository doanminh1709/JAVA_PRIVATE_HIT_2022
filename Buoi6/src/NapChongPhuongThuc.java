public class NapChongPhuongThuc {

  public static int tinhTong(int a , int b){
    return a + b;
  }
//
//  public static int tinhTong(int a , int b , int c){
//    return a + b + c;
//  }

  public static float tinhTong(float a, float b){
    return a + b;
  }

  //Cách sử dụng
  //1 . Số lượng tham số truyền vào hàm nó khác nhau , thì hàm minh đang gọi nó cũng khác

  //2. Số lựợng tham số có thể bằng nhau nhưng kiểu dữ liệu tham số mà mình truyền vào hàm

  public static void main(String[] args) {
    System.out.println(tinhTong(2 , 3));
//    System.out.println(tinhTong(2 , 3 , 4));
    System.out.println(tinhTong(2.3f ,4.3f));
  }
}
