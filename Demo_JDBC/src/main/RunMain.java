package main;

import java.sql.SQLException;
import java.util.Scanner;

import static main.MainAccount.forgotPassword;
import static main.MainStudent.*;

public class RunMain {
  public static void main(String[] args) throws SQLException {

    do{
      System.out.println("==> WELCOME <==");
      System.out.println("1.Login");
      System.out.println("2.Registration");
      System.out.println("3.Forgot password");
      System.out.print(" Enter your chose : ");
      int chose = new Scanner(System.in).nextInt();

      switch (chose){
        case 1:{
          logIn();
          break;
        }
        case 2:{
          register();
          break;
        }
        case 3:{
          forgotPassword();
          break;
        }
      }
    }while (true);
  }
}
