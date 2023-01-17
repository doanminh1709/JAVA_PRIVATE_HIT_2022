package services.imp;

import model.Student;
import services.StudentService;

import java.util.Scanner;

public class StudentServiceImp implements StudentService {
  @Override
  public void input(Student sv) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Enter your information : ");
    System.out.print(" Student id : ");
    sv.setStudentId(scanner.nextLine());

    System.out.print(" Name : ");
    sv.setName(scanner.nextLine());

    System.out.print(" Age : ");
    sv.setAge(scanner.nextInt());
    scanner.nextLine();

    System.out.print(" Address : ");
    sv.setAddress(scanner.nextLine());

  }

  @Override
  public void output(Student sv) {
    System.out.printf("%-10s %-10s %-10d %-10s\n",
        sv.getStudentId(), sv.getName(), sv.getAge(), sv.getAddress());
  }
}
