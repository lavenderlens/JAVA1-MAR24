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
        // TODO instantiate b4 identical to b2,
        //  run hashCode and equals without overrides
        System.out.println(b1);//pojos.Book@1134affc
        System.out.println(b2);//pojos.Book@d041cf

        Book b4 = null;
        try {
            b4 = new Book("Scary Smart", "Mo Gawdat");
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b2);
        System.out.println(b4);
        // BEFORE object class overrides hashCode and equals
        System.out.println(b2.hashCode());//440434003 ==>> -1307405768
        System.out.println(b4.hashCode());//1032616650 ==>> -1307405768
        System.out.println(b2 == b4);//false
        System.out.println(b2.equals(b4));//false ==>> true

    }
}
