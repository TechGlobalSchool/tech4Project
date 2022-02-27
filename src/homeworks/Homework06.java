package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        /*
        Requirement:
        Write a Java program that asks user to enter 2
        numbers(number1 and number2) and store those in int
        variables.
        Find the result of number1/number2 and store this in a
        double.
        Finally, print the result

        Test data:
        Number1 = 15
        Number2 = 2

        Expected Output:
        7.5

        NOTE: 7.5 is a double or float but you are asked to store
        the result in a double. Make sure that your result is not
        returning 7 instead of 7.5
        NOTE: expected results should exactly match!!!
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt(), num2 = input.nextInt();

        double division = (double)num1 / (double)num2; // 15.0   2.0  7.5

        System.out.println(division);
    }
}
