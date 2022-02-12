package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {
        /*
        How to use Scanner methods
        1.Create an object of Scanner (import the class as well)
        ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed);
        2. variableName/objectName.methodName(if it is needed parameter);
         */

        /*
        Task-1
        1. Ask user to enter their age
        2. Print the question
        3. Use the proper next method (nextInt)
        4. Print out the user's age
         */

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your age?");
        int usersAge = collect.nextInt();

        System.out.println("User age is = " + usersAge);

        /*
        Ask for the account balance of the user
        Get the account balance and store it
        Print it out
         */

        System.out.println("What is your account balance?");
        double userAccountBalance = collect.nextDouble();
        System.out.println("\n\t\'User account balance is\' = \"$" + userAccountBalance + "\""); //"$12.56"


        /*
        Ask for user to "Are you understanding this java class today?"
        Get the answer and store it
        Print the answer
         */

        System.out.println("Are you understanding this java class today? (true/false)");
        boolean yourAnswer = collect.nextBoolean();
        System.out.println("User should not watch the video of today = \"" + yourAnswer + "\"");



    }
}
