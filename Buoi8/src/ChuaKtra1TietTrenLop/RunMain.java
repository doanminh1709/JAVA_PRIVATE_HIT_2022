package ChuaKtra1TietTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

  private static ArrayList<NhanSu> listNs = new ArrayList<>();

  public static void main(String[] args) {
    NhanSuService nhanSuService = new NhanSuService();
    do {
      System.out.println(" 1.Nhập thông tin nhân viên \n" +
          " 2.Hiển hiển danh sách nhân viên \n" +
          " 3.Tìm kiếm nhân viên theo mã nhân viên \n" +
          " 4.Xóa nhân viên theo mã mã nv \n" +
          " 5.Sắp xếp danh sách nhân viên theo chiều tăng dần của ngày sinh\n" +
          " 6.Ket thuc chuong trinh\n");

      System.out.println(" Nhập vào lựa chọn của bạn : ");
      int chose = new Scanner(System.in).nextInt();
//      new Scanner(System.in).nextLine();

      switch (chose) {
        case 1: {
          nhapTtNv();
          break;
        }
        case 2: {
          hienThiDSNv();
          break;
        }
        case 3: {
          title();
          nhanSuService.timKiemNs(listNs);
          break;
        }
        case 4: {
          nhanSuService.xoaNs(listNs);
          break;
        }
        case 5: {
          title();
          nhanSuService.sapXepNS(listNs);
          break;
        }
        case 6: {
          System.out.println(" Cam on ban da su dung chuong trinh");
          System.exit(0);
          break;
        }

        default: {
          System.out.println(" Yeu cau khong hop le");
          break;
        }
      }
    } while (true);

  }

  private static void hienThiDSNv() {
    title();
    for (NhanSu item : listNs) {
      item.output();
    }
  }

  private static void nhapTtNv() {

    System.out.println(" Nhap thong tin nhan vien :");
    NhanSu ns = new NhanSu();
    ns.input();
    listNs.add(ns);
  }

  public static void title() {
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n",
        "Ho ten", "Ngay sinh", "Gioi tinh", "Ma nv", "So cmnd", "Nghe nghiep", "Thu bac luong");
  }

}
