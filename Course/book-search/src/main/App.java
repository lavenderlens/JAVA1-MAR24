package main;

import pojos.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var books = new ArrayList<Book>();
        String contents = null;

        try {
            contents = Files.readString(Path.of("book.csv"));
        } catch (IOException e) {
           // e.printStackTrace();
        }

        var lines = contents.split("\n");
        for (var line : lines) {
            var cols = line.split(",");
            var book1 = new Book();
            book1.title = cols[1];
            book1.authors = cols[2].replace("-", " and ");
            book1.averageRating = Double.parseDouble(cols[3]);
            book1.numPages = Integer.parseInt(cols[7]);

            books.add(book1);

        }
            var s = new Scanner(System.in);
            System.out.printf("Please enter text to search for a book");
            var search = s.nextLine();
            System.out.printf("Please enter a MINIMUM avarege rating");
            var rating = s.nextDouble();

            for (var book2 : books){

                if (book2.title.toLowerCase().contains(search.toLowerCase()) && book2.averageRating >= rating) {
                    System.out.println(book2.asTableRow());
                }


        }
    }
}
