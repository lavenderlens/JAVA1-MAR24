package pojos;

import java.util.Arrays;
import java.util.Objects;

public abstract class Musician {
    /**
     * ABSTRACT CLASSES AND INTERFACES
     * Q: what does a Musician play?
     * A: Q: what type of musician do you mean?
     * so, therefore, Musician is a candidate for abstraction
     * you cannot instantiate a general type Musician
     * it has to be a specific subtype of Musician
     * we can do this by placing the keyword abstract on the class definition
     * then you may no longer make an instance of musician
     * but you may still make instances of its subclasses (unless they are abstract)
     * only the state (instance fields) and the behaviour (instance methods)
     * that is in common with ALL Musician objects should be in the Musician class
     *
     * an abstract class may have NONE, ONE, or MANY abstract methods
     * if a method is abstract
     * then the class must be abstract
     * an abstract method is more like a CONTRACT with the implementing classes
     * it does not say HOW to do something, merely that it SHOULD be done
     * if a class is abstract it may not be instantiated
     *
     */
    private String name;
    private int age;
    private String[] instruments;

    // abstract classes may still have constructors
    // even though you can't make an instance!
    // this is so, in order that they may pass business rules down to the subclasses
    public Musician(String name, int age, String ...instruments) {
        this.name = name;
        this.age = age;
        this.instruments = instruments;
    }

    // refactored to interface <<Plays()>>
//    public abstract void plays();//abstract method signature - no implementation!
//    {
////        System.out.printf("%s plays %s\n", name, Arrays.toString(instruments));
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

        if (age != musician.age) return false;
        if (!Objects.equals(name, musician.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(instruments, musician.instruments);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + Arrays.hashCode(instruments);
        return result;
    }

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
    }//to get instruments directly means we could write code like this
//    musician.getInstruments()[0] = "a new instrument"

//    public void setInstruments(String[] instruments) {
//        this.instruments = instruments;
//    }
}
