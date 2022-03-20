package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        RESULT:
        true
        */
        System.out.println("\n--------TASK-1---------\n");
        boolean hasMouse = false;

        for (String object : objects) {
            if (object.equals("Mouse")) {
                hasMouse = true;
                break;
            }
        }

        System.out.println(hasMouse);

        /*
        TASK-2
        Check the collection you have above and print true if one of the element is board
        Print false otherwise

        RESULT:
        false
        */
        System.out.println("\n--------TASK-2---------\n");
        boolean hasBoard = false;

        for (String object : objects) {
            if (object.equals("board")) {
                hasBoard = true;
                break;
            }
        }
        System.out.println(hasBoard);


        /*
        TASK-3
        Check if you have an element equals to "iPad"
        If so, print true
        Else, print false

        "Remote", "Mouse","Mouse", "Keyboard", "iPad"

        Arrays class has binarySearch() method that helps us find if our collection contains a specific element or not
        NOTE: To be able to use this method, your array MUST be sorted first

        This method is taking 2 args, first is your array collection and the second is the element you are looking for

        1.One element is found -> it returns the index of the element - more than or equal to zero
        2.Multiple elements are found -> it returns the index of last occurrence
        3.No element found -> always returns negative index (-possible index -1)
         */
        System.out.println("\n--------TASK-3---------\n");

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false


        /*
        TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}

        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3
        Check if collection has -7

        RESULT:
        true
        true
        true
        false
        true
         */

        System.out.println("\n--------TASK-4---------\n");
        int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(numbers); // -7, -2, 0, 0, 5, 5, 8, 45, 53
        System.out.println(Arrays.binarySearch(numbers, 5) >= 0); //true
        System.out.println(Arrays.binarySearch(numbers, 0) >= 0); //true
        System.out.println(Arrays.binarySearch(numbers, 45) >= 0); //true
        System.out.println(Arrays.binarySearch(numbers, 3) >= 0); //false
        System.out.println(Arrays.binarySearch(numbers, -7) >= 0); //true

        System.out.println(Arrays.binarySearch(numbers, 5, 9, 0) >= 0); // false
    }
}
