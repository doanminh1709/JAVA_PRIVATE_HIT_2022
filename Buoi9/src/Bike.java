class Bike {
    int tocdo = 90;
}
class Honda3 extends Bike{
  int tocdo = 120;

  //Sử dụng tính đa hình đối với trường hợp nó thuộc tính thì
  // mình không thể gọi đến được thuộc tính của thằng con
//  Khi chúng ta truy cập thành viên dữ liệu mà không bị ghi đè,
//  thì nó sẽ luôn luôn truy cập thành viên dữ liệu của lớp cha.
  public static void main(String[] args) {
    Bike bike = new Honda3();

    Honda3 honda3 = new Honda3();

    System.out.println(bike.tocdo);
  }
}

