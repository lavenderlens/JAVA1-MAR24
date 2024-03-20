package pojos;
public class Book {



    public String title;

    public String authors;

    public double averageRating;

    public int numPages;

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

    public String asTableRow(){

        return String.format("%-50s %-50s %4.2f %4d", title, authors, averageRating,numPages);

    }

}


