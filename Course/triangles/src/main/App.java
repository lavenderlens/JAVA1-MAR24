package main;

import pojos.RightAngleTriangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        var triangle = new RightAngleTriangle();

        System.out.println("Please enter length of opposite");
        triangle.opposite = keyboard.nextDouble();
        System.out.println("Please enter length of adjacent");
        triangle.opposite = keyboard.nextDouble();

        var angle = triangle.unknownAngle();
        System.out.printf("Unknown angle is :%s\n", angle);
        var side = triangle.unknownSide();
        System.out.printf("Unkown side is :%s\n", side);
    }
}
