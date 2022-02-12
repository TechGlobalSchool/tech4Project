package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args) {

        /*
        name        --> next()
        age         --> nextInt()
        myBrainOK   --> nextBoolean()
        fav quote   --> nextLine()
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = userInput.next();

        System.out.println("Whats your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOK = userInput.nextBoolean();

        System.out.println("Whats your address?");
        userInput.nextLine();
        String address = userInput.nextLine();

        System.out.println("User name is = " + name +
                "\nUser age is = " + age +
                "\nIs user's brain OK? = " + myBrainOK +
                "\nUser's address is = " + address);
    }
}
