import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class WrapperClass {
  public static void main(String[] args) {
//Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ
// đối tượng thành kiểu dữ liệu nguyên thủy.

    int a = 1;
    float a1 = 2.3F;

    Float d = 2.4F;
    Integer b = 1;
    Integer c = 1;
//    int b1 = 1;
    if (!b.equals(c)){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
//    System.out.println(b1);






    Character charObj = new Character('a');
    Boolean boolObj = new Boolean(true);
    Integer intObj  = new Integer(2002);
    Float floatObj  = new Float(3.14F);
    Double doubleObj = new Double(3.14);
        String str = new String("Hello");


  }
}
