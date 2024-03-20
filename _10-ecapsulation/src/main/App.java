package main;

import pojos.Book;
import pojos.BookException;

public class App {
    public static void main(String[] args) {

        Book b1 = null;
        try {
            b1 = new Book("The Future of Geography", "Tim Marshall");
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
        Book b2 = null;
        try {
            b2 = new Book("Scary Smart", "Mo Gawdat");
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
//        b2.title = "Not so scary";
//        b2.authors = "alan lavender";
        try {
            b1.setTitle("The future of History");
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
        try {
            b1.setAuthors("alan lavender");
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(b1.authors);// can't access value
        System.out.println(b1.getAuthors());// use public getter

    }
}
