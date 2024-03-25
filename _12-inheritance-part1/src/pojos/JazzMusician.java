package pojos;

public class JazzMusician extends Musician{

    private String rider;
    public JazzMusician(String name, int age, String... instruments) {
        super(name, age, instruments);
    }

    public JazzMusician(String name, String rider, int age, String... instruments) {
        super(name, age, instruments);
        this.rider = rider;
    }

    @Override
    public void plays() {
        super.plays();
        System.out.printf("A rider of %s is required at all times.\n", rider);
    }

    public String getRider() {
        return rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }
}
