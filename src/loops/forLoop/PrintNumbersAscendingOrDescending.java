package loops.forLoop;

import java.util.Random;

public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {
        /*
        Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), Then print all numbers between 2 random numbers that
        cannot be divided by 5 in ascending order.

        Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;

        Expected output:
        4 – 6 – 7 – 8 – 9 – 11 - 12

        Expected output: for 5 and 5

         */


        //How to generate random numbers
        Random random = new Random();
        int num1 = random.nextInt(26); // 0-25
        int num2 = random.nextInt(26); // 0-25


        System.out.println("Random number 1 = " + num1);
        System.out.println("Random number 2 = " + num2);

        System.out.println("\nNumbers printed in ascending order\n");

        /*
        FIRST WAY

        if(num1 > num2){
            for (int i = num2; i <= num1; i++) {
                if(i % 5 != 0) System.out.println(i);
            }
        }
        else{
            for (int i = num1; i <= num2; i++) {
                if(i % 5 != 0) System.out.println(i);
            }
        }
        */


        /*
        SECOND WAY
        for(int i = minNumber; i <= maxNumber; i++){
            if(i % 5 != 0) System.out.println(i);
        }
         */

        String s = "";

        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if(i % 5 != 0) s += i + " - ";
        }

        if(!s.isEmpty()) System.out.println(s.substring(0, s.length()-3));
        else System.out.println(s);

    }
}
