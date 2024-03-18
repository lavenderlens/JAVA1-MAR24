package main;

public class App {
    public static void main(String[] args) {
        // two main types of print output
        // sout
        System.out.println("Hello from println");
        System.out.println("Hello from println");

        // souf
        System.out.printf("Hello from printf\n");
        System.out.printf("Hello from printf\n");

        // variable declaration
        // pre-Java11
        String name = "Alan";

        // post-Java11
        var name2 = "Suzanne";
        /**
         * type inference with var
         * the context is inferred
         * String data on LHS of =
         * therefore, variable on LHS of = must be of type String
         * you can't always substitute var for the datatype
         * we will see the following exceptions:
         * in class fileds, un-initialised, var won't work
         * for polymorphic declarations (see inheritance)
         * Car c = new Car()
         * =>>
         * var c = new Car()
         * Car d = new DieselCar() and DieselCar inherits from Car
         * =>>
         * cannot say var
         * otherwise, var stands for
         * "tell me the type of the variable on LHS of =
         * FROM the expression provided on RHS of ="
         */

        // concatenation of output - joining strings and variables together
        System.out.println("Hello my name is " + name);
        System.out.printf("Hello my name is %s \n", name2);

    }
}
