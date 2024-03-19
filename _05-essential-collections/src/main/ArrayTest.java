package main;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        /**
        arrays are:
        zero-indexed
         fixed size
         can store duplicates
         can store both primitive and reference typs
         are objects themselves
         */
        // initialistaion )declaration and assigment at once)
        // cannot use var
        int[] nums1 = {1,2,3};

        // separate declaration and assignment
        var nums2 = new int[3];//argument is length

        // getting elements
        // array name and index of element
        System.out.println(nums1[0]);
        System.out.println(nums2[0]);// default 0

        nums1[0] = 1;//and so on

        var strings = new String[3];
        System.out.println(strings[0]);// default null

        /**
         * using arrays in Java,
         * we may pack n number of method arguments
         * into an array, known as VARARGS
         * rules of varargs:
         * zero, one, or many arguments
         * get packed into an array
         * it must be last in parameter list
         */
        class Person{
            String name;
            int age;
            String[] hobbies;

            // constructor
            Person(String name, int age, String... hobbies){
                this.name = name;
                this.age = age;
                this.hobbies = hobbies;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", hobbies=" + Arrays.toString(hobbies) +
                        '}';
            }
        }//end Person class
        var p1 = new Person("Alan", 57, "Netflix");
        var p2 = new Person("Suzanne", 21, "Netflix", "Walking", "Cycling");
        System.out.println(p1);
        System.out.println(p2);

        // multi-dimensional arrays
        String[][] chessboard = new String[8][8];
        chessboard[0][0] = "Black Castle Left";
        chessboard[0][1] = "Black Knight Left";
        chessboard[0][2] = "Black Bishop Left";
        chessboard[0][3] = "Black King";
        chessboard[0][4] = "Black Queen";
        chessboard[0][5] = "Black Bishop Right";
        chessboard[0][6] = "Black Knight Right";
        chessboard[0][7] = "Black Castle Right";
        chessboard[1][0] = "Black Pawn";
        chessboard[1][1] = "Black Pawn";
        chessboard[1][2] = "Black Pawn";
        chessboard[1][3] = "Black Pawn";
        chessboard[1][4] = "Black Pawn";
        chessboard[1][5] = "Black Pawn";
        chessboard[1][6] = "Black Pawn";
        chessboard[1][7] = "Black Pawn";

        // traversing 2D array - use two loops
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(chessboard[i][j]);
            }

        }


    }
}
