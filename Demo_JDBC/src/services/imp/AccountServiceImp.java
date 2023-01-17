package services.imp;

import model.Account;
import services.AccountService;


import java.util.Scanner;

public class AccountServiceImp implements AccountService {

  @Override
  public void input(Account tk) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Enter your account : ");
    System.out.print(" Username : ");
    tk.setUsername(scanner.nextLine());

    System.out.println(" Password : ");
    tk.setPassword(scanner.nextLine());

    //define create role is user , but role of admin create in database
    tk.setRole("user");
  }

  @Override
  public void output(Account tk) {
    System.out.printf("%-10s %-10s\n", tk.getUsername(), tk.getPassword());
  }
}

