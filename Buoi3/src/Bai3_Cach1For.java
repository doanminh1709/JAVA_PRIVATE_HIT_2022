public class Bai3_Cach1For {
  public static void main(String[] args) {
    //y = 25 - 1.75*x;
    //z = 6x + 3y
    /*
    Goi x la trau dung
    y la trau nam
    z la trau gia
    x + y + z = 100
    5x + 3y + 1/3z = 100
    <==> x + y + z = 100 (1)
         15x + 9y + z = 300 (2)
    <==> (2)-(1) = 14x + 8y = 200 <==> 7x + 4y = 100 (3)
    <==> y = 25 - 1.75*x.
    (3) - (1) = 6x + 3y - z = 0 <==> z = 6x + 3y
    So trau khong the < 0 nen trau nam se > 0, Giai  y > 0 se ra x < 15
    y = 25 - 1.75*x
     */
    double y = 0;
    int z = 0;
    for(int x = 2; x < 15; x += 2){
      y += (25 - 1.75*x)*1.0;
       z += 6*x + 3*y;
      if(z % 3 != 0){
        y = 0;
        z = 0;
        continue;
      }
      System.out.println("Trau dung: " + x + "\nTrau nam: " + (int)y + "\nTrau gia: " + z + "\n");
      y = 0;
      z = 0;
    }
  }
}
