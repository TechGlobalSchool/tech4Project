package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        /*
        Find the min and max of given 3 numbers, write
        down the Pseudo code and print min and max with
        proper messages.


        NOTE: Declare and Assign all of them in one single line
        x = 4, y = 67, z = -54
         */

//        int x = 4, y = 67, z = -54;
//
//        Math.max(x, y); // 67 1st step
//

        System.out.println("Max of every number is = " +
                Math.max(Math.max(4, 67), -54)); // 67, -54

        System.out.println("Min of every number is = " +
                Math.min(
                        Math.min(4, 67), -54)
         );

        /*
        Write a program which is going to print the max of given 3 numbers
        4, 56, 23
         */

        System.out.println("Max of given 3 numbers are = " + Math.max(23, Math.max(4, 56)));

        /*
        Write a program which is going to ask 4 NUMBERS, print the max of retrieved 4 numbers.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 4 numbers:");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();

        System.out.println("The biggest number you entered is = " +
                Math.max(Math.max(num1, num2), Math.max(num3, num4))); // getting the max of 4 numbers

        System.out.println("The smallest number you entered is = " +
                Math.min(Math.min(num1, num2), Math.min(num3, num4)));

    }
}
