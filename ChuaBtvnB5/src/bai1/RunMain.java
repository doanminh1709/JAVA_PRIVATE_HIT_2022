package bai1;

public class RunMain {
  public static void main(String[] args) {

    NhanVien[] nvs = new NhanVien[5];

    //Khoi tao tung phan tu cua mang doi tuong
    for (int i = 0 ; i < 5 ; i++)
      nvs[i] = new NhanVien();

    //Nhap gia tri cho tung doi tuong
    for (int i = 0 ; i < 5 ; i++) {
      System.out.printf(" Nhap thông tin cho nv : %d", (i + 1));
      nvs[i].input();
    }

    //Xuat thong tin cho các nhân viên
    System.out.println();
    System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s %-10s\n",
        "Id", "Ho ten","Kieu nv", "So ngay lam", "Nam vao lam","Luong" , "Phu cap" , "Tong tien\n");
    //cach 1
    for (int i = 0 ; i < 5 ; i++) {
      nvs[i].output();
    }
//Cach 2
    for (NhanVien nv:
         nvs) {
      nv.output();
    }





//    NhanVien nv1 = new NhanVien();
//    NhanVien nv2 = new NhanVien();
//    NhanVien nv3 = new NhanVien();
    //Khai bao mang doi tuong
    System.out.println(" Nhap thong tin cua 5 nhan vien ");
    System.out.println(" Thong tin nhan vien 1 : ");
//    nv1.input();
//    System.out.println(" Thong tin nhan vien 2 : ");
//    nv2.input();
//    System.out.println(" Thong tin nhan vien 3 : ");
//    nv3.input();
//    nv4.input();
//    nv5.input();

//    System.out.println();
//    System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s %-10s\n",
//      "Id", "Ho ten","Kieu nv", "So ngay lam", "Nam vao lam","Luong" , "Phu cap" , "Tong tien\n");
//    nv1.output();
//    nv2.output();
//    nv3.output();
//    nv4.output();
//    nv5.output();
  }
}
