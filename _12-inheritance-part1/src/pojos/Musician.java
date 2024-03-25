package pojos;

import java.util.Arrays;
import java.util.Objects;

public class Musician {


    /**
     * encapsulating from the start, with:
     * private fields
     * public constructor(s)
     * public getters/setters
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
public void plays(){
    System.out.printf("%s plays %s\n", name, Arrays.toString(instruments));
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
