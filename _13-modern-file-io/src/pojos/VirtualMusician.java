package pojos;

public class VirtualMusician extends Musician implements Records{
    /**
     * a virtual musician is another abstraction
     * it is a software-based musician
     * so it never plays live
     * but plays() is hard-baked into our OO system
     * solution:
     * remove abstract method plays() from Musician
     * and refactor to an interface
     * now VirtualMusician need not implement plays()
     */
    private String software;

    public VirtualMusician(String name, String software, int age, String... instruments) {
        super(name, age, instruments);
        this.software = software;
    }

    @Override
    public void records() {
        System.out.printf("Recording in %s\n", software);
    }
}
