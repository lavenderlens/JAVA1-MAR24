package pojos;

public interface Plays {

    /**
     * a java interface has members that are BY DEFAULT both public and abstract
     * an interface with just ONE public abstract method
     * is called a FUNCTIONAL INTERFACE
     * functional interfaces are candidates for lambda functions
     * when passed as a method argument to another method - see File IO - tomorrow
     * there are a whole list of other types of interface method which we shall not go into here
     * the beauty of interfaces is, in the trainer's opinion, that they are responsible for one single thing
     */

    void plays();
}
