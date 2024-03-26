package pojos;

import java.util.Arrays;

public class SessionMusician extends Musician implements Plays, Records{
    /**
     * there is little point in subclassing a parent class
     * unless you EITHER:
     * 1. have extra state (instance fields)
     * 2. do the same behaviour in a different way (instance methods
     *
     * mini-exercise:
     * create a subclass of Musician called JazzMusician
     * Jazz musicians, in addition to all the inherited props of Musician
     * have a rider (whiskey, ice cream, whatever)
     * Jazz Musicians should also override the plays() method to include their rider
     */
    // have something new
    private double payRate;
    public SessionMusician(String name, int age, String... instruments) {
        super(name, age, instruments);// calls superclass constructor
        // for these params which they both have
        // does NOT result in creation of two objects
    }
    public SessionMusician(String name, int age,double payRate, String... instruments) {
        this(name, age, instruments);// calls next constructor in this class
        this.payRate = payRate;
    }

    // do something differently
    @Override // make sure compiler runs this method and not the superclass one of the same name
    public void plays(){
        System.out.printf("%s plays %s and is $%s/hour\n", this.getName(), Arrays.toString(this.getInstruments()), this.getPayRate());
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
