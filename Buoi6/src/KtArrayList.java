import java.util.ArrayList;

public class KtArrayList {
  public static void main(String[] args) {
    //Kiểu dữ liệu truyền vào phải là 1 warpper class hoặc Object

    //Cách khai báo ArrayList

    ArrayList<Long> numbers1 = new ArrayList<>();

    //Nó là lớp , nó sẽ có các phương thức riêng của nó
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(2);

    numbers.add(2, 0);
    System.out.println(numbers);


    ArrayList<Integer> number2 = new ArrayList<>();
    number2.add(6);
    number2.addAll(numbers);
    System.out.println(number2);

    //Contains : trả về true nếu tìm thấy 1 phần tử ở trong list , ngược lại trả về false

    if (number2.contains(2)) {
      System.out.println("So 2 có trong list number2");
    } else {
      System.out.println("Số 2 không có trong list này");
    }

    //Phương thức retainAll
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("C++");
    list.add("PHP");
    list.add("Java");

    System.out.println("\nví dụ sử dụng phương thức retainAll()");
    System.out.println("-----------------------------------");
    // khởi tạo listB
    ArrayList<String> listB = new ArrayList<String>();
    listB.add("Java");
    // xóa những phần tử không thuộc listB khỏi listA
    list.retainAll(listB);
    System.out.print("list:" + list);

    //In ra chi so dau tien hoặc cuối cùng của giá trị i
    System.out.println("\nChi so dau tien cua phan tu 2 :" +
        numbers.indexOf(2));
    System.out.println("\nChi so cuoi cung cua phan tu 2 :" +
        numbers.lastIndexOf(2));

    //size() : độ dài thực thế của mảng
    for(int i = 0 ; i < numbers.size() ; i++){
      System.out.print(numbers.get(i) + " ");
    }

    //set : cập nhật lại giá trị
    System.out.println("\nNumber.get(2) : " + numbers.get(2));
    numbers.set(2 , 2);
    System.out.println("\n" + numbers);
    System.out.println("\nNumber.get(2) : " + numbers.get(2));

    //Xoa cac phan tu o trong phuong thuc
    numbers.clear();
  }
}
