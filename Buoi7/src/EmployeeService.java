import java.util.ArrayList;
//Chuyên xử lý các thao tác , chức năng logic của đối tượng

public class EmployeeService implements sort{
  @Override
  public void sortByName(ArrayList<Employee> employees) {
    for (int i = 0; i < employees.size() - 1; i++) {
      for (int j = i; j < employees.size(); j++) {
        if (employees.get(i).getName().compareTo(employees.get(j).getName()) > 0) {
          Employee temp = employees.get(i);
          employees.set(i, employees.get(j));
          employees.set(j, temp);
        }
      }
    }
    output(employees);
  }

  public void output(ArrayList<Employee> employees){
    for (Employee employee : employees) {
      employee.output();
    }
    System.out.println();

//    for (int i = 0; i < employees.size() ; i++){
//      employees.get(i).output();
//    }
  }

}
