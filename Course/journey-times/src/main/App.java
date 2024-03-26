package main;

import pojos.Journey;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var j1= new Journey();

                j1.distance = 100;
                j1.averageSpeed = 30;

                j1.getTime();

                var time = j1.getTime();
        System.out.println(time);

            System.out.println(j1.getTime());

        var keyboard = new Scanner(System.in);
        var journey = new Journey();

        System.out.println("Please enter the distance :");
        journey.distance = keyboard.nextDouble();
        System.out.println("Please enter the average speed :");
        journey.averageSpeed = keyboard.nextDouble();
        System.out.printf("Journey time is %f", journey.getTime());
        System.out.println("Journey time is " + journey.getTime());

    }
}
