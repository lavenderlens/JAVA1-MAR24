package main;

import pkg1.Cat;
import pkg2.Dog;

public class App {
    public static void main(String[] args) {

        Cat c = new Cat("clarence");
        c.speak();

        Dog d = new Dog("cujo");
        d.speak();
    }
}
