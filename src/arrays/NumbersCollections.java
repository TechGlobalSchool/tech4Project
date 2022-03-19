package arrays;

import java.util.Arrays;

public class NumbersCollections {
    public static void main(String[] args) {
        /*
        Create an array to store 1, 2, 3
        Print array

        EXPECTED OUTPUT:
        [1, 2, 3]
         */

        System.out.println("\n-----1st way-----\n");
        int[] numbers1 = new int[3]; // [0, 0, 0]
        numbers1[0] = 1; // [1, 0, 0]
        numbers1[1] = 2; // [1, 2, 0]
        numbers1[2] = 3; // [1, 2, 3]

        System.out.println(Arrays.toString(numbers1));


        System.out.println("\n-----2nd way-----\n");
        int[] numbers2 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers2));


        System.out.println("\n-----3rd way-----\n");
        int[] numbers3 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbers3));
    }
}
