package stringMethods;

import utilities.ScannerHelper;

public class SwapLast4WithFirst4 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print the modified String

        Test data:
        TechGlobal   -> Tech + Gl + obal   -> obalGlTech

        Expected output:
        obalGlTech

        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String’s length is
        less than 8, then print message “This String does not have 8 characters”
         */

        String word = ScannerHelper.getAStringFromUser(); //ab

        if(word.length() < 8){
            System.out.println("This String does not have 8 characters");
        }
        else{
            String first4 = word.substring(0, 4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4, word.length()-4);
            System.out.println(last4 + middle + first4);
        }

        //Above if-else code can also be written as below
        /*
        if(word.length() >= 8){
            String first4 = word.substring(0, 4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4, word.length()-4);
            System.out.println(last4 + middle + first4);
        }
        else{
            System.out.println("This String does not have 8 characters");
        }
         */
    }
}
