package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        /**
         * A REGEX or regular expression is a pattern that,
         * when offered up as a match to something - usually a String
         * either returns a match or rejects
         * Java follows PCRE standard (Perl-compatible)
         * what we show here is not the symbols that are used
         * but the implementation in the Java syntax
         *
         * 3 main methods
         * COMPILE() - returns Pattern object from String input
         * syntax:
         * static Pattern compile(String regex)
         *
         * MATCHER() - creates a Matcher object that will match input against Pattern
         * syntax:
         * Matcher matcher(CharSequence input)
         *
         * MATCHES() - returns a boolean - true for a match
         * syntax:
         * static boolean matches(String regex, CharSequence input)
         */

        // match a valid email address
        // NOTE Java needs double escape characters
        Pattern p = Pattern.compile("\\w+.\\w+@\\w+.\\w+");
        Matcher m = p.matcher("alan@alanlavender.com");
        boolean b = m.matches();
        System.out.println(b);

        // all in one line:
        System.out.println(Pattern.matches("\\w+.\\w+@\\w+.\\w+", "alan@alanlavender.com"));

        // app to validate NINOs
        Scanner s = new Scanner(System.in);
        Pattern ninopattern = Pattern.compile("[A-Z]{2}[0-9]{6}[A-Z]");
        while(true){
            System.out.println(("enter a candidate NINO:"));
            var nino = s.nextLine();
            Matcher matcher = ninopattern.matcher(nino);
            boolean result = matcher.matches();
            if(result){
                System.out.println(nino + " is valid");
            } else {
                System.out.println(nino + " is invalid");
            }

            System.out.println("more numbers to test? Y for yes, N for no");
            var more = s.nextLine();
            if(more.equalsIgnoreCase("N")){
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
