package pojos;

import java.util.Objects;

public class Book {
    /**
     * 3 basic steps toward encapsulation
     * en-capsule-ation:
     * the act of protecting data from outside direct influence
     * akin to drawing a capsule around your data
     * 1. private fields
     * 2. public methods (constructor, getters and setters)
     * TODO
     * 3. Object class overrides (hashCode(), equals(), and toString())
     */


    private String title;

    private String authors;

    private double averageRating;

    private int numPages;

    public Book(){

    }
    public Book(String title, String authors) throws BookException {
        setTitle(title);
        setAuthors(authors);
    }

    public void setTitle(String title) throws BookException {
        if(title == null || title.equals("")){
            throw new BookException("title must not be blank");
//            throw new BookException();
        }
        this.title = title;
    }
    public void setAuthors(String authors) throws BookException {
        if(authors == null || authors.equals("")){
            throw new BookException("authors must not be blank");
//            throw new BookException();
        }
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getNumPages() {
        return numPages;
    }

    public String asTableRow(){

        return String.format("%-50s %-50s %4.2f %4d", title, authors, averageRating,numPages);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equals(book.title) && Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}


