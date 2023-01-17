package main;

import dao.AccountDAO;
import model.Account;

import java.util.List;
import java.util.Scanner;

import static dao.StudentDAO.getName;

public class MainAccount {
  //Get List Account
  public static List<Account> listTk() {
    AccountDAO accountDAO = new AccountDAO();
    return accountDAO.getAccount();
  }

  public static void forgotPassword() {
    System.out.println("Enter username : ");
    String username = new Scanner(System.in).next();
    if (getName(username) != null) {
      System.out.println("Enter password want to change : ");
      String password = new Scanner(System.in).next();
      AccountDAO accountDAO = new AccountDAO();
      accountDAO.updatePassword(username, password);
      System.out.println("Update password success!");
    } else
      System.out.println("Username is not exits!");
  }
}
