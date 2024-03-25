package pojos;

import java.util.Arrays;
import java.util.Objects;

public abstract class Musician {


    /**
     * encapsulating from the start, with:
     * private fields
     * public constructor(s)
     * public getters/setters
     *
     * INHERITANCE PART 2
     *
     * ABSTRACT CLASSES AND INTERFACES
     * Q: what does a Musician play?
     * A: what type of musician do you mean?
     * so therefore Musician is a candidtae class for abstraction
     *
     * ABSTRACT CLASSES AND METHODS
     *
     * you cannot instantiate and abstract class
     * you may only instantiate concrete classes that inherit from it
     * we enforce this by placing the keyword abstract on the class definition
     * after the access modifier and before the class keyword
     *
     * abstraction helps us to distill ONLY the fields and methods that are indeed common to all instances of a system
     * an abstract class may have none, one, or many abstract methods
     * if a method is abstract
     * it must be implemented in the subclasses
     * an abstract method is like a contract with the implementing classes
     * it does not say HOW to do something
     * merely WHAT that thing is
     *
     * MODIFYING CLASSES THAT MAY INHERIT
     *
     * FINAL CLASSES
     * put the keyword final before the class keyword
     * final class CannotBeSubclassed{}
     * final classes may not be subclassed
     * FINAL METHODS
     * similarly, final methods may not be overridden
     *
     * further granularity was permitted in Java 15 (17 LTS)
     * SEALED CLASSES
     * A sealed class is one that MUST be inherited (as opposed to final classes)
     * It MUST specify its subclasses up front
     * sealed class Account permits SavingsAccount, CurrentAccount
     * The inheriting classes that inherit from a sealed class must themselves be either:
     * - final : cannot be subclassed
     * - sealed : must specify THEIR OWN subclasses
     * - non-sealed : can be subclassed
     * non-sealed effectively defaults back to normal behaviour
     *
     */

    private String name;
    private int age;
    private String[] instruments;

    public Musician(String name, int age, String... instruments) {
        this.name = name;
        this.age = age;
        this.instruments = instruments;
    }
//    generally best practice for readability to put
//    fields
//    constructors
//    custom methods
//    boilerplate methods

    // plays() refactored to an interface
//public abstract void plays();
//    System.out.printf("%s plays %s\n", name, Arrays.toString(instruments));

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getInstruments() {
        return instruments;
    }

//    public void setInstruments(String[] instruments) {
//        this.instruments = instruments;
//    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", instruments=" + Arrays.toString(instruments) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Musician)) return false;
        Musician musician = (Musician) o;
        return age == musician.age && Objects.equals(name, musician.name) && Arrays.equals(instruments, musician.instruments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(instruments);
        return result;
    }
}
