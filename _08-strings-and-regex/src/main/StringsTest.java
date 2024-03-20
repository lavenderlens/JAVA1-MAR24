package main;

public class StringsTest {
    public static void main(String[] args) {

        /**
         * the two types of string encoding
         * their pros and cons
         *
         * string pool strings (interned)
         * stored in a special area of the heap known as the string pool
         * LOOKS LIKE primitive declaration
         * strings made in this way are still objects
         * but they are re-used
         * this is the usual way of declaring strings
         * suits when they are re-used
         *
         * heap strings are made using the constructor function of the String class
         * they are NOT re-used
         * suits when their references are changed
         *
         */

        // string pool strings (interned)
        var s1 = "Hello";
        var s2 = "Hello";
        System.out.println(s1 == s2);//true

        // heap strings
        var s3 = new String("Goodbye");
        var s4 = new String("Goodbye");
        System.out.println(s3 == s4);//false -
        // they occupy two distinct memory addresses
        System.out.println(s3.equals(s4));//true -
        // the equals method of String is overridden to return true
        // IF same characters, same order
        // equals() also works for interned strings
        System.out.println(s1.equals(s2));//true

        // strings are like arrays of characters


//         they have a length prop and indices
        System.out.println(s3.length());
        System.out.println(s3.substring(4));//one arg, start idx to end
        System.out.println(s3.substring(0,4));//two args, start idx to end idx exclusive
        // end index exclusive is a rare auld thing because it works for end of string
        // which is NOT in indices
        System.out.println(s3.substring(0,7));//Goodbye
//        System.out.println(s3.charAt(7));//StringIndexOutOfBoundsException

        // text blocks Java 15 / Java 17 LTS
        // triple quoted
        // preserve line breaks in code
//        String message = """
//    Strings in text blocks
//    preserve
//    line
//    returns""";
    }
}
