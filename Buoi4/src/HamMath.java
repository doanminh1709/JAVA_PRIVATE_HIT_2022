import java.util.Scanner;

public class HamMath{

    public static void main(String[] args) {

        //Hàm math : hàm toán học trong java
     // ==> Một số hàm thường dùng
        // 1.  Math.abs() trả về giá trị tuyệt đối của tham số truyền vào.
        int x = -20;
        System.out.println(Math.abs(x)); // 20

        // 2. Hàm Math.min() trả về số nhỏ nhất trong 2 tham số đầu vào
        int i = Math.min(1, 2);
        System.out.println(i); //i = 1

        // 3. Hàm Math.max() trả về số lớn nhất trong 2 tham số đầu vào
        int j = Math.max(1, 2);
        System.out.println(j); // j = 2

        //4. Hàm Math.pow(double t1, double t2) nhận vào 2 tham số t1, t2, trong đó t1 là số được luỹ thừa lên t2 lần..
        double pow8 = Math.pow(2,8);
        System.out.println(pow8);//256

        //5. Math.sqrt() trả về giá trị căn bậc 2 của tham số truyền vào.
        double z = Math.sqrt(4);
        System.out.println(z);// z = 2

        //6.Math.PI là một hằng số kiểu double trong Math class chứa giá trị của hằng số PI trong toán học.

        //7. Hàm Math.exp() trả số mũ n trong tham số truyền vào của hằng số e
        double exp1 = Math.exp(1); // 2.718281828459045

        //8.Hàm Math.log() trả về logarit cơ số e của n là tham số đầu vào.
        double t1 = Math.log(1); // 0.0
        double t2 = Math.log(2); // 0.6931471805599453

       //9.Hàm Math.log10() trả về logarit cơ số 10 của n là tham số đầu vào.
        double t1 = Math.log10(1); // 0.0
        double t2 = Math.log10(100); // 2.0
    }
}