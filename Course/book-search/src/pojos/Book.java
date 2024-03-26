package pojos;

public class Book {

    public String title;
    public String authors;
    public double averageRating;
    public int numPages;

    public String asTableRow(){
        return String.format("%-50s %-50s %4.2f %4d", title, authors, averageRating,numPages);
    }
}
