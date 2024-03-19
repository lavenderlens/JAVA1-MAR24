package pojos;

public class Route {
    /**
     * a static member ("member" does for both variables and methods)
     * means that each instance of the class sees the same one and only copy
     * static members belong to the class, not to each instance
     * static field: an attribute or prop of the class
     * static method: a method that doesn't use the instance's fields
     */

    public long id;
    public int start;
    public int end;

    public RouteType type;//will refactor later
    public static long nextId = 1001;//static field

    public Route(){
        this.id = nextId++;
    }
    public Route(RouteType type){
        this();//chain to no args constructor
        this.type = type;
    }
    public Route(RouteType type, int start, int end){
        this(type);
        this.start = start;
        this.end = end;
    }

    public static double toMiles(double kms){
        return kms * 0.6;
    }
    public static double toKms(double miles){
        return miles / 0.6;
    }
    // an instance method (without static keyword)
    public int routeLengthFromInstance(){
        return end - start;
    }
}
