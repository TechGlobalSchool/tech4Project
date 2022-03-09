package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        TASK-1
        Requirement:
        Assume that you are given a String as below;
        String str = "SDLC is step-by-step procedure to create an application";
        Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */
        ////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n------------TASK-1------------\n");

        String str = "SDLC is step-by-step procedure to create an application";
        System.out.println("The length of the string is = " + str.length()); // 55
        System.out.println("The index of 'SDLC' is = " + str.indexOf("SDLC")); // 0
        System.out.println("The index of 'application' is = " + str.indexOf("application")); // 44





         /*
        TASK-2
        Requirement:
        Assume that you are given a String as below;
        String str = "  I know how to code with Python  ";

        •Write a program to manipulate given String and convert it to be:
        "I KNOW HOW TO CODE WITH JAVA"

        1.
        replace Python with java
        then trim and convert to uppercase


        2.
        trim and convert to uppercase
         */

        ////////////////////TASK-2 SOLUTION///////////////////
        System.out.println("\n------------TASK-2------------\n");

        String str2 = "  I know how to code with Python  ";
        System.out.println(str2.trim().toUpperCase().replace("PYTHON", "JAVA"));
        System.out.println(str2.replace("Python", "JaVa").toUpperCase().trim());
        System.out.println(str2.toUpperCase().trim().replace("PYTHON", "JAVA"));




        /*
        TASK-3
        Requirement:
        Assume that you are given a String as below;
        String str = "     SDLC has planning, design, development, testing, deployment and maintenance phases   ";
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */
        ////////////////////TASK-3 SOLUTION///////////////////
        System.out.println("\n------------TASK-3------------\n");

        String str3 = "     SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();

        //"SDLC has planning, design, development, testing, deployment and maintenance phases" -> 82 characters 89

        System.out.println("First char that is not space is = " + str3.charAt(0));
        System.out.println("Last char that is not space is = " + str3.charAt(str3.length()-1));





        /*
        TASK-4
        Requirement:
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a
        new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
         */
        ////////////////////TASK-4 SOLUTION///////////////////
        System.out.println("\n------------TASK-4------------\n");

        String s1 = " TECH ".trim().toLowerCase().replace("t", "T");
        String s2 = " glo  ".trim().replace("g", "G");
        String s3 = " BAL       ".trim().toLowerCase();

        System.out.println(s1 + s2 + s3);

        //TechGlobal

        String s4 = s1.trim().replace("ECH", "ech") + s2.trim().replace("g", "G") +
                s3.trim().toLowerCase();

        /*
        TASK-5
        Requirement:
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color

        Test data:
        green
        Expected output:
        First character is = g
        Last character is = n
        First 3 characters are = gre
        Last 3 characters are = een
         */
        ////////////////////TASK-5 SOLUTION///////////////////
        System.out.println("\n------------TASK-5------------\n");
        String color = ScannerHelper.getAStringFromUser();

        System.out.println("First char in the color is = " + color.charAt(0)); // p
        System.out.println("Last char in the color is = " + color.charAt(color.length()-1)); // e
        System.out.println("First 3 chars in the is = " + color.substring(0, 3)); // pur
        System.out.println("Last 3 chars in the is = " + color.substring(color.length()-3)); // ple


        /*
        TASK-6
        Requirement:
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence

        Test data:
        JavA is an object-oriented programming LanguAGE
        We practice today

        Expected output:
        First word is = java - we
        Last word is = language - today
         */
        ////////////////////TASK-6 SOLUTION///////////////////
        System.out.println("\n------------TASK-6------------\n");
        String sentence = ScannerHelper.getAStringFromUser();

        System.out.println("First word is = " + sentence.substring(0, sentence.indexOf(' ')).toLowerCase());
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ')+1).toLowerCase());


        /*
        TASK-7
        Requirement:
        Write a program that asks user to enter a full sentence
        Then, check if given sentence contains $ character
        If it contains $ character, then find the index of the $ character and print a proper message for the found index

        Test data 1:
        I saved $100 to buy new airpods

        Expected output 1:
        This sentence contains $ character
        $ character’s index is = 8

        Test data 2:
        I’ll become a Software Engineer in Test

        Expected output 2:
        This sentence does not contain $ character
         */
        ////////////////////TASK-7 SOLUTION///////////////////
        System.out.println("\n------------TASK-7------------\n");
        String s7 = ScannerHelper.getAStringFromUser();

        if(s7.contains("$")){ //
            System.out.println("This sentence contains $ character" + "\n$ character’s index is = " + s7.indexOf('$'));
        }
        else{
            System.out.println("This sentence does not contain $ character");
        }

        System.out.println(s7.contains("$") ?
                "This sentence contains $ character" + "\n$ character’s index is = " + s7.indexOf('$') :
                "This sentence does not contain $ character");
    }
}
