package main;

import dao.AccountDAO;
import dao.StudentDAO;
import model.Account;
import model.Student;
import services.AccountService;
import services.imp.AccountServiceImp;
import services.imp.StudentServiceImp;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dao.StudentDAO.getName;
import static main.MainAccount.listTk;


public class MainStudent {
  static Scanner scanner = new Scanner(System.in);

  static void logIn() throws SQLException {

    //Ex : Use regex for username
    String username_regex = "^[\\w+]{6,}$";
    Pattern pattern;
    Matcher matcher;
    String username;
    do {
      System.out.println(" Enter your username : ");
      username = scanner.nextLine();
      pattern = Pattern.compile(username_regex);
      matcher = pattern.matcher(username);
      if (matcher.find()) break;
      else System.out.println(" Username is not format");
    } while (!matcher.find());

    System.out.println(" Enter your password : ");
    String password = scanner.nextLine();
    boolean check = false;
    for (Account tk : listTk()) {
      //Login and manage function
      if (tk.getRole().equals("admin") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
        System.out.println(" Welcome Admin , invite you perform the function");
        int choseAdmin;
        do {
          System.out.println(" ADMIN FUNCTION MANAGEMENT MENU ");
          System.out.println("1.Delete student by studentId");
          System.out.println("2.Find student by name ");
          System.out.println("3.Find student by studentId ");
          System.out.println("4.Show list student");
          System.out.println("5.Exit ");
          System.out.println(" Enter your chose :  ");
          choseAdmin = scanner.nextInt();
          scanner.nextLine();
          switch (choseAdmin) {
            case 1: {
              deleteStudentByStId();
              break;
            }
            case 2: {
              findStudentByName();
              break;
            }
            case 3: {
              findStudentByStId();
              break;
            }
            case 4: {
              printListStudent();
              break;
            }
          }
        } while (choseAdmin != 5);
        check = true;
        break;
      }
      if (tk.getRole().equals("user") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
        System.out.println(" Hello " + getName(username) + ", invite you to perform the function ");
        int choseUs;
        do {
          System.out.println("MENU MANAGE INFORMATION OF STUDENT ");
          System.out.println("1.Edit your information ");
          System.out.println("2.Logout ");
          System.out.print(" Enter your chose :  ");
          choseUs = scanner.nextInt();
          scanner.nextLine();
          switch (choseUs) {
            case 1: {
              editInfoStudent(username);
              break;
            }
          }
        } while (choseUs != 2);
        check = true;
        break;
      }
    }
    if (!check) {
      System.out.println("Account is not valid!");
    }
  }

  public static void register() throws SQLException {
    //Enter information for student
    StudentServiceImp stImp = new StudentServiceImp();
    StudentDAO svd = new StudentDAO();
    Student st = new Student();
    stImp.input(st);

    AccountService accSv = new AccountServiceImp();
    AccountDAO accDAO = new AccountDAO();
    Account acc = new Account();
    accSv.input(acc);
    accDAO.add(acc);

    //Enter information for account
    st.setUsername(acc.getUsername());
    svd.add(st, st.getUsername());
    System.out.println("Create account success!");
  }


  public static void deleteStudentByStId() throws SQLException {
    StudentDAO studentDAO = new StudentDAO();
    System.out.println(" Enter studentId you will remove :");
    //remove student
    String studentId = scanner.nextLine();
    Student student = studentDAO.find(studentId);
    if (student != null) {
      studentDAO.delete(studentId);
      //Remove Account
      AccountDAO accountDAO = new AccountDAO();
      accountDAO.deleteAccount(student.getUsername());
      System.out.println("Remove this student has studentId : " + studentId + " success!");
    } else {
      System.out.println("Not found student with id : " + studentId);
    }
  }

  public static void findStudentByName() {
    StudentDAO studentDAO = new StudentDAO();
    System.out.println(" Enter name of student you will find : ");
    String name = scanner.nextLine();
    try {
      List<Student> students = studentDAO.findSvByName(name);
      if (!students.isEmpty()) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
            "StudentId", "Name", "Age", "Address", "Username");
        for (Student st :
            students) {
          System.out.printf("%-10s %-10s %-10d %-10s %-10s\n",
              st.getStudentId(),
              st.getName(),
              st.getAge(),
              st.getAddress(),
              st.getUsername());
        }
      } else {
        System.out.println("Not found student with name : " + name);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void findStudentByStId() {
    StudentDAO studentDAO = new StudentDAO();
    System.out.println(" Enter studentId you will find : ");
    String std = scanner.nextLine();
    try {
      Student st = studentDAO.find(std);
      if (st != null) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
            "StudentId", "Name", "Age", "Address", "Username");
        System.out.printf("%-10s %-10s %-10d %-10s %-10s\n",
            st.getStudentId(),
            st.getName(),
            st.getAge(),
            st.getAddress(),
            st.getUsername());
      } else {
        System.out.println("Not found student with id : " + std);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void printListStudent() {
    StudentDAO studentDAO = new StudentDAO();
    try {
      List<Student> students = studentDAO.findAll();
      System.out.println("List of student ");
      System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
          "StudentId", "Name", "Age", "Address", "Username");
      for (Student st :
          students) {
        System.out.printf("%-10s %-10s %-10d %-10s %-10s\n",
            st.getStudentId(),
            st.getName(),
            st.getAge(),
            st.getAddress(),
            st.getUsername());
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void editInfoStudent(String username) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    StudentDAO studentDAO = new StudentDAO();
    Student student = new Student();
    System.out.println("Enter name : ");
    student.setName(scanner.nextLine());

    System.out.println("Enter age  : ");
    student.setAge(scanner.nextInt());
    scanner.nextLine();

    System.out.println("Enter address: ");
    student.setAddress(scanner.nextLine());

    studentDAO.update(student, username);
    System.out.println("Edit information success");
  }
}
