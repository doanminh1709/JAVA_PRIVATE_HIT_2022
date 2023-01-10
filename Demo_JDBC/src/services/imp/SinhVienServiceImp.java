package services.imp;

import model.SinhVien;
import services.SinhVienService;

import java.util.Scanner;

public class SinhVienServiceImp implements SinhVienService {
  @Override
  public void input(SinhVien sv) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap msv : ");
    sv.setMsv(scanner.nextLine());

    System.out.println(" Nhap ho ten : ");
    sv.setHoTen(scanner.nextLine());

    System.out.println(" Nhap tuoi : ");
    sv.setTuoi(scanner.nextInt());
    scanner.nextLine();

    System.out.println(" Nhap dia chi : ");
    sv.setDiaChi(scanner.nextLine());

  }

  @Override
  public void output(SinhVien sv) {
    System.out.printf("%-10s %-10s %-10d %-10s\n",
        sv.getMsv(), sv.getHoTen(), sv.getTuoi(), sv.getDiaChi());
  }
}
