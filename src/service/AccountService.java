package service;

import entities.Account;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountService {
    public void creatAccount(Scanner scanner, ArrayList<Account>accounts){
        System.out.println("Input username: ");
        String username = scanner.nextLine();
        System.out.println("NHập email: ");
        String email = scanner.nextLine();
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        Account account = new Account(username, email, password);
        accounts.add(account);
    }

    public void loginAccount(Scanner scanner, ArrayList<Account> accounts){
        AccountService service = new AccountService();
        System.out.println("Input username: ");
        String username1 = scanner.nextLine();
        System.out.println("Input password: ");
        String password1 = scanner.nextLine();
        for (Account account: accounts){
            if (account.getUsername().equals(username1)){
                if (account.getPassword().equals(password1)){
                    System.out.println("dang nhap thanh cong, ban co the lam cac chuc nang sau:");
                    System.out.println("1. thay doi username");
                    System.out.println("2. thay doi email");
                    System.out.println("3. thay doi mat khau");
                    System.out.println("4. dang xuat");
                    System.out.println("0. thoat chuong trinh");
                }
            }

            if (account.getUsername().equals(username1)){
            }else {
                System.out.println("kiểm tra lại username");

            }
            if (account.getPassword().equals(password1)){
            } else {
                System.out.println("3.quen mat khau");
            }

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 3: service.forgetPass(scanner, accounts, "");
                break;
                case 4: return;
                case 0: System.exit(0);
                    System.out.println("da thoat chuong trinh");
                    break;
                case 1:service.changeUsername(scanner, accounts);
                break;
                case 2:service.changeEmail(scanner, accounts);
                break;
            }
        }
    }

    public void forgetPass(Scanner scanner, ArrayList<Account> accounts, String operator){
        System.out.println("nhap email");
        String email1 = scanner.nextLine();
        for (Account account: accounts){
            if (account.getEmail().equals(email1)){
                System.out.println("doi lai pass");
                String password = scanner.nextLine();
                account.setPassword(password);
                System.out.println("doi pass thanh cong");
            }
        }
    }

    public void changeUsername(Scanner scanner, ArrayList<Account> accounts){
        System.out.println("doi lai username");
        String username1 = new String(scanner.nextLine());
        for (Account account: accounts){
            account.setUsername(username1);
            System.out.println("doi username thanh cong");
            break;
        }
    }

    public void changeEmail(Scanner scanner, ArrayList<Account> accounts){
        System.out.println("doi lai email");
        String email1 = new String(scanner.nextLine());
        for (Account account: accounts){
            account.setEmail(email1);
            System.out.println("doi email thanh cong");
            break;
        }
    }
}
