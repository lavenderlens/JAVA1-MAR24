package pojos;

public class LibraryBook {
    // instance fields
    public int number;
    public String title;
    public String author;
    public boolean onLoan;

    private static int nextNumber = 1001;
    // replace no-args constructor if I still want that behaviour
    public LibraryBook(){};
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.onLoan = false;
        this.number = nextNumber++;
    }

    // constructor(s) = if NO constructor specified here
    // Java will supply its own, no-args constructor

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
