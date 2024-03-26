package main;

import com.google.gson.Gson;
import pojos.Car;

public class App {
    public static void main(String[] args) {

        /**
         * JSON is JavaScript object notation
         * not the same syntax as JS itself
         * used as glue language for transporting data
         *
         * dependency com.google.gson.Gson must be EITHER
         * included in the build path of a Java EE project as Maven XML in the POM
         * OR
         * download as a JAR file and add to project root
         * File > Project Structure > (shortcut of CMD +;)
         * Libraries > "+" button
         * JAVA > browse to JAR download
         */

        Gson gson = new Gson();

        Car car1 = new Car();
        car1.make = "Vauxhall";
        car1.model = "Mokka";
        car1.doors = 5;

        String jsonFromJava = gson.toJson(car1);
        System.out.println(jsonFromJava);
        // equivalent method in JS is JSON.Stringify()

        String json = "{\"make\":\"VW\",\"model\":\"Polo\",\"doors\":5}";
        Car car2 = gson.fromJson(json, Car.class);
        System.out.printf("%s %s %s-door", car2.make, car2.model, car2.doors);
        // equivalent method in JS is JSON.parse()

        // adapted from JENKOV:
        // http://tutorials.jenkov.com/java-json/gson-installation.html
        // http://tutorials.jenkov.com/java-json/gson.html

    }
}
