import java.util.Scanner;

public class Animal {
  //Thuoc tinh

// ten
// gioi tinh
// mau sac
  //Nhung thuoc tinh
  private String ten;

  private String gioiTinh;

  private String mauSac;


  //Constructer , Getter , Setter
  //constructer dung de khoi tao gia tri cho doi tuong
  //Constructer khong doi : Khởi tạo các giá trị về mặc định
  public Animal(){
  }

  // Contructer có đối

  public Animal(String tenn , String gioiTinhh , String mauSacc){
      ten = ten;
      gioiTinh = gioiTinhh;
      mauSac = mauSacc;
  }
  public Animal(String tenn , String gioiTinhh){
    ten = tenn;
    gioiTinh = gioiTinhh;
  }
  public Animal(String tenn){
    ten = tenn;
  }

  public String getGioiTinh(){
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinhn){
    gioiTinh = gioiTinhn;
  }

  public String getMauSac(){
    return mauSac;
  }

  public void setMauSac(String mauSacc){
    mauSac = mauSacc;
  }
  //
  public String getTen(){
    return ten;
  }

  public void setTen(String tenn){
    ten = tenn;
  }



  //Nhung phuong thuc
  public void an(){
    System.out.println(" Dang an com ");
  }

  public void dichoi(){
    System.out.println(" Dang di choi");
  }

  public void input(){
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap ten : ");

    String ten = scanner.nextLine();
    setTen(ten);

    System.out.println(" Nhap gioi tinh : ");
    setGioiTinh(scanner.nextLine());

    System.out.println(" Nhap mau sac : ");
    setMauSac(scanner.nextLine());

  }

  public void output(){
    System.out.println("Ten : " + ten);
    System.out.println("Gioi tinh : " + gioiTinh);
    System.out.println("Mau sac : " + mauSac);
  }

  public static void main(String[] args) {
    //khai bao 1 doi tuong
    Animal dog = new Animal();
    dog.dichoi();

    Animal cat = new Animal();
    cat.dichoi();

    String tenn = "Chim B";
    String gioiTinh = "Cai";
    String mauSac = "Vang";

    Animal bird2 = new Animal(tenn , gioiTinh , mauSac);
    System.out.println(" Truoc khi thay doi ");
    System.out.println(bird2.getTen());
    bird2.setTen("Chim C");

    System.out.println(" Sau khi thay doi ");
    System.out.println(bird2.getTen());

    Animal bird = new Animal("Chim A" , "Duc" , " Do");
    bird.output();

    Animal bird3 = new Animal("Chim C" );

    Animal birdD = new Animal();
    birdD.input();
    birdD.output();



  }
}
