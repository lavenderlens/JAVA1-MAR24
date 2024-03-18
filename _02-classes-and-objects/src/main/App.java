package main;

import pojos.LibraryBook;

public class App {
    public static void main(String[] args) {
        /**
         *         this is where we make objects
         *         each object of a certain class will have
         *         the same properties
         *         but not necessarily the same values
         *         if we have a constructor defines
         *         we may assign values at object instantiation time
         *         instantiation: to make an instance (of the class)
         */
        var book1 = new LibraryBook();
        System.out.println(book1.author);
        System.out.println(book1.title);
        System.out.println(book1.number);
        System.out.println(book1.onLoan);

        // setting props using dot notation
        book1.author = "Julia Donaldson";
        book1.title = "The Gruffalo";
        book1.number = 1234;
        book1.onLoan = true;

        System.out.println(book1.author);
        System.out.println(book1.title);
        System.out.println(book1.number);
        System.out.println(book1.onLoan);

        System.out.println(book1);//pojos.LibraryBook@1134affc
    }
}
