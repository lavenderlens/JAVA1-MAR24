package lamdas;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSort {
    public static void main(String[] args) {
        /**
         * A java lambda expresison substitutes
         * (show in stages here)
         * an implementation of a functional interface
         * (interface with only one abstract method)
         * S of LISKOV substitution - Single responsibility
         * WHEN supplied as a method argument itself
         */

        String[] testStrings= {"Suzanne", "Alan", "Bertrand","Immanuel", "Jean-Paul", "Fred" };

        // Arrays.sort() accepts a Comparator interface as an argument
        // Comparator has only one abstract method compare()
        // the default sort is in alphabetical order
        // we may override this with a sort based on length

        // 1. ORIGINAL SYNTAX
//        Arrays.sort(testStrings, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2){
//                return o1.length() - o2.length();
//            }
//        });

        // 2. remove interface and method names, insert arrow operator
//        Arrays.sort(testStrings, (String o1, String o2) -> {
//                return o1.length() - o2.length();
//        });
        // IF your functional interface method is more than one line in the body
        // this is the version you will use

        // if however your functional interface has only a return statement we may go further
        // 3. remove parameter type declaration
        // omit the curly braces AND the return keyword
        // NOTE: if return is removed, braces must be and vice versa
        // at this point, most lambdas may be written on one line
        Arrays.sort(testStrings, (o1, o2) -> o1.length() - o2.length());
        // Java infers all the above from context!






        for(String str : testStrings){
            System.out.println(str);
        }
    }
}
