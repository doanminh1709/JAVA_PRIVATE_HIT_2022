public class Employee extends Person {

  private String manv;

  private String tenCty;

  // Khi mà mình muốn định nghĩa lại thằng con từ thằng cha
  // thì mình sẽ cho keyword là @Override
  //ở trên phương thức của thằng con

  @Override
  public void thucDay() {
    System.out.println(" Thức dậy lúc 6h sáng");
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.thucDay();

    Employee employee = new Employee();
    employee.thucDay();
  }

}
