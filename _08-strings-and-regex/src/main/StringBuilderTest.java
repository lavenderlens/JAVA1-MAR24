package main;

public class StringBuilderTest {
    public static void main(String[] args) {

        /**
         * as strings are immutable
         * if your app relies on a lot of them
         * it is conceivable that the the string pool area of the heap
         * may grow to a considerable size while running
         * all interned strings may be reused
         * while this is oerformant when reuse occurs
         * if they are NOT REUSED THEN THIS IS UNNECESSARY
         * STRINGBUILDER takes strings as input, similar to BigDecimal
         * but is a MUTABLE wrapper class for strings
         * StringBuilder objects, then, favour strings that are modified and not re-used
         * There exists another class called StringBuffer which is threadsafe for concurrent Java apps
         * so why not use StringBuffer all the time?
         * similar to arrays and ArrayList,
         * StringBuilder is more performant
         */

        // consider this:
        var s = "";//1
        s = "I ";//2
        s += "love ";//3 4 I love
        s += "java.";//5 6 I love java

        // how many strings are created in the code above? 6 at least
        // these strings are super small
        // imagine if you will, a whole several pages of text added to in this manner

        var sb = new StringBuilder();//doesn't need an import, in java.lang
        sb.append("I ");
        sb.append("love ");
        sb.append("stringBuilder ");
        // same question how many strings are made? 1 StringBuilder object
        // SB favours smallish strings that are re-assigned a lot




    }
}
