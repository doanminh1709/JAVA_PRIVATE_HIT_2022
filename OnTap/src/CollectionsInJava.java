import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsInJava {
  public static void main(String[] args) {

    //TODO : List thì nó sẽ lưu các phần tử theo thứ tự lần lươt , nó có thể lưu được các phần tử giông nhau

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.add(2);
    integers.add(3);
    integers.forEach(item -> System.out.print(item + " "));
    System.out.println();


    //TODO : Đối với Set thì nó sẽ bỏ qua các phần tử mà giống nhau , nó chỉ lấy các phần tử có giá trị khác nhau
    //Thứ tự của nó sẽ sắp xếp dựa trên cái mã băm
    HashSet<Integer> integers1 = new HashSet<>();
    integers1.add(1);
    integers1.add(325);
    integers1.add(3);
    integers1.add(223);
    integers1.add(4);
    integers1.add(4903);
    integers1.add(6);
    integers1.forEach(item -> System.out.print(item  + " "));



//TODO : Có thể lưu được các value trừng nhau nhưng mà Key thì nó k thể trùng nhau được , nhưng mà
//    cái value thì nó sẽ lấy cái sau cùng
//    HashMap<Key , Value>
    System.out.println();
    HashMap<Integer , String>  maps = new HashMap<>();

      //Thêm 1 phần tử vào trong map thì mình sẽ có phương thức put
      maps.put(1 , "A");
      maps.put(1 , "C");
      maps.put(1 , "D");
      maps.put(2 , "B");
      maps.put(3 , "C");

    for (Map.Entry<Integer, String> entry : maps.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  //Ưng dụng : Mình có thể làm cái thư viện , từ điển quản lý sách
  //mã sách , tên sách
  // Từ điển : Tiếng anh - Tiếng việt



  }
}
