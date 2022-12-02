import java.util.ArrayList;

public interface sort {
  //Interface : mình sẽ có tính chất đa kế thừa
   void sortByName(ArrayList<Employee> employees);
//   public void sortByAddress();
//   public abstract void sortByAge();

  //Khai báo hằng số
   public static final float PI = 3.14f;


   //Ở trong interface mình chỉ được khai báo 2 cái
    // 1. Mình khai báo method mà mình muốn cho các lớp khác nó sử dụng
    // 2. Mình sẽ khai báo được các hằng số
   //Mặc định là public abstract

  //asbtract :trừu tượng mình chỉ cần tạo ra tên hàm và mình
  //không cần quan tâm đến cách hàm nó xử lý như thế nào
}
