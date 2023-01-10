package services.imp;

import model.TaiKhoan;
import services.TaiKhoanService;

import java.util.Scanner;

public class TaiKhoanServiceImp implements TaiKhoanService {
  @Override
  public void input(TaiKhoan tk) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap tai khoan cua ban : ");
    tk.setTenTk(scanner.nextLine());

    System.out.println(" Nhap mat khau cua ban : ");
    tk.setMatKhau(scanner.nextLine());
  }

  @Override
  public void output(TaiKhoan tk) {
    System.out.printf("%-10s %-10s\n", tk.getTenTk(), tk.getMatKhau());
  }
}
