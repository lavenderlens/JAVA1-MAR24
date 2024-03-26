package pojos;

import java.util.Arrays;

public class JazzMusician extends Musician implements Plays {


    private String rider;

    public JazzMusician(String name, int age, String... instruments) {
        super(name, age, instruments);

    }

//    public JazzMusician(String name, int age, String rider, String... instruments) {
//        super(name, age, instruments);
//        this.rider = rider;
//    }

//    public JazzMusician(String name, int age, String rider, String... instruments) {
//        super(name, age, instruments);
//        this.rider = rider;
//    }

    public JazzMusician(String name, String rider, int age, String... instruments) {
        super(name, age, instruments);
        this.rider = rider;
    }

    @Override // make sure compiler runs this method and not the superclass one of the same name
    public void plays(){
        System.out.printf("%s plays %s and has this rider:  %s\n", this.getName(), Arrays.toString(this.getInstruments()), this.getRider());
    }

    public String getRider() {
        return rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }
}