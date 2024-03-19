package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /**
         * decisions and loops are both controlled by boolean expressions
         * operators could be comparison - == != > >= < <=
         * or logical - && || !
         * the and and the or above are called short-circuit operators
         * if they find what they need in the first half of the expression
         * the second half is ignored and not evaluated
         * this is fine UNLESS
         * an assignment takes place in the RHS
         * in which case it may or may not happen
         *
         * ++ and -- increment/decrement operators
         */

        int ss1 = 1;
        int ss2 = 1;

        int a = 3;
        int b = 4;

        var result = a > b && b < a;
        /**
         * a > b false
         * the two haves of the && expression CANNOT be true
         * second side not evaluated
         */
        result = a > b || b < a;
        /**
         * a > b is false
         * but one true is enough for an or to be true
         * so has to evaluate second side
         */
        result = a < b || b > a;
        /**
         * a , b is true
         * so no need to evaluate second side
         */
        ss1++;
        ++ss2;
        System.out.println("ss1: " + ss1);//2
        System.out.println("ss2: " + ss2);//2
        var postFix = a + ss1++;
        var preFix = a + ++ss2;
        System.out.println(postFix); // 5 // variable incremented AFTER use
        System.out.println(preFix); // 6 // variable incremented BEFORE use
        System.out.println("ss1: " + ss1);//3
        System.out.println("ss2: " + ss2);//3
        // ++ or -- just shorthand for this
        var x = 1;
        x = x + 1;
        x += 1;
        x++;

        // if - else if - else
        var scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week 1-7");
//        var dayOfWeek = scanner.nextInt();
        var dayOfWeek = 1;

        // one branch if
        if(dayOfWeek == 6 || dayOfWeek == 7){
            System.out.println("It's the weekend");
        }
        // two branch if else
        if(dayOfWeek == 6 || dayOfWeek == 7){
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday");
        }
        // three or more branches if else if else
        if(dayOfWeek == 6 || dayOfWeek == 7){
            System.out.println("It's the weekend");
        } if(dayOfWeek == 5){
            System.out.println("It's almost the weekend");
        }
        else {
            System.out.println("It's a weekday");
        }
        // there is no limit to the number of if else-if statements
        // note that as soon as a match is found, if-else-if exits
        // so the ORDER in which you execute conditions matters
        // note no semi-colons
        // statements work as a coherent whole

        // switch statements
        // switch with break is interchangeable with if - else - if using break

        System.out.println("Enter a meal option 1-3\n" +
                "1. Burger\n" +
                "2. Burger and fries\n" +
                "3. Burger, fries and drink\n");
//        var mealOption = scanner.nextInt();
//        switch(mealOption){
//            // switch tests one value for equality
//            //we may NOT use floating-point numbers for this reason
//            // each case's data must match the variable for type
//            case 1:
//                System.out.println("You ordered Burger");
//                break;
//            case 2:
//                System.out.println("You ordered Burger, fries");
//                break;
//            case 3:
//                System.out.println("You ordered Burger, fries, drink");
//                break;
//            default:
//                System.out.println("please enter a valid option 1-3");
//        }//end switch

        // switch WITHOUT break is suited to additive business logic
        // as each case, where a match is found, does NOT exit
        // but executes and also all cases underneath it

//        switch(mealOption){
        switch (1){
            // switch tests one value for equality
            //we may NOT use floating-point numbers for this reason
            // each case's data must match the variable for type
            case 3:
                System.out.println("drink, ");
            case 2:
                System.out.println("fries, ");
            case 1:
                System.out.println("burger, ");
            default:
                System.out.println("have a nice day!");
        }//end switch

        /**
         * LOOPS (iterative statements)
         * for
         * enhanced for
         * while
         * do while
         */
    String[] names = {"Alan", "Suzanne", "Sid", "Nancy"};
        // for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("for..." + names[i]);
        }

        // enhanced for loop
        for(var name : names){
            // names is real list
            // name is arbitary variable
            // but makes sense to have it as singular
            System.out.println("enhanced..." + name);
        }

        // while loop
        var counter = 0;
        while(counter < names.length){
            System.out.println("while... " + names[counter]);
            counter++;//important!
        }
        // however while loops are best suited to scenarios where
        // the number of iterations is not known in advance

        while(true){
            System.out.println("Enter a name or X to quit");
            var name = scanner.nextLine();
            if(name.equalsIgnoreCase("X")){
                break;
            }
            System.out.println("You entered " + name);
        }

        // using break and continue
        for (int i = 0; i < names.length; i++) {
            if(names[i] == "Sid"){
                break;
            }
            System.out.println("for..." + names[i]);
        }
        for (int i = 0; i < names.length; i++) {
            if(names[i] == "Sid"){
                continue;
            }
            System.out.println("for..." + names[i]);
        }

        // do while loop
        // executes AT LEAST ONCE
        // even if condition never evaluates true

        var more = false;
        do {
            System.out.println("Enter a name or X to quit");
            var name = scanner.nextLine();
            if(name.equalsIgnoreCase("X")){
                more = false;
            }
            System.out.println("You entered " + name);
        } while(more);
    }//end main
}//end class
