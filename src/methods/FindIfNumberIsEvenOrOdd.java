package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    /*
    Generate a random number between 17 and 33 (both included)
    First, print the random number generated with a message "The number generated is = "
    Print "The number generated is EVEN" if the number is even
    Print "The number generated is ODD" if the number is odd
     */
    public static void main(String[] args) {

        int r1 = RandomNumberGenerator.getRandomNumber(17, 33);

        if(MathHelper.isOdd(r1)){
            System.out.println("The number generated is ODD");
        }
        else{
            System.out.println("The number generated is EVEN");
        }

        System.out.println("End of the program!");
    }
}
