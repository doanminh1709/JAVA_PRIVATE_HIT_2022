public class Person implements Comparable<Person> {

  private int age;

  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  private String address;

  public Person() {
  }

  public Person(int age, String name, String address) {
    this.age = age;
    this.name = name;
    this.address = address;
  }

  @Override
  public int compareTo(Person o) {
//   return this.age - o.age;
//   return this.name.compareTo(o.name);
   return this.address.compareTo(o.address);
  }


  //Có tác dùng mình sẽ sắp xếp dựa trên các tiêu chí khác nhau
//  @Override
//  public int compareTo(Person o) {
//  //this : Trỏ đến cái đối tượng hiện thời
//  //Person o : Đối tượng mà mình muốn so sánh
////    return this.age - o.age;
//    return o.name.compareTo(this.name);
//    //age của đối tượng hiện thời sẽ so sánh
//    //với age của đối tượng mình truyền vào
//  }

  //Sắp xếp theo Comperator




}
