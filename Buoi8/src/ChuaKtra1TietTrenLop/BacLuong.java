package ChuaKtra1TietTrenLop;

import java.util.Scanner;

public class BacLuong {
  private int thuBacLuong;

  public int getThuBacLuong() {
    return thuBacLuong;
  }

  public void setThuBacLuong(int thuBacLuong) {
    this.thuBacLuong = thuBacLuong;
  }

  public void input(){
    System.out.println(" Nhap thu bac luong ");
    setThuBacLuong(new Scanner(System.in).nextInt());
  }

  public void output(){
    System.out.printf("%-10d\n" , getThuBacLuong());
  }

}
