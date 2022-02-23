package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {

        /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
        */


        int n = (int)(Math.random() * 101) -50;

        // positive check
        // more than 25
        // number is -7
        // number is 7
        // negative *
        // less than -25 *

        /*
        positive                --> +10
            more than 25        --> +10
            number is 7         --> +100
        negative                --> 0
            less than -25       --> 0
            number is -34        --> +10
        zero
         */

        int point = 0;

        // if they CANNOT be present at the SAME time use if elses (use if elseif else)

        if (n > 0){
            //positive
            point += 10;        //  adding 10 points
            if (n > 25){
                point += 10;    //  adding 10 points
            }else if (n ==  7){
                point += 100;   //  adding 100 points
            }

        }else if(n < 0){
            //negative
            if (n < -25){
                point += 0;
            }else if(n == - 7){
                point += 10;
            }

        }else{
            //zero
            point += 0;

        }

        System.out.println(n);
        System.out.println("Points = " + point);

    }
}
