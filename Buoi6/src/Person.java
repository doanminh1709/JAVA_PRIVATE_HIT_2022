public class Person {

  private String name;

  private int age;

  private String address;


  public Person(String name, int age, String address) {
    this();//chỉ gọi ở trong constructer có đối
    this.name = name;
    this.age = age;
    this.address = address;
  }
  //Khoi tạo về mặc định giá trị của các thuộc tính
  public Person(){
    System.out.println("Constructer k đối mặc định đối tượng ");
  }

  public void output(){
    System.out.println("Name : " + getName());
    System.out.println("Age : " + getAge());
    System.out.println("Address : " + getAddress());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

//  public void an(){
//    System.out.println("An com xong");
//    this.diHoc();
//  }

  public void an() {
//    this.diHoc();
    System.out.println("An xong");
  }

  public void diHoc() {
    this.an();
    System.out.println("Cbi di hoc");
  }


  public static void main(String[] args) {
    Person person = new Person("Nguyen Van A" , 20 , "Ha Noi");
//    person.output();
    person.diHoc();
  }



}
