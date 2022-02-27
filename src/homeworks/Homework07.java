package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        /*
        Write a program that generates 4 random numbers
        between 0 and 10 (0 and 10 are also included).
        -Store numbers in proper variables and print them first
        -Print each number’s absolute difference with 5
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        NOTE: Assume random numbers came as 2, 5, 3, 0
        respectively.
        EXPECTED RESULT:
        Number 1 = 2
        Number 2 = 5
        Number 3 = 3
        Number 4 = 0
        Absolute difference of 2 with 5 is = 3
        Absolute difference of 5 with 5 is = 0
        Absolute difference of 3 with 5 is = 2
        Absolute difference of 0 with 5 is = 5
        Greatest number is = 5
        Smallest number is = 0
         */

        ////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n------------TASK-1------------\n");
        int t1_num1 = (int)(Math.random() * 11);
        int t1_num2 = (int)(Math.random() * 11);
        int t1_num3 = (int)(Math.random() * 11);
        int t1_num4 = (int)(Math.random() * 11);

        int i = 1;
        System.out.println("Number " + i++ + " = " + t1_num1);
        System.out.println("Number " + i++ + " = " + t1_num2);
        System.out.println("Number " + i++ + " = " + t1_num3);
        System.out.println("Number " + i + " = " + t1_num4);

        int five = 5;
        System.out.println("Absolute difference of " + t1_num1 + " with  " + five + " is = " + Math.abs(five - t1_num1));
        System.out.println("Absolute difference of " + t1_num2 + " with  " + five + " is = " + Math.abs(five - t1_num2));
        System.out.println("Absolute difference of " + t1_num3 + " with  " + five + " is = " + Math.abs(five - t1_num3));
        System.out.println("Absolute difference of " + t1_num4 + " with  " + five + " is = " + Math.abs(five - t1_num4));

        System.out.println("Greatest number is = " + Math.max(Math.max(t1_num1, t1_num2), Math.max(t1_num3, t1_num4)));
        System.out.println("Smallest number is = " + Math.min(Math.min(t1_num1, t1_num2), Math.min(t1_num3, t1_num4)));


        /*
        Write a program that generates 8 random int numbers between -50 and 50 (-50 and 50 are included)
        -Store numbers in proper variables and print them first
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        -Find average of all 8 numbers and print result with a proper message
        -Find the absolute difference between smallest and greatest and print result with
        a proper message
        -Print true if 3rd number is positive, false otherwise with a proper message
        -Print true if 5th number is negative, false otherwise with a proper message
        -Print true if any of the numbers is zero, false otherwise with a proper message
        NOTE: Assume random numbers came as -10, 5, -37, 13, 50, -39,
        17, 3 respectively.
        NOTE: Your result will be different based on the random numbers
        you will get.

        EXPECTED RESULT:
        Number 1 = -10
        Number 2 = 5
        Number 3 = -37
        Number 4 = 13
        Number 5 = 50
        Number 6 = -39
        Number 7 = 17
        Number 8 = 3
        Greatest number is = 50
        Smallest number is = -39
        Average of 8 numbers is = 1
        Absolute difference between smallest and greatest is = 89
        3rd number is positive = false
        5th number is negative = false
        There is at least one zero among those numbers is = false
         */

        ////////////////////TASK-2 SOLUTION///////////////////
        System.out.println("\n------------TASK-2------------\n");
        int t2_num1 = (int)(Math.random() * 101) - 50;
        int t2_num2 = (int)(Math.random() * 101) - 50;
        int t2_num3 = (int)(Math.random() * 101) - 50;
        int t2_num4 = (int)(Math.random() * 101) - 50;
        int t2_num5 = (int)(Math.random() * 101) - 50;
        int t2_num6 = (int)(Math.random() * 101) - 50;
        int t2_num7 = (int)(Math.random() * 101) - 50;
        int t2_num8 = (int)(Math.random() * 101) - 50;

        int j = 1;
        System.out.println("Number " + j++ + " = " + t2_num1);
        System.out.println("Number " + j++ + " = " + t2_num2);
        System.out.println("Number " + j++ + " = " + t2_num3);
        System.out.println("Number " + j++ + " = " + t2_num4);
        System.out.println("Number " + j++ + " = " + t2_num5);
        System.out.println("Number " + j++ + " = " + t2_num6);
        System.out.println("Number " + j++ + " = " + t2_num7);
        System.out.println("Number " + j + " = " + t2_num8);

        int maxOf8 = Math.max(Math.max(Math.max(t2_num1, t2_num2), Math.max(t2_num3, t2_num4)), Math.max(Math.max(t2_num5, t2_num6), Math.max(t2_num7, t2_num8)));
        int minOf8 = Math.min(Math.min(Math.min(t2_num1, t2_num2), Math.min(t2_num3, t2_num4)), Math.min(Math.min(t2_num5, t2_num6), Math.min(t2_num7, t2_num8)));

        System.out.println("Greatest number is = " + maxOf8);
        System.out.println("Smallest number is = " + minOf8);
        System.out.println("Average of 8 numbers is = " + (t2_num1 + t2_num2 + t2_num3 + t2_num4 + t2_num5 + t2_num6 + t2_num7 + t2_num8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " + (maxOf8 - minOf8));

        if(t2_num3 > 0){
            System.out.println("3rd number is positive = " + true);
        }
        else{
            System.out.println("3rd number is positive = " + false);
        }

        //Instead of above if else, we could use below statement
        System.out.println("3rd number is positive = " + (t2_num3 > 0));


        if(t2_num5 < 0){
            System.out.println("5th number is negative = " + true);
        }
        else{
            System.out.println("5th number is negative = " + false);
        }

        //Instead of above if else, we could use below statement
        System.out.println("5th number is negative = " + (t2_num5 < 0));

        if(t2_num1 == 0 || t2_num2 == 0 || t2_num3 == 0 || t2_num4 == 0 || t2_num5 == 0 || t2_num6 == 0 || t2_num7 == 0 || t2_num8 == 0){
            System.out.println("There is at least one zero among those numbers is = " + true);
        }
        else{
            System.out.println("There is at least one zero among those numbers is = " + false);
        }

        //Instead of above if else, we could use below statement
        System.out.println("There is at least one zero among those numbers is = " +
                (t2_num1 == 0 || t2_num2 == 0 || t2_num3 == 0 || t2_num4 == 0 || t2_num5 == 0 || t2_num6 == 0 || t2_num7 == 0 || t2_num8 == 0));



        /*
        Write a program that asks user to enter 7 numbers between 0 and 50 (0 and 50 are also included)
        -Store numbers in proper variables and print them first
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        -Find average of all 7 numbers and print result with a proper message
        -Print true if first number is greater than or equal to 10, false otherwise with a proper message
        -Print true if last number is less than or equal to 40, false otherwise with a proper message
        -Print true if both first and last numbers are greater than 25, false otherwise with a proper message
        -Print true if any of the numbers is zero or 50, false otherwise with a proper message
        -Print true if there is no number between 40 and 50 (40 and 50 are included), false otherwise with a
        proper message
        NOTE: Assume random numbers came as 4, 13, 23, 7, 0, 28, 49 respectively.
        NOTE: Your result will be different based on the random numbers you will get.
        EXPECTED RESULT:
        Number 1 = 4
        Number 2 = 13
        Number 3 = 23
        Number 4 = 7
        Number 5 = 0
        Number 6 = 28
        Number 7 = 49
        Greatest number is = 49
        Smallest number is = 0
        Average of 7 numbers is = 17
        First number is greater than or equal to 10 = false
        Last number is less than or equal to 40 = true
        Both first and last numbers are greater than 25 = false
        At least one of those numbers is 0 or 50  = true
        There is no number between 40 and 50 = false
         */

        ////////////////////TASK-3 SOLUTION///////////////////
        System.out.println("\n------------TASK-3------------\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 7 numbers that are between 0 and 50");
        int t3_num1 = scan.nextInt();
        int t3_num2 = scan.nextInt();
        int t3_num3 = scan.nextInt();
        int t3_num4 = scan.nextInt();
        int t3_num5 = scan.nextInt();
        int t3_num6 = scan.nextInt();
        int t3_num7 = scan.nextInt();

        if(t3_num1 > 25 && t3_num7 > 25){
            System.out.println("Both first and last numbers are greater than 25 = " + true);
        }else{
            System.out.println("Both first and last numbers are greater than 25 = " + false);
        }

        //Instead of above if else, we could use below statement
        System.out.println("Both first and last numbers are greater than 25 = " + (t3_num1 > 25 && t3_num7 > 25));

//        if(t3_num1 == 0 || t3_num1 == 50 || t3_num2 == 0 || t3_num2 == 50 || t3_num3 == 0 || t3_num3 == 50 ||
//                t3_num4 == 0 || t3_num4 == 50 || t3_num5 == 0 || t3_num5 == 50 || t3_num6 == 0 || t3_num6 == 50 ||
//                t3_num7 == 0 || t3_num7 == 50){
//            System.out.println("At least one of those numbers is 0 or 50  = " + true);
//        }
//        else{
//            System.out.println("At least one of those numbers is 0 or 50  = " + false);
//        }

        //Instead of above if else, we could use below statement
        System.out.println("At least one of those numbers is 0 or 50  = " + (t3_num1 == 0 || t3_num1 == 50 || t3_num2 == 0 || t3_num2 == 50 || t3_num3 == 0 || t3_num3 == 50 ||
                t3_num4 == 0 || t3_num4 == 50 || t3_num5 == 0 || t3_num5 == 50 || t3_num6 == 0 || t3_num6 == 50 ||
                t3_num7 == 0 || t3_num7 == 50));

        if(t3_num1 < 40 && t3_num2 < 40 && t3_num3 < 40 && t3_num4 < 40 && t3_num5 < 40 && t3_num6 < 40 && t3_num7 < 40){
            System.out.println("There is no number between 40 and 50 = " + true);
        }
        else{
            System.out.println("There is no number between 40 and 50 = " + false);
        }

        if(t3_num1 >= 40 || t3_num2 >= 40 || t3_num3 >= 40 || t3_num4 >= 40 || t3_num5 >= 40 || t3_num6 >= 40 || t3_num7 >= 40){
            System.out.println("There is no number between 40 and 50 = " + false);
        }
        else{
            System.out.println("There is no number between 40 and 50 = " + true);
        }
    }
}
