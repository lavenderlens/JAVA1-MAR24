package main;

import pojos.Book;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Book b1 = null;
        try {
            b1 = new Book("Born To Run", "Springsteen");
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        Book b2 = null;
        try {
            b2 = new Book("Why We Drive", "Matthew Crawford");
        } catch (Exception e) {
//            System.out.println( e.getMessage());
            e.printStackTrace();

        }
        Book b3 = null;
        try {
            b3 = new Book("", "Matthew Crawford");
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        Book b4 = null;
        try {
            b4 = new Book("Why We Drive", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();

        }
        var library = new ArrayList<Book>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        for( var book : library){
//            if(book.title != null && !book.authors.equals("")) {
            try {
                System.out.printf("Book %s by %s\n", book.title, book.authors);
            } catch (NullPointerException e){ // unchecked
//            } else {
//                System.out.printf("not a book object, %s\n", e.getMessage());
            }
        }

        // general unchecked exception classes:
        int[] nums = {1,2,3};
        // ArrayIndexOutOfBoundsException
//        System.out.println(nums[3]);//no hints at compile time

        String s = "HEllo";
        // StringIndexOutOfBoundsException
//        System.out.println(s.charAt(5));

    }
}
