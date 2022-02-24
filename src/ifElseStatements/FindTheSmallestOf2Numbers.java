package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 numbers
        Find the smallest and print it

        EXAMPLE PROGRAM:
        Program: Please enter 2 numbers
        User: 5 7

        Program: 5
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt();

        //1st way - using Math.min() method
        //System.out.println(Math.min(num1, num2));


        //2nd way - using simple if else
        /*
        if(num1 < num2)System.out.println(num1);
        else System.out.println(num2);
         */


        //3rd way - using ternary operator
        /*
        Ternary Operator
        -Java ternary operator can be used instead of if-else statement
        -It is used a lot in Java programming
        NOTE: It can be used only for simple if-else statement
        You cannot used for if - else if - else and nested if else statements
        variable variableName = condition ? option1 : option2;
         */

        int smallestNumber = num1 < num2 ? num1 : num2;

        System.out.println(smallestNumber);

        System.out.println("End of the program!");

    }
}
