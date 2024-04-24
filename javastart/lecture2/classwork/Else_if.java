package sk.com.ymca.javastart.lecture2.classwork;

import java.util.Scanner;

public class Else_if {
    public static void main(String[] args) {
        String name ="Dmytro";
        String surname="Pietukhov";
        final String answer ="Cool";

        System.out.println("Write my name or Surname");
        Scanner sc = new Scanner(System.in);

        String MyNameOrSurname = sc.next();
        if (MyNameOrSurname.equals(name)) System.out.println(answer);
        else if (MyNameOrSurname.equals(surname)) System.out.println(answer);
        else System.out.println("Wrong");
    }
}
