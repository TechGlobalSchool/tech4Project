package exercises;

import java.util.Scanner;

public class IfElseSwitchPractice {
    public static void main(String[] args) {

        /*
        write a code asks a user age and
        if the user is 16 or older print out "You can drive"
        if the user is 18 or older print out "You can work"
        if the user is 21 or older print out "You can drink"
        if the user us 25 or older print out "You can rent a car"

        input : 26
        output:
        "You can drive"
        "You can work"
        "You can drink"
        "You can rent a car"

         */

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = s.nextInt();

        if(age > 15){ //age >= 16    -->  same thing
            System.out.println("You can drive");

            if (age > 17){
                System.out.println("You can work");

                if (age >= 21){
                    System.out.println("You can drink");

                    if (age >= 25){
                        System.out.println("You can rent a car");
                    }
                }
            }

        }

    }
}
