package main;


import java.util.Scanner;

public class ReadFromInput {
    public static void main(String[] args) {


        var scanner = new Scanner(System.in);
        System.out.println("readfrominput");
        System.out.println("Enter a number");
        var num1 = scanner.nextInt();
        System.out.println("Enter another number");
        //scanner.nextLine();//advances cursor past same line where number methods leave it
        var num2 = scanner.nextInt();
        System.out.println("Enter a name [String] :");
        scanner.hasNextLine()
        var name = scanner.nextLine();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(name);

    }
}
