package homeworks;

public class Homework13 {
    public static void main(String[] args) {

        /*
        Requirement:
        Write a program to find the first positive and
        negative numbers in an int array
        Test data:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        Expected output:
        First positive number is: 5
        First negative number is: -4
        NOTE: Make your code dynamic that works for
        any given int array.
         */

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

//        boolean isPositiveFound = false;
//        boolean isNegativeFound = false;
        int pos = -1;
        int neg = 1;

        for (int number : numbers) {

            if (pos != -1 && neg != 1) break; // optional for performance

            if (pos == -1 && number > 0){
                pos = number;
            }else if (neg == 1 && number < 0){
                neg = number;
            }
        }

        System.out.println((pos != -1) ? "First positive number is: " + pos : "Positive number was not found!");
        System.out.println((neg != 1) ? "First negative number is: " + neg : "Negative number was not found!");



    }
}
