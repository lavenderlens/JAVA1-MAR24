package pojos;

public class LibraryBook {
    /**
     * NO main method!
     * this class makes LibraryBook objects
     * LibraryBook is its own custom datatype
     * some call this a UDT
     * User-Defined Type
     * each new instance may have different values
     * but has uniform properties (props)
     * these are set in instance fields:
     * variables declared in the class but outside of any method
     * they store the object's data / props/ attributes
     * the public keyword is an access modifier
     * the item on the right of the modifier is the data type
     * the item on the right of the datatype is the variable/field name
     * every LibraryBook object gets their own copy of these fields
     * but may have different values assigned to them
     *
     */

    // instance fields
    public int number;
    public String title;
    public String author;
    public boolean onLoan;

    // constructor(s) = if NO constructor specified here
    // Java will supply its own, no-args constructor

    // instance methods
//    @Override
//    public String toString(){
//        return "title: " + title + "\n" +
//                "author: " + author + "\n" +
//                "number: " + number + "\n" +
//                "on loan?: " + onLoan + "\n";
//    }


    @Override
    public String toString() {
        return "LibraryBook{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", onLoan=" + onLoan +
                '}';
    }
}
