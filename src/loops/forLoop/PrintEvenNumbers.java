package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from bt 0 to 10 (0 and 10 are included)

        Expected output:
        0
        2
        4
        6
        8
        10


        start point : 0
        end point   : 10
        update      : increment
         */

        System.out.println("\n-------1st-way--------\n");
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0) System.out.println(i);
        }


        System.out.println("\n-------2nd-way--------\n");
        for(int i = 0; i <= 10; i++){
            if(MathHelper.isEven(i)) System.out.println(i);
        }


        System.out.println("\n-------3rd-way--------\n");
        for(int i = 0; i <= 10; i += 2){ // be careful with start point
            System.out.println(i);
        }


        System.out.println("\n-------4th-way--------\n");
        for(int i = 0; i <= 10; i++){
            System.out.println(i++);
        }

    }
}
