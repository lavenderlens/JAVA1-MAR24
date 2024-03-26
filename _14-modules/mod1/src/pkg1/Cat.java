package pkg1;

public class Cat {

    private String name;

    public void speak(){
        System.out.printf("%s the cat says miaow\n", name);
    }
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
