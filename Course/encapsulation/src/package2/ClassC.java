package package2;

import package1.ClassA;

public class ClassC extends ClassA{
    public static void main(String[] args) {
        ClassA a = new ClassA();

        //a. still can only see public

        ClassC c = new ClassC();
       // c.// child class object sees protected
       var newmember = c.revealProtectedMember();
        System.out.println(newmember);

    }

    public int revealProtectedMember(){
        return  seeProtected;
    }


}
