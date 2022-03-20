package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        /*
        int[] numbers = {5, 3, 0, -5};

        Find the greatest and print it

        RESULT:
        {5, 3, 0, -5} -> 5
        {4, 10, 15} -> 15
         */

        System.out.println("\n-------TASK-1-solution with sort--------\n");
        int[] numbers = {5, 3, 0, -5};
//        Arrays.sort(numbers); // ____ ________ ________ greatest
//        System.out.println(numbers[numbers.length-1]); // 5


        System.out.println("\n-------TASK-1-solution without sort--------\n");

        //5, 3, 0, -5

        int max = numbers[0];

        for (int number : numbers) {
            //if(number > max) max = number;
            max = Math.max(max, number);
        }

        System.out.println(max);


        /*
        TASK-2
        Create a double array and store below elements
        {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

        Find the minimum value

        RESULT:
        0.5
         */

        double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double minValue = Double.MAX_VALUE; // -73465473654.456

        for (double number : array) {
            //if(number < minValue) minValue = number;
            minValue = Math.min(minValue, number);
        }

        System.out.println(minValue); // 0.5
        /*
        Use above double array and find second minimum value

        RESULT:
        1.5
         */

        double minValue2 = Double.MAX_VALUE;

        for (double number : array) {
            if(number == minValue) continue;
            else if(number < minValue2) minValue2 = number;
        }
    }
}
