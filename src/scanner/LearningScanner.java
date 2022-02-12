package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {

        /*
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading the data.
         */

        Scanner scanner = new Scanner(System.in); // creating a scanner object for using the methods of it

        System.out.println("Please put your first name:"); // this is what I want user to put
        String firstName = scanner.next(); // storing the first name from user

        System.out.println("Please put your last name:"); // second message for user
        String lastName = scanner.next(); // storing the last name from user

        System.out.println("First name = " + firstName); // Printing my object/variable
        System.out.println("Last name = " + lastName); // Printing my object/variable

    }
}
