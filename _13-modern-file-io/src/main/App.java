package main;

import pojos.JazzMusician;
import pojos.Musician;
import pojos.SessionMusician;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Musician> band = new ArrayList<>();

        band.add(new SessionMusician("Kurt Ramm", 56, 250.0, "Trumpet"));
        band.add(new SessionMusician("Jake Clemons", 45, 1750.0, "Sax"));
        band.add(new SessionMusician("Clarence Clemons", 70, 2150.0, "Sax"));
        band.add(new SessionMusician("Alan Lavender", 55, 500.0, "Trombone"));
        band.add(new SessionMusician("Lindsay Shilling", 62, 650.0, "Trombone"));
        band.add(new SessionMusician("Steve Van Zandt", 70, 2500.0, "Guitar"));
        band.add(new SessionMusician("Nils Lofgren", 70, 2500.0, "Guitar"));
        band.add(new SessionMusician("Tom Morello", 60, 1500.0, "Guitar"));
        band.add(new JazzMusician("Dizzie Gillespie", "Tenessee Whiskey", 102, "Trumpet"));
        band.add(new JazzMusician("Louis Armstrong", "Bourbon", 130, "Trumpet"));
        band.add(new JazzMusician("Ella Fitzgerald", "Ice Cream", 120, "Vox"));
        band.add(new JazzMusician("Cleo Lane", "Martini Rosso", 90, "Vox"));
        band.add(new JazzMusician("Johnny Dankworth", "Sam Smith's bitter", 91, "Guitar"));

        /**
         * Functional programming, or FP for short, is a way of working, or a paradigm
         * that differs from and also compliments OOP
         * FP is neither better nro worse than OOP
         * both may be used together in the same app and often are
         * OOP architecture - classes, inheritance, abstraction, interfaces etc
         * is often used to model data
         * FP methods are often used to present alternative VIEWS of the data
         * FP favours transformations over modifications
         * new data with changes applied over same data mutated in place
         * think: SAVE-AS and not Save
         *
         * a functional interface is a key unit in FP
         * it has only one, abstract method
         * functional interfaces may be represented in a form of shorthand syntax
         * called Java lambdas
         * a method reference is an even shorter syntax
         * that may be substituted for lambdas
         * where a lambda has only one arg
         * method references amke use of existing lambda implementations
         * a stream is like a production line
         * data is placed on it, and may be operated on to produce:
         * a new stream (FP)
         * streams transformations include:
         * MAP
         * - transform every element on the stream and return them in a new stream
         * FILTER
         * - return only those elements that pass a test (predicate) function
         * - if the test returns true, the element is copied into the new stream
         *
         * streams are a viable alternative to loops,
         * because they can iterate over data,
         * (and methods, because functions may be passed in)
         * plus new data will automatically be processed when added the stream
         * stream could be thought of as keeping a live binding to the data
         * anything new is caught by the stream
         * side not: we have worked with streams since day 1 of this course
         * SOUT - System.out.println/printf
         * the "out" is the output stream from our code to the system
         * Scanner s = new Scanner(System.in)
         * the "in" is the input stream from the system to our code
         *
         * stream operators
         * many stream operators take a functional interface as a method argument
         * and so may be substituted by lambdas
         * if only one arg is passed to a lambda
         * this may be further simplified as a method reference
         * stream operations may be chained together for even more powerful transformations
         * the last operation in a chain is usually a collector operation to collect and output the data
         * the most used is foreEach(),
         * which may come as a bit of a shock to those with frontend experience:
         * forEach is used heavily in JavaScript!
         *
         */

        // 1. a stream to map names only
//        band.stream().map(musician -> musician.getName()).forEach(name -> System.out.println(name));
        band.stream().map(musician -> musician.getName()).forEach(System.out::println);// method ref

        // 2. a stream to filter pay rates above 1k
        // filter first for instances of SessionMusician
        // generally, filter best to use before map in a chain
        // because it reduces the size of the dataset - performance
        System.out.println("\n\nPaid > 1000/hour:");
        band.stream()
                .filter(musician -> musician instanceof SessionMusician)//check class
                .map(musician -> (SessionMusician)musician)//legal downcast
                .filter(sessionMusician -> sessionMusician.getPayRate() > 1000)//RHS is boolean expression for filter operation
                .forEach(s -> System.out.printf("%s paid %s\n", s.getName(), s.getPayRate()));

        // 3. a stream to filter guitarists and map their pay rate
        band.stream().filter(musician -> musician instanceof SessionMusician)
                .map(musician -> (SessionMusician) musician)
                .filter(sessionMusician -> sessionMusician.getInstruments()[0].equals("Guitar"))
//                .forEach(guitarist -> System.out.printf("%s plays %s and is paid %.2f/hour\n",
//                        guitarist.getName(),
//                        guitarist.getInstruments()[0],
//                        guitarist.getPayRate()));// one line less and accesses more object props
                .map(guitarist -> guitarist.getPayRate())
                .forEach(System.out::println);

        // 4. show the rider and the name of all the jazz musicians
        band.stream()
                .filter(musician -> musician instanceof JazzMusician)
//                .map(jazzMusician -> ((JazzMusician) jazzMusician).getRider())
        // but this destroys the object structure
        // we may NOT go back and extract another prop (name)
                .forEach(j -> System.out.printf("%s requires rider %s\n", j.getName(), ((JazzMusician) j).getRider()));




    }
}
