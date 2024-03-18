package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        // take the filename off the user:
        System.out.println("Enter filename of file to read:");
        var filename = scanner.nextLine();
        filename = "src/main/" + filename;//no leading fwd slash!
        /**
         * in IO (input/output) there are a lot of things that could go wrong.
         * could be wrong filename
         * wrong file extension
         * wrong path to the right filename
         * java knows!
         * so, a lot of these methods will have to be wrapped in exception handling
         * there are broadly speaking two main types of exception:
         * those that the compiler knows about and MUST be handled before the code compiles
         * called CHECKED exceptions because the compiler checks before it compiles
         * those that the compiler does not know about
         * called unchecked exceptions because it will not check before it runs code
         * we MAY write exception handling code for UNchecked exceptions
         * but should not - these should be fixed by the developer
         */
        String fileContents = null;
        try {
            fileContents = Files.readString(Path.of(filename));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(fileContents);
    }
}
