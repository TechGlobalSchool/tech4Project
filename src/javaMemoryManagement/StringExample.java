package javaMemoryManagement;

import java.util.ArrayList;

public class StringExample {
    public static void main(String[] args) {

        //First way to create String
        String name1 = "John";

        //Second way to create String
        String name2 = new String("Alex");

        String name3 = "Alex";
        String name4 = "John";

        // To compare strings, DO NOT USE == operator

        System.out.println(name1 == name4); // true
        System.out.println(name2 == name3); // false
        System.out.println(name2.equals(name3)); // true
        System.out.println(name2);
        System.out.println(name3);

    }
}
