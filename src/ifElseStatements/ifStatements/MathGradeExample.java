package ifElseStatements.ifStatements;

import java.util.Scanner;

public class MathGradeExample {
    public static void main(String[] args) {
        /*
        Assume David took a math exam and the passing grade for the exam was 60.

        Write a program that asks David what his grade is. If David’s grade is greater
        than or equal to 60, then print message “Awesome! You have passed the math class!”.

        EXAMPLE PROGRAM 1
        Program: Hey David! Please enter your math grade?
        User: 60

        Program: Awesome! You have passed the math class!

        EXAMPLE PROGRAM 2
        Program: Hey David! Please enter your math grade?
        User: 59

        Program:

         */

        /*
        1. Create the scanner
        2. Ask the question
        3. Store the grade
        4. If statement with proper action
         */

        Scanner ask = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");
        int grade = ask.nextInt();

        if(grade >= 60){
            System.out.println("Awesome! You have passed the math class!");
        } else {
            System.out.println("Go back to school!");
        }
    }
}
