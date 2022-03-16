package homeworks;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Homework11 {

    public static void main(String[] args) {

        System.out.println("\nTASK7\n");

        /*
        1. Create a scanner object for getting the FULL NAME
        2. Create a counter outside the loop
        3. Create a fori loop check EVERY single char if they are vowel count it
        4. Print out "There are 3 vowel letters in this full name"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();

        int counter = 0;

        for (int i = 0; i < fullName.length(); i++) { // 0, 1, ... length -2, length -1
            if (CharacterHelper.isVowel(fullName.charAt(i))) {
                counter++;
            }

        }

        System.out.println("There are " + counter + " vowel letters in this full name");

        System.out.println("\nTASK8\n");

        /*

        1. Create a do while loop
        2. Get number from user with scanner add them to sum
            - and if they are more than or equal to 100 "Sum of the entered numbers is at least 100"
        3. If the number is more than or equal to 100 AND we are at the FIRST run BREAK
            - and print out "This number is already more than 100"
        4. Create a container for counter, sum and number

         */

        int num = 0; // for getting a number from user
        int sum = 0; // for getting the SUM of given NUMBERS
        int attempt = 1; // for checking how many TIMES this loop has run
        do {
            System.out.println("Please enter a number");
            num = scanner.nextInt();

            if (attempt == 1 && num >= 100){
                System.out.println("This number is already more than 100");
                break;
            }else{
                sum += num;
                if (sum >= 100){
                    System.out.println("Sum of the entered numbers is at least 100");
                }

            }

            attempt++; // for updating how many TIMES we ran the loop
        }while (sum < 100);


        System.out.println("\nTASK9\n");

        /*
        1. two containers for 0, 1 and another one for the sum, String for message
        2. Create a fori loop runs 'n' times
        3. print out the series
         */

        int n1 = 0;
        int n2 = 1;
        int total = 0;
        String message = "";

        /*
                n1  n2  total
         i = 0| 0   1   1
         i = 1| 1   1   2
         i = 2| 1   2   3
         i = 3| 2   3   5
         ...
         ..
         0 – 1 – 1 – 2 – 3 – 5 - 8
         */

        for (int i = 0; i < 7; i++) {
            message += n1 + " - ";
            total = n1 + n2;

            n1 = n2;
            n2 = total;
        }

        System.out.println(message.substring(0, message.length() - 3));

        System.out.println("\nTASK10\n");


    }

}
