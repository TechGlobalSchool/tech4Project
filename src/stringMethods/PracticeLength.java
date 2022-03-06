package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    /*
    Write a Java program that asks user to enter their favorite book name and quote
    And store answers of user in different Strings
    Finally, print the length of those Strings with proper messages
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite book");
        String favBook = input.nextLine();

        System.out.println("Please enter your favorite quote");
        String favQuote = input.nextLine();

        System.out.println("The length of \"" + favBook + "\" is = " + favBook.length());
        System.out.println("The length of \"" + favQuote + "\" is = " + favQuote.length());

    }
}
