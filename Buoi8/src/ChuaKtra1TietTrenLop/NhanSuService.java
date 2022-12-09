package ChuaKtra1TietTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanSuService implements NhanSuInterface {

  @Override
  public void timKiemNs(ArrayList<NhanSu> listNs) {

    if (!listNs.isEmpty()) {
      System.out.println(" Nhap vao ma ns muon tim : ");
      String mans = new Scanner(System.in).nextLine();

      for (int i = 0; i < listNs.size(); i++) {
//        if (listNs.get(i).getManv().equals(mans))
//        if (listNs.get(i).getManv().compareTo(mans) == 0)
//        if (listNs.get(i).getManv().contains(mans)) {//nhung ki tu nao ma co no in ra luon
        if (listNs.get(i).getManv().compareTo(mans) == 0){
          listNs.get(i).output();
          break;
        }

//        listNs.forEach(e ->{
//          e.output();
//        });
//        listNs.stream().map().filter()
      }
    } else {
      System.out.println(" Danh sach trong!");
    }
  }

  @Override
  public void xoaNs(ArrayList<NhanSu> listNs) {
    if (!listNs.isEmpty()) {
      System.out.println(" Nhap vao ma ns muon xoa : ");
      String mans = new Scanner(System.in).nextLine();
      int t = listNs.size();
      for (int i = 0; i < listNs.size(); i++) {
        if (listNs.get(i).getManv().equals(mans)) {
          listNs.remove(i);
          break;
        }
      }
      if (t == listNs.size()){
        System.out.println("Khong ton tai ma nv nay");
      }
    } else {
      System.out.println(" Danh sach trong ");
    }
  }

  @Override
  public void sapXepNS(ArrayList<NhanSu> listNs) {
      if (listNs.size() > 1){
          for (int i  = 0 ; i < listNs.size()-1 ; i++){
            for (int j = i ; j < listNs.size() ; j++){
              if (listNs.get(i).getNgaySinh().compareTo(listNs.get(j).getNgaySinh()) > 0){
                NhanSu item = listNs.get(i);
                listNs.set(i , listNs.get(j));
                listNs.set(j , item);
              }
            }
          }
        System.out.println(" Sau khi sap xep ");
        for (NhanSu listN : listNs) {
          listN.output();
        }
      } else {
        System.out.println(" So nhan su chua du dieu kien sap xep ");
      }
  }
}
