package pojos;

import java.util.Arrays;

public class SessionMusician extends Musician implements Plays, Records{
    // there is little point creating a subclass unless:
    // you do/have new things
    // do things differently
    // have a new thing: pay rate for session musicians
    private double payRate;

    public SessionMusician(String name, int age, String... instruments) {
        super(name, age, instruments);// does NOT mean that a superclass object is created
        // but means that the way the parameters are set is the same
    }
    public SessionMusician(String name, int age, double payRate, String... instruments) {
        super(name, age, instruments);
        // instantiate subclass-specific field:
        this.payRate = payRate;
    }

    @Override
    public void plays(){
        System.out.printf("%s plays %s for %.2f/hour\n", getName(), Arrays.toString(getInstruments()), payRate);

    }
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public void records() {
        System.out.printf("Recording in studio for $%s/hour\n", payRate * 2);
    }
}
