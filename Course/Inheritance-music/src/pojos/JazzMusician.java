package pojos;

public class JazzMusician extends Musician{

    private String rider;

    public JazzMusician(String name, int age, String... instruments) {
        super(name, age, instruments);// does NOT mean that a superclass object is created
        // but means that the way the parameters are set is the same
    }
    public JazzMusician(String name,  String rider, int age, String... instruments) {
        super(name, age, instruments);
        // instantiate subclass-specific field:
        this.rider = rider;
    }



    @Override
    public void plays() {
        super.plays();
        System.out.printf("requires a rider of %s\n", rider);
    }

    public String getRider() {
        return rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }
}
