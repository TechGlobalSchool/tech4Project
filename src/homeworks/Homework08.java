package homeworks;

import utilities.MyMethods;
import utilities.RandomNumberGenerator;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\nTASK1\n");
        /*
        Requirement:
        Write a program that generates a
        random number between 0 and 50
        (both 0 and 50 are included)
        Print true if number is in between 10
        and 25 (10 and 25 included)
        Print false otherwise
         */

        int r = RandomNumberGenerator.getRandomNumber(0, 50);
        System.out.println(r);



        System.out.println(r >= 10 && r <= 25);
        MyMethods.isNumberBetween10And25(r); // with method

        //print out "r is in between 10 and 25(included)"
        // else "r is NOT in between 10 and 25(included)"

        if (r >= 10 && r <= 25) {
            System.out.println("r is in between 10 and 25(included)");
        } else {
            System.out.println("r is NOT in between 10 and 25(included)");
        }

        System.out.println((r >= 10 && r <= 25)
                ? "r is in between 10 and 25(included)"
                : "r is NOT in between 10 and 25(included)");

        System.out.println("\nTASK2\n");
        /*
        Requirement:
        Write a program that generates a random number
        between 1 and 100 (both 1 and 100 are included)
        Find which quarter and half is number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        1st half is 1-50
        2nd half is 51-100
        Test data:
        34
        Expected result:
        34 is in the 1st half
        34 is in the 2nd quarter
         */

        int r2 = RandomNumberGenerator.getRandomNumber(1, 100);

        if (r2 <= 50){ // 1st half is 1-50
            System.out.println(r2 + " is in the 1st half");

            if (r2 <= 25){  //1st quarter is 1-25
                System.out.println(r2 + " is in the 1st quarter");
            }else{          //2nd quarter is 26-50
                System.out.println(r2 + " is in the 2nd quarter");
            }

        }else{          // 2nd half is 51-100
            System.out.println(r2 + " is in the 2nd half");

            if (r2 <= 75){ // 3rd quarter is 51-75
                System.out.println(r2 + " is in the 3rd quarter");
            }else{          //4th quarter is 76-100
                System.out.println(r2 + " is in the 4th quarter");
            }

        }




        System.out.println("\nTASK3\n");

        /*
        Requirement:
        Write a program that asks user to enter 5 numbers 
        between 1 to 10 (1 and 10 are included)
        They will get some points based on numbers they 
        entered. So, their points will be calculated as below
        1st  number will be multiplied by 5 and added as points
        2nd number will be multiplied by 4 and added as points
        3rd number will be multiplied by 3 and added as points
        4th number will be multiplied by 2 and added as points
        5th number will be multiplied by 1 and added as points
        If user enters any number that is not in the range, 
        then user will not get any points from that number
        
        Test data:
        3 7 2 1 8
        Expected result:
        59
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter 5 numbers");
        int n1 = s.nextInt(), n2 = s.nextInt(), n3 = s.nextInt(), n4 = s.nextInt(), n5 = s.nextInt();

        int points = 0;

        if (n1 >= 1 && n1 <= 10) {
            points += n1 * 5;
        }

        if (n2 >= 1 && n2 <= 10) {
            points += n2 * 4;
        }

        if (n3 >= 1 && n3 <= 10) {
            points += n3 * 3;
        }

        if (n4 >= 1 && n4 <= 10) {
            points += n4 * 2;
        }

        if (n5 >= 1 && n5 <= 10) {
            points += n5;
        }

        System.out.println(points);


        //DENIZ'S SOLUTION
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers between 1 and 10:");

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(),
                num4 = input.nextInt(), num5 = input.nextInt();
        if (num1 >= 1 && num1 <= 10) {
            num1 *= 5;
        } else num1 = 0;
        if (num2 >= 1 && num2 <= 10) {
            num2 *= 4;
        } else num2 = 0;
        if (num3 >= 1 && num3 <= 10) {
            num3 *= 3;
        } else num3 = 0;
        if (num4 >= 1 && num4 <= 10) {
            num4 *= 2;
        } else num4 = 0;

        if (num5 < 1 || num5 > 10) {
            num5 = 0;
        }

        System.out.println(num1 + num2 + num3 + num4 + num5);


    }
}
