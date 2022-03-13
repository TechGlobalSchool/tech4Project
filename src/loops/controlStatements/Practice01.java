package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers starting from biggest to smallest
        (given numbers are included)
        HOWEVER, do not print any number less than 10



        5 9   -> 9 8 7 6 5

        8 4   -> 8 7 6 5 4

        1. Ask user to enter 2 numbers
        2. Store number in int variables
        3. Compare numbers and find biggest and smallest
        4. Start a loop with below info
            StartPoint : max number
            EndPoint   : min number
            Update     : decrement
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = scan.nextInt();

        System.out.println("Please enter the second number");
        int num2 = scan.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        String s = "";
        for (int i = max; i >= min; i--) {
            if(i < 10) break;
            s += i + " - ";
        }

        System.out.println(s.substring(0, s.length()-3)); // 12 - 11 - 10
        /*
        if(max >= 10){
            for (int i = max; i >= min; i--) {
                System.out.println(i);
                if(i == 10) break;
            }
        }

         */

        // 17 16 15 ---- 10

    }
}
