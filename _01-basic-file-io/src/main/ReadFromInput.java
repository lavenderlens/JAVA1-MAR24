package main;

import java.util.Scanner;

public class ReadFromInput {
    public static void main(String[] args) {


        var scanner = new Scanner(System.in);
        System.out.println("read from input:");
        System.out.println("Enter a number:");
        var num1 = scanner.nextInt();
        System.out.println("Enter another number");
        var num2 = scanner.nextInt();
        ///////////////////
        // next line hack:
        scanner.nextLine();//advances cursor past same line, where number methods leave it
        ///////////////////
        System.out.println(("Enter a name (String): "));
        var name = scanner.nextLine();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(name);
    }
}
