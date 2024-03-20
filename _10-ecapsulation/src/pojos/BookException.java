package pojos;

public class BookException extends Exception{
    /**minimally, code only needs to be this
     * then we will see BookEception, our custom class,
     * in the stack trace
     * IF we wish to pass a message where the exception throws,
     * we need a constructor as well that will take a message
     * Java classes ALWAYS have (a) constructor(s) that have the same name as the class
     */
    public BookException(String message){
        super(message);
    }
}
