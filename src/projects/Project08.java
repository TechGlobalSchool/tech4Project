package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project08 {

    public static void main(String[] args) {
        String[] strs = {"foo", "", " ", "foo bar", "foo bar", "java is fun", " ruby "};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        String pass = "Andrei22*";
        String email = "a.b.m@gmm.cmmmm";

        System.out.println("TASK1 = " + countMultipleWords(strs));
        System.out.println("TASK2 = " + removeNegatives(nums));
        System.out.println("TASK3 = " + validatePassword(pass));
        System.out.println("TASK4 = " + validateEmailAddress(email));
    }

    /*
    TASK-1 - countMultipleWords() method
    •Write a method that takes a String[] array as an argument and counts 
    how many strings in the array has multiple words
    •This method will return an int which is the count of multiple words
    •NOTE: be careful about these as they are not multiple words ->"",    "   ",  
    "    abc",  "abc   "
    "foo", "", " ", "foo bar", "java is fun", " ruby "
     */

    public static int countMultipleWords(String[] s) {
        int counter = 0;
        for (String s1 : s) if (s1.trim().contains(" ")) counter++;
        return counter;
    }

    /*
    TASK-2 - removeNegatives() method
    •Write a method that takes an “ArrayList<Integer> numbers” as an
    argument and removes all negative numbers from the given list if there
    are any
    •This method will return an ArrayList with removed negatives
     */

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        Iterator<Integer> it = numbers.iterator();
        // I am not assigning next() into a variable cuz I am calling it ONCE
        while (it.hasNext()) if (it.next() < 0) it.remove();
        return numbers;
    }


    /*
    TASK-3 - validatePassword() method
    •Write a method that takes a “String password” as an argument and
    checks if the given password is valid or not
    •This method will return true if given password is valid, or false if given
    password is not valid
    •A VALID PASSWORD:
    -should have length of 8 to 16 (length of 7 or 17 should return false)
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
    char
    -should NOT have any space
     */

    public static boolean validatePassword(String password) {
        //length --> length()
        //1 digit, 1 uppercase, 1 lowercase and 1 special char --> inside a loop Character class methods for checking
        //should NOT have any space --> contains();

        int dg = 0, up = 0, lo = 0, spe = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) dg++;
            else if (Character.isUpperCase(password.charAt(i))) up++;
            else if (Character.isLowerCase(password.charAt(i))) lo++;
            else spe++;
        }

        return (password.length() >= 8 && password.length() <= 16) // --> length validation
                && (dg > 0 && up > 0 && lo > 0 && spe > 0) //--> 1 digit, 1 uppercase, 1 lowercase and 1 special char validation
                && !(password.contains(" ")); // --> space check validation
    }

    /*
    TASK-4 - validateEmailAddress() method
    •Write a method that takes a “String email” as an argument and checks if
    the given email is valid or not
    •This method will return true if given email is true, or false if given email is
    not valid
    •A VALID EMAIL:
    -should NOT have any space
    -should not have more than one “@” character
    -should be in the given format <2+chars>@<2+chars>.<2+chars>
                                    ab@gm.co        --> L = 7, lDot = 5
                                    0123456789      --> L - lDot >= 3
     */

    public static boolean validateEmailAddress(String email) {
        // +validation of . --> after the @ sign there shouldn't be more than 1 .
        // +validation of @ --> only 1 @ AND and email contains
        // +validation of first part --> (0, index of @ ) >= 2
        // validation of second part --> (index of @ + 1, last index of . ) >= 2
        // validation of first part --> (last index of . + 1) >= 2
        int cD = 0, iAt = email.indexOf("@"), lAt = email.lastIndexOf("@"), lDot = email.lastIndexOf(".");
        for (int i = lAt + 1; i < email.length(); i++) if (email.charAt(i) == '.') cD++;
        return cD == 1 && (iAt == lAt && email.contains("@")) && lAt >= 2 && lDot - lAt >= 3 && email.length() - lDot >= 3;
    }
}
