package pkg2;

public class Dog {

    private String name;

    public void speak(){
        System.out.printf("%s the dog says woof\n", name);
    }
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
