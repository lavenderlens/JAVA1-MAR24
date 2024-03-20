package package2;

import package1.ClassA;

public class ClassC extends ClassA{
    public static void main(String[] args) {

        ClassA a = new ClassA();
//        a.// just public

        ClassC c = new ClassC();
//        c.// sees protected now, and public

        // we can break protected encapsulation
 var newmember =  c.revealProtectedMember();
        System.out.println(newmember);
    }
    public int revealProtectedMember(){
        return seeProtected;
    }

}
