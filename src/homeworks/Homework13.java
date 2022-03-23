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

//        boolean isPositiveFound = false;
//        boolean isNegativeFound = false;
//
//        for (int number : numbers) {
//            if (isNegativeFound && isPositiveFound)break;
//
//            if (!isPositiveFound && number > 0){
//                System.out.println("First positive number is: " + number);
//                isPositiveFound = true;
//            }
//            else if (!isNegativeFound && number < 0){
//                System.out.println("First negative number is: " + number);
//                isNegativeFound = true;
//            }
//        }
//
//        if (!isPositiveFound) System.out.println("Positive number was not found!");
//        if (!isNegativeFound) System.out.println("Negative number was not found!");


        /*
        Requirement:
        Write a program to find the all-matching elements between
        2  int arrays
        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        Expected output 1:
        20
        50
        70
        Test data 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};

        Expected output 2:
        There is no matching elements
        NOTE: Make your code dynamic that works for any given
        int arrays.
         */

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean isDuplicateFound = false;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]){
                    System.out.println(numbers1[i]);
                    isDuplicateFound = true;
                    break;
                }
            }
        }

        if(!isDuplicateFound) System.out.println("There is no matching elements");


        /*
        Requirement:
        Write a program to print duplicated characters in
        a String, ignore cases
        Test data 1:
        String str = ”baNana”;
        Expected output 1:
        a
        N
        Test data 2:
        String str = ”aPple”;
        Expected output 1:
        P
        NOTE: Make your code dynamic that works for
        any given String.
         */

        String str = "baNana";
        //            012345
        String duplicates = ""; // a , n

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                !duplicates.contains(str.toLowerCase().substring(i, i + 1))){
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }

            }
        }

    }
}
