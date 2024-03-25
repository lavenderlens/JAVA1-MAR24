package main;

import pojos.GuitarTech;
import pojos.JazzMusician;
import pojos.Musician;
import pojos.SessionMusician;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        GuitarTech gt = new GuitarTech();//class created backwards from here
        Musician m1 = new Musician("Alan", 21, "trombone", "keyboards", "Vox");
        // could also have used var: var m1 = new Musician("Alan", 21, "trombone", "keyboards", "Vox");

        System.out.println(m1);
        m1.plays();
        SessionMusician sm1 = new SessionMusician("Kurt", 56, 400.00, "Trumpet");
        sm1.plays();//without any code in subclass apart from constructors
        // plays() method is inherited from superclass
        System.out.println(sm1.getName());//inherited getter
//        System.out.println(sm1.payRate);//no inherited field
        // now with getter and setter pair in subclass:
        System.out.println(sm1.getPayRate());
        //POLYMORPHISM - ONE THING, MANY FORMS
        Musician sm2 = new SessionMusician("Kurt", 56, 400.0, "Trumpet");
        Musician jm1 = new JazzMusician("Dizzy", "Bourbon", 102, "Trumpet");
        // note we cannot use var if we wish to declare polymorphically

        // what of we wished to store different musician OBJECT TYPES together:
        // Polymorphism enables us to do just this
        // if we declare separate object types as the same (inherited) REFERENCE TYPE

        ArrayList<Musician> band = new ArrayList<>(10);
        band.add(m1);
        band.add(jm1);
        band.add(sm2);
        /**
         * we now have 3 types of flavours of Musician object
         * these are stored together under their common supertype
         * If we put them in a collection without a intermediate parent type
         * the superclass type would need to be Object
         * this is probably going to be too general to be use
         *
         */
//        for (var member : band){
//            System.out.printf("Band member: %s\n", member.getName());
//        }
        /**
         * what if we wanted to run subclass-specific behaviour?
         */
//        for (var member : band){
//            System.out.printf("Band member: %s\n", member.getName());
//            System.out.printf("Band member: %s\n", member.getAge());
//            member.plays();
//            // all good so far but cannot resolve the below:
////            System.out.printf("Band member: %s\n", member.getRider());
////            System.out.printf("Band member: %s\n", member.getPayRate());
//        }
        /**
         * when we polymorphically declare as above,
         * it is an example of an UPCAST
         * so every SessionMusician IS-A Musician
         * every JazzMusician the same
         * so to run subclass-specific methods on the polymorphically declared objects
         * we must perform a DOWNCAST to their object type
         * in order for the code to know WHICH downcast to apply to which object,
         * we run an instanceof check
         */
        // with instanceof checks and downcasts:
        for (var member : band){
            System.out.printf("Band member: %s\n", member.getName());
            System.out.printf("Band member: %s\n", member.getAge());
            member.plays();
            if(member instanceof JazzMusician){
                JazzMusician j = (JazzMusician) member;
                System.out.printf("Band member: requires %s\n", j.getRider());
            }
            if(member instanceof SessionMusician){
                SessionMusician s = (SessionMusician) member;
                System.out.printf("Band member: $%s /hour\n", s.getPayRate());
            }
//            System.out.printf("Band member: %s\n", member.getPayRate());
        }

    }
}
