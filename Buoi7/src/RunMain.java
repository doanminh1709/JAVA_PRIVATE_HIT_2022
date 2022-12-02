import java.util.ArrayList;

public class RunMain {

  public static void main(String[] args) {
//    Student student = new Student();
//    student.input();
//    student.output();

    //Ke thua thu bac
//    Con con = new Con();
//    con.lapTrinh();
//    con.choiCo();
//    con.hutThuocLao();

    // Phượng thuc của ông thì đã thuộc về cha

//    Cha cha = new Cha();
//    cha.choiCo();
//    cha.hutThuocLao();

    //Kế thừa theo thư bậc
//    Dog dog = new Dog();
//    dog.coiNha();
//    dog.an();
//
//    Cat cat = new Cat();
//    cat.batChuot();
//    cat.an();
    Employee employee1 = new Employee();
    employee1.input();

    Employee employee2 = new Employee();
    employee2.input();

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);

    EmployeeService employeeService = new EmployeeService();
    employeeService.sortByName(employees);
    employeeService.output(employees);

  }
}
