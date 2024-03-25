package pojos;

public class VirtualMusician extends Musician implements Records{

    /**
     *  a virtual musician is another abstraction under Musician
     *  it is a software-based musician
     *  so it never plays LIVE
     *  so the plays() method is largely redundant in it
     *  BUT plays(), as an abstract method in Musician
     *  is hard-baked into our system and needs to be overridden at least nominally in EVERY subclass
     *  you could argue the same about the age prop
     *  but for ease of refactoring let's just assume:
     *  age represents years since last update
     *
     *  REFACTOR plays() into an INTERFACE
     */
    private String software;
    public VirtualMusician(String name, String software, int age, String... instruments) {
        super(name, age, instruments);
        this.software = software;
    }

    @Override
    public void records() {
        System.out.printf("Recording in studio using %s software\n", software);

    }

    // as an interface, plays() does not need to be implemented by VirtualMusician
//    @Override
//    public void plays() {
//
//    }
}
