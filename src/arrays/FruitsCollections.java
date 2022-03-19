package arrays;

import java.util.Arrays;

public class FruitsCollections {
    public static void main(String[] args) {
        /*
        Task-1
        Create an array that will store 4 fruit names
        Then, print the empty array

        EXPECTED OUTPUT:
        [null, null, null, null]
         */

        String[] fruits = new String[4];

        System.out.println(Arrays.toString(fruits)); // [null, null, null, null]

        /*
        Task-2
        Store your fav fruit in the index of 0
        Store the 4th fav fruit in the index of 3
        Print the array again

        EXPECTED OUTPUT:
        [Apple, null, null, Banana]
         */

        fruits[0] = "Apple";
        fruits[3] = "Banana";

        System.out.println(Arrays.toString(fruits)); // [Apple, null, null, Banana]

        /*
        Task-3
        Find the size of your array and print it
        SIZE = How many elements you have in the array

        EXPECTED OUTPUT:
        4
         */

        System.out.println(fruits.length); // 4

        /*
        Task-4
        Print the elements at the index of 0 and 3
         */

        System.out.println(fruits[0]); // Apple
        System.out.println(fruits[3]); // Banana

        //What if we try to get a value that is null
        System.out.println(fruits[1]); // null

        System.out.println(fruits[0].toUpperCase()); // APPLE
        System.out.println(fruits[0].charAt(0)); // A
        System.out.println(fruits[3].length()); // 6
        System.out.println(fruits[3].startsWith("B")); // true

        //System.out.println(fruits[1].length()); // NullPointerException
    }
}
