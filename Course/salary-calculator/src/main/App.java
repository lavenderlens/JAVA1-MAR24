package main;

import pojos.EmploymentContract;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        var contract1 = new EmploymentContract();
        var keyboard = new Scanner(System.in);

        System.out.println(("Please enter gross hourly rate"));
        contract1.grossHourlyRate = keyboard.nextDouble();

        System.out.println("Please enter the contract hours per week");
        contract1.hoursPerWeek = keyboard.nextDouble();

        System.out.printf("Annual Net Salary is :%.2f\n", contract1.annualNetSalary());


    }
}
