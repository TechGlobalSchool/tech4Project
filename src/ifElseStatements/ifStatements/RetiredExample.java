package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter their age
        And print “It is your time to get retired!” if their age is more than or equal to 55
        NOTE: Write PSEUDO CODE first

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 60

        Program: It is your time to get retired!

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 45

        Program:

         */


        /*
        1. Create a Scanner object
        2. Ask a question about their age
        3. Retrieve age
        4. Use if statement and proper action in curly braces
         */

        Scanner i = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int age = i.nextInt();

        boolean isAgeMoreThanOrEqual55 = age >= 55;

        if(age >= 55){
            System.out.println("It is your time to get retired!");

        } else{
            System.out.println("You will not retire!");
        }


    }
}
