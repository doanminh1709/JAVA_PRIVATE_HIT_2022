package bai4;

import java.util.Scanner;

public class RunMain {
  public static void main(String[] args) {

    NhanVien[] nvs = new NhanVien[100];

    int cnt = 0;
    do {
      System.out.println(" MENU");
      System.out.println
          ("1.Them moi nhan vien" +
              "\n2.Hien thi thong tin cac danh sach nhan vien" +
              "\n3.Hien thi top 3 nhan vien lam viec cham chi nhat" +
              "\n4.Tim kiem theo ho ten" +
              "\n5.Thoat khoi chuong trinh");
      System.out.print(" Nhap vao lua chon cua ban : ");
      int chose = new Scanner(System.in).nextInt();
      switch (chose) {
        case 1: {
          nvs[cnt] = new NhanVien();
          nvs[cnt].input();
          cnt++;
          break;
        }
        case 2: {
          showInfoEmployees(nvs, cnt);
          break;
        }
        case 3: {
          getTop3Nv(nvs, cnt);
          break;
        }
        case 4: {
          findByName(nvs, cnt);
          break;
        }
        case 5: {
          System.out.println(" CAM ON BAN DA SU DUNG DICH VU");
//          return;//Cach 1 : return ve luon
          System.exit(0);//Tra ve exit
        }
        default: {
          System.out.println("Khong co chuc nang nay");
          break;
        }

      }
    } while (true);

  }

  static void title() {
    System.out.printf("%-15s %-10s %-15s %-15s %-10s %-10s %-10s %10s\n",
        "Ho ten", "Tuoi", "Gioi tinh", "Dia chi",
        "So GioLv", "So tienMh", "Luong", "Thue\n");
  }

  public static void showInfoEmployees(NhanVien[] nvs, int cnt) {

    if (checkArrExists(nvs)) {
      title();
      for (int i = 0; i < cnt; i++) {
        nvs[i].output();
      }
    } else {
      System.out.println("Khong co nhan vien nao!");
    }
  }

  public static void getTop3Nv(NhanVien[] nvs, int cnt) {
    if (cnt >= 3) {
      for (int i = 0; i < cnt - 1; i++) {
        for (int j = i; j < cnt; j++) {
          if (nvs[i].getSoGioLv() < nvs[j].getSoGioLv()) {
//          if(nvs[i].getHoTen().compareTo(nvs[j].getHoTen()) > 0){
          NhanVien tmp = nvs[i];
            nvs[i] = nvs[j];
            nvs[j] = tmp;
          }
        }
      }
      //Lay ra 3 nv cham chi nhat
      title();
      for (int i = 0; i < 3; i++) {
        nvs[i].output();
      }
    } else {
      System.out.println("Khong co du 3 nhan vien!");
    }
  }

  public static void findByName(NhanVien[] nvs, int cnt) {
    if (checkArrExists(nvs)) {
      System.out.println(" Nhap vao ten nhan vien muon tim ");
      String name = new Scanner(System.in).nextLine();

      for (int i = 0; i < cnt; i++) {
//        if (name.equals(nvs[i].getHoTen())) {
        if (name.compareToIgnoreCase(nvs[i].getHoTen()) == 0)
          title();
        nvs[i].output();
        break;
      }
//      if (nvs[i].getHoTen().contains(name))
//       if (name.compareTo(nvs[i].getHoTen()) == 0)
    } else {
      System.out.println(" Khong co nhan vien nao!");
    }
  }
  public static boolean checkArrExists(NhanVien[] nvs) {
//    return nvs.length != 0;
    if (nvs.length > 0) {
      return true;
    }
    return false;
  }
}
