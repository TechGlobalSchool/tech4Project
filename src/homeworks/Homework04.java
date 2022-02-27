package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        /*
        Requirement:
        -Write a Java program that asks user to enter 2
        numbers as input and print the average of the numbers.
        Test Data:
        7
        11
        Expected Output:
        The average of the given 2 numbers is: 9
         */
        ////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n------------TASK-1------------\n");

        Scanner scan = new Scanner(System.in); // Scanner object 20 bytes of memory

        System.out.println("Please enter 2 numbers");
        System.out.println("The average of the given 2 numbers is: " + (scan.nextInt() + scan.nextInt()) / 2);


        ////////////////////TASK-2 SOLUTION///////////////////
        System.out.println("\n------------TASK-2------------\n");
        System.out.println("Please enter 2 numbers");
        System.out.println("The average of the given 2 numbers is: " + (scan.nextInt() * scan.nextInt()));

        /*
        Requirement:
        -Write a Java program that asks user to enter 3
        numbers as input and print the square of each
        number entered by user.
        NOTE: Square of number means number
        multiplied with itself
        Test Data:
        5
        6
        10
        Expected Output:
        The 5 multiplied with 5 is = 25
        The 6 multiplied with 6 is = 36
        The 10 multiplied with 10 is = 100
         */
        ////////////////////TASK-3 SOLUTION///////////////////
        System.out.println("\n------------TASK-3------------\n");

        System.out.println("Please enter 3 numbers");
        int t3_num1 = scan.nextInt(), t3_num2 = scan.nextInt(), t3_num3 = scan.nextInt();

        System.out.println("The " + t3_num1 + " multiplied with " + t3_num1 + " is = " + (t3_num1 * t3_num1));
        System.out.println("The " + t3_num2 + " multiplied with " + t3_num2 + " is = " + (t3_num2 * t3_num2));
        System.out.println("The " + t3_num3 + " multiplied with " + t3_num3 + " is = " + (t3_num3 * t3_num3));




        ////////////////////TASK-5 SOLUTION///////////////////
        System.out.println("\n------------TASK-5------------\n");
        System.out.println("Please enter 5 numbers");
        System.out.println("The average of the given 2 numbers is: " +
                (scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt()) / 5);



        /*
        Requirement:
        -Write a Java program that asks user to enter a number
        as input and print its multiplication table up to 10.

        Test Data:
        7
        Expected Output:
        7 * 1 = 7
        7 * 2 = 14
        7 * 3 = 21
        7 * 4 = 28
        7 * 5 = 35
        7 * 6 = 42
        7 * 7 = 49
        7 * 8 = 56
        7 * 9 = 63
        7 * 10 = 70
         */

        ////////////////////TASK-6 SOLUTION///////////////////
        System.out.println("\n------------TASK-6------------\n");
        System.out.println("Please enter a number");
        int t6_num = scan.nextInt();
        int num = 1;

        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));
        System.out.println(t6_num + " * " + num + " = " + (t6_num * num++));

    }
}
