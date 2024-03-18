package main;

import pojos.LibraryBook;

public class App {
    public static void main(String[] args) {
        /**
         * two broad categories of variable in Java
         * 1. primitives: store values
         * 2. references: store a reference to a memory address
         */

        // example of a primitive
        int num1 = 42; // int is the default whole number type
        var num2 = 42; // var will infer int from the data

        /**
         * example of a reference type:
         * Strings are references, encoded in one of two ways:
         * WAY1
         * LOOKS LIKE the primitive above
         * but means they are coded for re-use
         * in a special area of memory called the string pool
         * by memory we mean on-chip memory, not even RAM
         * generally there is a fixed size area called the STACK (around 1Mb)
         * holds processes in execution and their local variables
         * the HEAP area is variable size and can grow quite large (several Gb)
         * it holds objects
         * the STRING POOL is part of the heap and holds strings only
         * a string pool string may be re-used
         * they are the preferred way of encoding strings
         *
         */
        // example of a reference variable
        // way 1 string pool strings for re-use
        String greeting1 = "Hello";
        var greeting2 = "Hello";
        //only ONE string encodd in string pool memory
        // strings are IMMUTABLE - cannot be changed
        System.out.println(greeting1.replace("H", "Y"));
        System.out.println(greeting1);//original unchanged
//        greeting1 = greeting1.replace("H", "Y");

        // way 2 heap strings for modification
        // strings made in this way are NOT re-used:
        // each occupies its own area in heap memory
        // do this when you want to treat your data as mutable
        // and envisage many changes inline
        String greeting3 = new String("Hello");
        var greeting4 = new String("Hello");

        System.out.println(greeting1 == greeting2);//true
        System.out.println(greeting3 == greeting4);//false

        // example of a reference variable with custom UDT User-Defined Type
        var book1 = new LibraryBook("Autobiography", "Bertrand Russell");

        /**
         * types of primitives
         * 8 basic types of which 6 are numbers
         * not including String which is a reference type
         */
        boolean myBoolean = true;                   // 1 bit memory: true/1 or false/0
        char myChar = 'c';                          // 2 bytes, MUST be single-quoted (number type: ASCII value or UNICODE)
        byte myByte = 127;                          // 1 byte, must be between -128-127
        short myShort = 32_000;                     // 2 bytes, integral (whole number) type
        int myint = 2_000_000_000;                  // 4 bytes, DEFAULT integral (whole number) type
        long myLong = 9_000_000_000_000_000_000L;   // 8 bytes, integral type, suffix optional L or l
        float myFloat = 4_004.555555555555F;                       // 4 bytes, floating-point or decimal type, recognises dot character, must use suffix F or f
        double myDouble = 4_004.555555555555D;                     // 8 bytes, DEFAULT floating-point type, OPTIONAL d/D suffix double precision (both sides of decimal point
        System.out.println(myFloat);
        System.out.println(myDouble);

        // casting - coercion of one datatype into another
        int x = 100;
        char d = (char)x; //
        System.out.println(d);

        int y = 200;
        byte b = (byte)y;
        System.out.println(b);//-56 loss of precision

        double d1 = 1.5;
        int dInt = (int)d1;
        System.out.println(dInt);//1

        /**
         * these are all examples of a DOWNCAST (bigger into smaller datatype)
         * downcasts are inherently dangerous but are still often used in inheritance
         * UPCASTS are perfectly safe over objects and primitives
         * also upcasts can and do occur automatically
         */

        // examples of upcasts
        int z = 4;
        int a = 3;
        double divZByA = (double) z / a;
        System.out.println(divZByA); // 1.3333333333333333
        System.out.println(z / a); // 1

        // arrays: a collection of values or references
        // can store primitives
        // permit iteration
        String[] names = {"Alan", "Suzanne"};//length 2
        String[] names2 = new String[2];
        names2[0] = "Alan";

        /**
         * other java collections accept Objects ONLY
         * what then, if we wish to store primitives in otehr collections?
         * for every primitive datatype there exists an object WRAPPER CLASS
         * that takes a primitive as its value
         * byte => Byte
         * short => Short
         * int => Integer
         * long => Long
         * float => Float
         * double => Double
         * char => Character
         * boolean => Boolean
         */
        var d2 = 1.5;//default double type
        Double d3 = d2;
//        d3.//bunch of methods
        char c2 = 'c';
        Character c3 = c2;
//        c3.

        /**
         * wrapper classes also provide methods for type coercion, where permisible
         * parseInt is a method of the Integer wrapper class
         * but a primitive int value is returned
         * the string value is automatically converted to an object
         * the method performed
         * and then the output is converted to a primitive again
         * this is called autoboxing(primitive to object)
         * and autounboxing(object to primitive)
         */
        String stringNum = "123";
        // if we wanted to use as a number:
        System.out.println(stringNum + 1);//1231
        int intNum = Integer.parseInt(stringNum);
        System.out.println(intNum + 1);

    }
}
