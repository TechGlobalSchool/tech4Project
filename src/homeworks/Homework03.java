package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        /*
        Requirement
        -Write a program that asks user to enter 2 numbers.
        -Store these data in int variables
        -First, print the numbers entered by user with proper messages as shown below
        -And, then print the sum of the given numbers by user with a proper message as shown below
        -Assume user enters below info
        number1 = 5
        number2 = 10

        Expected output:
        The number 1 entered by user is = 5
        The number 2 entered by user is = 10
        The sum of number 1 and 2 entered by user is = 15
         */

        //NOTE: Create one Scanner object and use it for all the tasks
        Scanner input = new Scanner(System.in);


        ////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n------------TASK-1------------\n");
        System.out.println("Please enter 2 numbers");
        int n1 = input.nextInt(), n2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + n1);
        System.out.println("The number 2 entered by user is = " + n2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (n1 + n2));

        /*
        Requirement
        -Write a program that asks user to enter 2 floating numbers.
        -Store these data in double variables
        -First, print the numbers entered by user with proper messages as shown below
        -And, then print the division of the given numbers by user with a proper message as shown below
        -Assume user enters below info
        number1 = 45.45
        number2 = 5

        Expected output:
        The number 1 entered by user is = 45.45
        The number 2 entered by user is = 5.0
        The division of number 1 and 2 entered by user is = 9.09
         */

        ////////////////////TASK-2 SOLUTION///////////////////
        System.out.println("\n------------TASK-2------------\n");
        /*
        PSEUDO CODE
        1. Use a scanner to read data from user
        2. Store data as given in the requirement
        3. Find division
        4. Print all as required in the task
         */
        System.out.println("Please enter 2 numbers");
        double d1 = input.nextDouble(), d2 = input.nextDouble();

        System.out.println("The number 1 entered by user is = " + d1);
        System.out.println("The number 2 entered by user is = " + d2);
        System.out.println("The division of number 1 and 2 entered by user is = " + d1 / d2);


        /*
        Requirement:
        -Write a Java program to print the result of the following operations
        NOTE: No need for using Scanner for this task
        Test Data:
        1.  -10 + 7 * 5
        2.  (72+24) % 24
        3.  10 + -3*9 / 9
        4.  5 + 18 / 3 * 3 – (6 % 3)
        Expected Output:
        1. 25
        2.  0
        3.  7
        4.  23
         */

        ////////////////////TASK-3 SOLUTION///////////////////
        System.out.println("\n------------TASK-3------------\n");

        int i1 = -10 + 7 * 5;
        System.out.println("1.\t" + i1);
        System.out.println("2.\t" + ((72 + 24) % 24));
        System.out.println("3.\t" + (10 + -3 * 9 / 9));
        System.out.println("4.\t" + (5 + 18 / 3 * 3 - (6 % 3)));

        /*
        Requirement
        -Write a program that asks user to enter 2 floating numbers.
        -Store these data in double variables
        -First, print the numbers entered by user with proper messages as shown below
        -And, then print the sum (addition), multiplication, subtraction, division and remainder of these two numbers
        -Assume user enters below info
        number1 = 24
        number2 = 10

        Expected Output:
        The sum of the given numbers is = 34.0
        The product of the given numbers is = 240.0
        The subtraction of the given numbers is = 14.0
        The division of the given numbers is = 2.4
        The remainder of the given numbers is = 4.0
         */

        ////////////////////TASK-4 SOLUTION///////////////////
        System.out.println("\n------------TASK-4------------\n");
        System.out.println("Please enter 2 numbers");
        double double1 = input.nextDouble(), double2 = input.nextDouble();

        System.out.println("The sum of the given numbers is = " + (double1 + double2));
        System.out.println("The product of the given numbers is = " + double1 * double2);
        System.out.println("The subtraction of the given numbers is = " + (double1 - double2));
        System.out.println("The division of the given numbers is = " + double1 / double2);
        System.out.println("The remainder of the given numbers is = " + double1 % double2);


        /*
        Requirement:
        -Write a Java program to print the area and perimeter of a rectangle
        -NOTE: No need for using Scanner for this task. Please hard code values as given below

        Test Data:
        Width of rectangle = 7.5
        Height of rectangle = 10.5

        area = width*height;
        perimeter = 2 * (width + height)
        perimeter = (2 * width) + (2 * height)

        Expected Output:
        The area of the rectangle = 78.75
        The perimeter of the rectangle = 36.0
         */

        ////////////////////TASK-5 SOLUTION///////////////////
        System.out.println("\n------------TASK-5------------\n");
        double widthOfTheRectangle = 7.5, heightOfTheRectangle = 10.5;
        System.out.println("The area of the rectangle = " + widthOfTheRectangle * heightOfTheRectangle);
        System.out.println("The perimeter of the rectangle = " + 2 * (widthOfTheRectangle + heightOfTheRectangle));

        /*
        Requirement:
        -Assume that an average annual rate of salary for a Software Engineer in Test is $90k.
        -Write a Java program to find how much money can a Software Engineer in Test earn in 3 years?
        NOTE: No need for using Scanner for this task. Please hard code values. Print result with a proper message as below

        Expected Output:
        A Software Engineer in Test can earn 270000.0  in 3 years.
         */

        ////////////////////TASK-6 SOLUTION///////////////////
        System.out.println("\n------------TASK-6------------\n");
        double yearlySalary = 90_000;
        int year = 3;

        System.out.println("A Software Engineer in Test can earn " + yearlySalary * year + " in " + year + " years.");
    }
}
