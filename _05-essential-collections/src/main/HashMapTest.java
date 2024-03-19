package main;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        /**
         * hashmap is a type of Map
         * it stores key:value pairs
         * unordered
         * keys must be unique
         * values may be duplicated
         */
        var band = new HashMap<String, String>();
        //old way
//        HashMap<String, String> band2 = new HashMap<>();

        // use setters to create key: value pairs
        band.put("Stevie", "guitar");
        band.put("Nils", "guitar");
        band.put("Tom", "guitar");
        band.put("Jake", "sax");
        band.put("Clarence", "sax");

        // traversing a HashMap
        System.out.println(band.keySet());
        System.out.println(band.values());
        System.out.println(band.entrySet()); // [Jake=sax, Tom=guitar, Nils=guitar, Stevie=guitar, Clarence=sax]

        for(var entry : band.entrySet()){
            System.out.println(entry.getKey() + " plays " + entry.getValue());
        }
        // old way
        for(Map.Entry<String, String> entry : band.entrySet()){
            System.out.println(entry.getKey() + " plays " + entry.getValue());
        }
    }
}
