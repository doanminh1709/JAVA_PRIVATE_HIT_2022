import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunMain {

  static List<Person> people = Arrays.asList(
      new Person(20, "B", "Nghệ An"),
      new Person(23, "B", "Gia Lai"),
      new Person(20, "B", "Hà Nội"),
      new Person(25, "E", "Thanh Hoa")
  );

  public static void main(String[] args) {

    //Sắp xếp bình thường thì phải dùng 2 vòng for

//TODO : Collections
// TODO: Comperable

    System.out.println(" Sap xep theo comperable ");
    Collections.sort(people);
    people.forEach(item -> {
      System.out.println(item.getAge() + " "
          + item.getName() + " "
          + item.getAddress());
    });


    // TODO : Collections
    // TODO:  Comperator
    System.out.println(" Sap xep theo comperator");
    sortByAgeASC();
  }
  public static void sortByAgeASC(){
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
       return o1.getAge() - o2.getAge();//sap xep tang dan
//       return o2.getAge() - o1.getAge();//sap xep giam dan
      }
    });
    people.forEach(item -> {
      System.out.println(item.getAge() + " "
          + item.getName() + " "
          + item.getAddress());
    });

    //Sap xep dua tren collection sap xep tren nhieu tieu tri khac nhau
    //tuoi , ten , dia chi
    //Khi so sánh 2 đối tượng khác nhau , nếu như tuổi của 2 đối tượng khác bằng nhau
    //thì mình sẽ đi sắp xếp theo tên , còn như tên vẫn bằng nhau tiếp thì mình lại đi
    //săp xếp theo địa chỉ

    //Nếu như tuổi mà bằng nhau thì chuyển sang so sánh đến tên
    people.sort((a , b) -> {
      if (a.getAge() > b.getAge()){
        return 1;
      }else if(a.getAge() < b.getAge()){
        return -1;
      }else{
        if (a.getName().compareTo(b.getName()) > 0){
          return 1;
        }else if (a.getName().compareTo(b.getName()) < 0){
          return -1;
        }else{
          if (a.getAddress().compareTo(b.getAddress()) > 0){
            return -1;
          }else{
            return 1;
          }
        }
      }
    });
    people.forEach(item -> {
      System.out.println(item.getAge() + " "
          + item.getName() + " "
          + item.getAddress());
    });
  }

  public void sortByNameDESC(){
//
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
  }


}
