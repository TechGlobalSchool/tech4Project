package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {

        /*
        Write a Java program that reads firstName and lastName from user and
        print those as full name in 1 statement
         */

        /*
        Pseudo Code:
        1. Create an object of scanner (import)
        2. Print out instructions about what we need
        3. Use next() method for reading
        4. Print out the first and last name in one statement
         */


        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();

        System.out.println("First name and the last name of the user is = "
                + firstName + " " + lastName);


        /*
        Write a Java program that reads the full address from user and print the address
         */

        /*
        Pseudo Code:
        1. Create an object of Scanner
        2. Print out the question
        3. Get the address by the nextLine() method and store it
        4. Print out the user's address
         */

        //Your code goes here

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your address?");
        input.nextLine(); //takes the space
        String userAddress = input.nextLine(); // now it can take the rest of the sentence


        System.out.println("User address is = \"" + userAddress + "\"");

        /*
        Write a Java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("First number:");
        int num1 = userInput.nextInt();
        System.out.println("Second number:");
        int num2 = userInput.nextInt();
        System.out.println("Third number:");
        int num3 = userInput.nextInt();

        int sum1 = num1 + num2 + num3;

        System.out.println("Sum of the numbers is = " + sum1);

        System.out.println(" What is your number?");
        int sum2 = userInput.nextInt() + userInput.nextInt() + userInput.nextInt();
        System.out.println( "Sum of the numbers = " + sum2);


    }
}
