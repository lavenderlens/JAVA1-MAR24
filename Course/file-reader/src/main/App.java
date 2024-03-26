package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        String filecontents = null;
        while (true) {
            System.out.println("Please enter a filename");
            String filename = keyboard.nextLine();

            try {
                filecontents = Files.readString(Path.of(filename));
                break;
            } catch (IOException e) {
                System.out.println("The file cannot be read");
            }
        }
        var lines = filecontents.split("\n");
        var numLines = 0;
        while (true){
            System.out.println("How many lines to read?");
        try {
            numLines = Integer.parseInt(keyboard.nextLine());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }
    }
        for ( var i= 0; i < numLines; i++){
            System.out.println(lines[i]);
        }

       // for (var line : lines) {
        //    System.out.println(line);
     //   }
    }

}
