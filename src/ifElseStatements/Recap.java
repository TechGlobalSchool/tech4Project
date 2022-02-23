package ifElseStatements;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        /*
        System.out.println("Please tell what time is it?");
        int hour = inputReader.nextInt();

        if(hour > 6 && hour < 12){ // true
            System.out.println("Good morning");
        }
        else if(hour > 17 && hour < 20){ // false
            System.out.println("Good evening");
        }
        else if(hour > 20 && hour < 24){ // false
            System.out.println("Good night");
        }
        else{
            System.out.println("Good bye!");
        }
         */



        System.out.println("Whats is your grade?");
        int grade = inputReader.nextInt();

        if (grade >= 50) {
            System.out.println("Congrats! You passed the class");
            if (grade < 60) {
                System.out.println("You passed with F");
            } else if (grade < 70) {
                System.out.println("You passed with D");
            } else if (grade < 80) {
                System.out.println("You passed with C");
            } else if (grade < 90) {
                System.out.println("You passed with B");
            } else {
                System.out.println("You passed with A");
            }
        } else { // less than 50
            System.out.println("Sorry! Next time hopefully");
        }

        System.out.println("End of the program!");
    }
}
