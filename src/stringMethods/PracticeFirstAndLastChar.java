package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirstAndLastChar {
    /*
    Write a program that asks user to enter their name
    Print first char of the name with message "First character in the name is = "
    Print last char of the name with message "Last character in the name is = "

    Kaly
    charAt(0)
    charAt(3) -> name.length()-1

    Taylor
    charAt(0)
    charAt(5) -> name.length()-1

    Guluzar
    charAt(5) -> name.length()-1

    NOTE:
    First character of String is always -> str.charAt(0)
    Last character of String is always -> str.charAt(str.length()-1)
     */

    public static void main(String[] args) {

        String name = ScannerHelper.getANameFromUser();

        System.out.println("First character in the name is = " + name.charAt(0)); // First char
        System.out.println("Last character in the name is = " + name.charAt(name.length()-1)); // Last char

    }
}
