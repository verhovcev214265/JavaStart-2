package sk.com.ymca.javastart.lecture1.classwork.ex1;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        String login = "Root";
        String password = "root";

        System.out.println("Enter Your Login!");
        Scanner scan = new Scanner(System.in);

        String userLogin = scan.next();
        if (userLogin.equals(login)) {
            System.out.println("Enter Your Password!");
            Scanner scann = new Scanner(System.in);
            String userPassword = scann.next();
            if (userPassword.equals(password)){
                System.out.println("Welcome");
            }
            else {
                System.out.println("Wrong Password");
            }
        }
        else {
            System.out.println("Wrong login");
        }
    }
}
