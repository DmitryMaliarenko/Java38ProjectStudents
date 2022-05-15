package com.company;

import com.company.util.LoginUtil;
import com.company.util.PasswordUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Login:");
        StringBuilder login = new StringBuilder(scanner.nextLine());
        System.out.println("Введите Password:");
        StringBuilder password = new StringBuilder(scanner.nextLine());
        System.out.println("Повторите Password:");
        StringBuilder confirmPassword = new StringBuilder(scanner.nextLine());
        if (LoginUtil.checkLogin(login) && PasswordUtil.checkPassword(password, confirmPassword)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
