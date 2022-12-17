import java.util.Scanner;

public class RunMain {
  public static void main(String[] args) {

    //Khoi tao 1 doi tuong animal
    Animal animal = new Animal();
    animal.eat();

    Dog dog = new Dog();
    dog.eat();

    Animal dog1 = new Dog();
    dog1.eat();

    /*Tính chất đa hình : 1 đối tượng thì sẽ có nhiều hình thể
     Mình sử dụng kiểu dữ liệu của lớp cha để tham chiếu đến đối tượng của lớp con

    Tính chất đa hình thì nó sẽ có 2 loại
    Đa hình lúc compile time và đa hình lúc runtime
    Ghi đè phương thức là 1 ví dụ của tính chất đa hình khi compile time
  */

    //Cho tk cha trỏ đến đối tượng của thằng con , ngược lại thì k được
    Animal cat2 = new Cat();


    cat2.eat();
    System.out.println(cat2 instanceof Animal);

    Animal animal1 = new Animal();
    System.out.println(animal1 instanceof Animal);

    /*
    //Tu khoa instanceof : kiem tra 1 đối tượng có phải thể hiện của kiểu dữ liệu cụ thể hay không (lớp , lớp con ,
    interface)
    là toán tử so sánh vì nó so sánh thể hiện với kiểu dữ liệu , trả về true hoặc false , nếu dùng toán tử instance
    of với bất
    kì kiểu dữ liệu nào có giá trị là null thì nó sẽ luôn trả về false
    */
    //Tra ve true khi ma gia tri no khac null ,
    Integer c = 10;
    System.out.println(c instanceof Integer);//true

    c = null;
    System.out.println(c instanceof Integer);//false

    Object[] objects = new Object[]{"Hello", 'c', 3};
    for (int i = 0; i < objects.length; i++) {
      if (objects[i] instanceof Character) {
        System.out.println("Kieu du lieu char : " + objects[i]);
      } else if (objects[i] instanceof Integer) {
        System.out.println("Kieu du lieu Interger : " + objects[i]);
      } else {
        System.out.println("Kieu du lieu String : " + objects[i]);
      }
    }


    Animal dog3 = new Dog();
    input(dog3);
    output(dog3);

    Animal cat = new Cat();
    input(cat);
    output(cat);

  }

  public static void input(Animal animal) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Nhap tuoi ");
    animal.setAge(sc.nextInt());
    sc.nextLine();
    //Su dung da hinh
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      System.out.println(" Nhap ten dog : ");
      dog.setName(sc.nextLine());
    }
    if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      System.out.println(" Nhap ten cat: ");
      cat.setName(sc.nextLine());
    }
  }

  public static void output(Animal animal) {
    System.out.println("Age : " + animal.getAge());
    if (animal instanceof Dog) {
      Dog c = (Dog) animal;
      System.out.println("Name :" + c.getName());
    }
    if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      System.out.println("Name :" + cat.getName());
    }
  }
}
