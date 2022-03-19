package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */

        System.out.println("\n---------TASK-1----------\n");
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));


        /*
        TASK-1
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom
         */
    }
}
