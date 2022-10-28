public class Bai3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      for (int j = 1; j <= 33; j++) {
        int k = 100 - i - j;
        if (k % 3 == 0 && i + j + k == 100 && i * 5 + j * 3 + (k / 3) == 100) {
          System.out.println(" So dung : " + i + " Trau nam : " + j + " Trau gia : " + k);
        }
      }
    }
  }
}
