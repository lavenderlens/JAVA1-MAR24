package main;

import org.w3c.dom.ls.LSOutput;

public class App {

    public static void main(String[] args) {
        // two main types of print output
        // sout
        System.out.println("Hello from Print ln");
        //souf
        System.out.printf("Hello from Print f\n");

        // sout
        System.out.println("Hello from Print ln");
        //souf
        System.out.printf("Hello from Print f");

        //variable declaration
        // pre java 11
        String name ="Alan";
           //post java 11
                var name2="Suzanne";
        /**
         *  you cant always substitute VAR
         *  in class fields unintitalised , var wont work
         *  for plymorphic declaration  (see inheritance)
         */

        //concatenation of output - joining strings and variables together
        System.out.println("Hello my name is "+name);
        System.out.printf("Hello my name is %s\n", name2);
    }
}
