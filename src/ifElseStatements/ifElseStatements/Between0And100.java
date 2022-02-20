package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String[] args) {
        /*
        Write a program asks user to put number and checks if the number
        is between 0 and 100 (inclusive)

        if it is true print out "It is in between 0 and 100"

        else "it is not in between 0 and 100"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Put a number below:");
        int num = scan.nextInt();

        // AND doesn't like false, OR likes true

//        boolean isNumBiggerThan0 = num >= 0;
//        boolean isNumSmallerThan100 = num <= 100;
//
//        boolean inBetween0And100 = num >= 0 && num <= 100;

        if(num >= 0 && num <= 100){
            System.out.println("It is in between 0 and 100");
        }else{
            System.out.println("It is not in between 0 and 100");
        }


    }
}
