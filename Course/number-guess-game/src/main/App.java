package main;

import jdk.swing.interop.SwingInterOpUtils;
import pojos.NumberGuessGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var runit = new Scanner(System.in);
        var game = new NumberGuessGame();

        while (!game.over){
            System.out.printf("Guess the magic number between %d and %d\n", NumberGuessGame.min, NumberGuessGame.max);
            var number = runit.nextInt();
            var message = game.guess(number);
            System.out.println(message);
          //  System.out.println();
        }
    }
}
