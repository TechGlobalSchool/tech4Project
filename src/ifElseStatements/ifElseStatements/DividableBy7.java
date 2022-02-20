package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class DividableBy7 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number.
        If the number entered is dividable by 7, then print message
        “The number you entered is dividable by 7!”
        If the number entered is dividable by 7, then print message
        “The number you entered is not dividable by 7!”


        EXAMPLE PROGRAM 1
        Program: Please enter a number?
        User: 7

        Program: The number you entered is dividable by 7!

        EXAMPLE PROGRAM 2
        Program: Please enter a number?
        User: 13

        Program: The number you entered not dividable by 7!

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number?");
        int num = input.nextInt();

        if(num % 7 == 0){
            System.out.println("The number you entered is dividable by 7!");
        }else{
            System.out.println("The number you entered is not dividable by 7!");
        }

    }
}
