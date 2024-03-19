package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {

        /**
         * here we look at 4 things up close:
         * coercion of types using built in methods of wrapper classes Integer, Double etc
         * promotion and demotion among different types
         * the inherent inaccuracy of floating-point arithmetic
         * the specialist BigDecimal class
         */

        // type coercion strings to numbers
        String stringNum = "1";
        System.out.println(stringNum + 1);
        int parsedInt = Integer.parseInt(stringNum);
        System.out.println(parsedInt + 1);
        double parsedDouble = Double.parseDouble(stringNum);
        System.out.println(parsedDouble + 1);

        // these methods onlyw ork with digits and dot character
        // int error = Integer.parseInt("1x");//NumberFormatException
        // this exception is unchecked - no compile time warning,
        // not expected to use exception handling
        // just not to write code like this

        // promotion and demotion
        // wrong way: bigger type into smaller (demotion)
        int demotedInt = (int)2.9;
        System.out.println(demotedInt);//2 no rounding, just truncation

        // right way round: smaller into bigger (promotion)
        Double promotedDouble = new Double(parsedInt); // wrapper class
//        double promotedDouble = (double)parsedInt; // primitive cast
        System.out.println(promotedDouble);

        // autoboxing and unboxing
        double primitiveDouble = new Double(parsedInt);
        // automatically obtain primitive from object wrapper class

        // floating point inaccuracy
        System.out.println(0.1 * 3.0);//0.30000000000000004
        System.out.println(0.1 + 0.1 + 0.1);//0.30000000000000004

        // can we format the output?
        // yes, but only approximate - value unchanged
        System.out.printf("formatted results : %.1f, %.1f\n", 0.1*3.0, 0.1 + 0.1 + 0.1);

        // solution is to use BigDecimal class
        // we should use this for ALL numeric calculations where accuracy is important
        // especially involving division and/or multiplication

        // multiplication
        var n1 = new BigDecimal("0.1").setScale(18);
        var n2 = new BigDecimal("3.0");
        System.out.println(n1.multiply(n2));

        // division
        System.out.println(1.33 / 6.33); //0.21011058451816747
        var n3 = new BigDecimal("1.33").setScale(18);
        var n4 = new BigDecimal("6.33");
//        System.out.println(n3.divide(n4));//ArithmeticException
        System.out.println(n3.divide(n4, RoundingMode.UP));//order matters in division

        // if you MUST pass primitives, use a static method of the BigDecimal class
        var n5 = BigDecimal.valueOf(1.33).setScale(18);
        var n6 = BigDecimal.valueOf(6.33);
        System.out.println(n5.divide(n6, RoundingMode.UP));

        // adding and subtracting
        System.out.println(n5.add(n6));
        System.out.println(n6.subtract(n5));

        // whole number division and remainder
        var n7 = new BigDecimal("10");
        var n8 = new BigDecimal("3");
        System.out.println(n7.divideToIntegralValue(n8));
        System.out.println(n7.remainder(n8));
        System.out.println(n7.divideAndRemainder(n8));//returns a BigDecimal array
        BigDecimal[] result = n7.divideAndRemainder(n8);
        for(var bd : result){
            System.out.println(bd);
        }
    }
}
