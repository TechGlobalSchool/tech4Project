package exercises;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {


        /*
        (expression) ? action for true : action for false;
         */

        /*
        Write a program that asks user their height
        if their height is lower than 5 feet print out "You can't go to roller coaster"
        else print out "You are tall"
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your height");

//        int height = s.nextInt();
//
//        String printOut = (s.nextInt() > 5) ? "You are tall" : "You can't go to roller coaster";

        System.out.println((s.nextInt() > 5) ? "You are tall" : "You can't go to roller coaster");


        /*
        Write a program that asks user their balance
        if their balance is lower than 50$ print out "You are poor"
        else print out "You are not poor"
         */

        System.out.println("Enter your balance");
        System.out.println((s.nextDouble() >= 50.0) ? "You are not poor" : "You are poor");
    }
}
