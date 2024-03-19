package main;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        /**
         * arrays are restrictive insofar as they cannot grow or shrink
         * inserting/removing from an array can be tedious
         * it often results in the shuffling of positions of the other elements
         * there exist dozens of Collection classes in the java.util package
         * we have to import from java.util (Groovy note: this is included)
         *
         * four main categories of collection:
         * 1. Lists: ordered, permit duplicates
         * 2. sets; unordered, no duplicates permitted
         * 3. Queues; FIFO, FILO
         * 4. Maps; unordered key:value pairs (no duplicate keys)
         *
         * any collection with the word tree in it is a sorted variant
         * each collection class is generic - we must specify BOTH the type of collection AND the type of element
         * (what we intend to store in it)
         * collections do not store primitives
         * we get around this using object wrapper class
         *
         * ArrayList is one of many List types available
         * (for later in inheritance section:
         * List is an interface, ArrayList is concrete implementation of interface)
         * the underlying storage mechanism for ArrayList is... array!
         * LinkedList is an alternative to ArrayList that does not use an array
         * use ArrayList if you get/set elements most of the time
         * use LinkedList if you add/remove most of the time
         */

        // 2 ways of declaring:
        // old way pre-Java 9 (11 LTS)
        ArrayList<Integer> nums1 = new ArrayList<>(100);//initial capacity
        // inference here is L-R

        // post Java 9/11
        var nums2 = new ArrayList<Integer>(100);
        // type inference R-L

        // HOWEVER if we wish to use a DIFFRENET type L and R
        // you cannot use var
        // this is quite common see inheritance
        List<Integer> nums3 = new ArrayList<>();
        // called a polymorphic declaration
        // LHS says WHAT it should do (be a type of List)
        // RHS says HOW to do it (specifically an ArrayList)
        // works because every ArrayList IS-A type of List
        // other classes may also implement List

    // ArrayLists have size not length
        System.out.println(nums1.size());//size; 0, initialCapacity:100
        // we use the add method to add elements
        nums1.add(1);//autoboxed into Integer
        System.out.println(nums1);
        System.out.println(nums1.size());
    }
}
