package ifElseStatements.switchStatements;

import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {
        /*
        Write a program that ask user to enter which day it is (1 to 5)
        Based on the answer print what color will be selected

        1 Monday -> Blue
        2 Tuesday -> Red
        3 Wednesday -> Purple
        4 Thursday -> Yellow
        5 Friday -> Orange
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter which day it is (1 to 5)");
        int day = input.nextInt();

        //1st way - using if - else if - else if - else statements

        if(day == 1) System.out.println("Blue");
        else if(day == 2) System.out.println("Red");
        else if(day == 3) System.out.println("Purple");
        else if(day == 4) System.out.println("Yellow");
        else if(day == 5) System.out.println("Orange");
        else if(day == 6 || day == 7) System.out.println("It is weekend!");
        else System.out.println("This is not representing any day!");


        //2nd way - switch cases

        switch (day){ //1
            case 1:
                System.out.println("Blue");
                break;
            case 2:
                System.out.println("Red");
                break;
            case 3:
                System.out.println("Purple");
                break;
            case 4:
                System.out.println("Yellow");
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("Orange");
                break;
            case 6:
            case 7:
                System.out.println("It is weekend!");
                break;
            default:
                System.out.println("This is not representing any day!");
        }

        System.out.println("End of the program!");

    }
}
