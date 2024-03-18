package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFile {
    public static void main(String[] args) {
        var fileContents = "My jacket 'round your shoulders, the falling leaves\n" +
                "The wet grass on our backs as the autumn breeze drifts through the trees\n";
        try {
            Files.writeString(Path.of("test.txt"), fileContents);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
