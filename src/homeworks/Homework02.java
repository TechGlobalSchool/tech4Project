package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {


        System.out.println("\nTASK1\n");
        Scanner collect = new Scanner(System.in);

        System.out.println("What is your first and last name?");
        String firstName = collect.next();
        String lastName = collect.next();


        System.out.println("What is your age?");
        int age = collect.nextInt();

        System.out.println("What is your email address?");
        String email = collect.next();

        // there is space here
        collect.nextLine();
        // there is NO MORE space

        System.out.println("What is your phone number?");
        String phoneNumber = collect.nextLine();

        System.out.println("What is your address?");
        String address = collect.nextLine();


        /*
            User who joined this program is John Doe. John’s age is 45. John’s email
        address is johndoe@gmail.com, phone number (123) 123 1234, and address is
        123 St Chicago IL 12345.
         */
        System.out.println("\tUser who joined this program is " + firstName + " " +
                lastName + ". John’s age is " + age + ". John’s email \naddress is "
                + email + ", phone number " + phoneNumber + ", and address is \n" +
                address + ".");

        System.out.println("\nTASK2\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your fav book?");
        String favBook = scan.nextLine();

        System.out.println("What is your fav color?");
        String favColor = scan.next();

        System.out.println("What is your fav number?");
        int favNumber = scan.nextInt();

        /*
        User’s favorite book is: The Brothers Karamazov
        User’s favorite color is: Blue
        User’s favorite number is: 7
         */
        System.out.println("User’s favorite book is: " + favBook +
                "\nUser’s favorite color is: " + favColor +
                "\nUser’s favorite number is: " + favNumber);

    }
}
