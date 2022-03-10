package homeworks;

import sun.security.rsa.RSAUtil;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        /*
        TASK-1
        Requirement:
        Write a program that asks user to enter their names
        1. Print out the length of name
        2. Find the first character in the name and print out that
        3. Find the last character in the name and print out that
        4. Find the first 3 characters in the name and print out those
        5. Find the last 3 characters in the name and print out those
        6. Check if name starts with character A (or a) or not and print messages below
        If name starts with A or a, print “You are in the club!”
        If name does not start with A or a, print “Sorry, you are not in the club”

        Test Data:
        David

        Expected Output:
        The length of the name is = 5
        The first character in the name is = D
        The last character in the name is = d
        The first 3 characters in the name are = Dav
        The last 3 characters in the name are = vid
        Sorry, you are not in the club
         */
        ////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n------------TASK-1------------\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("The length of the name is = " + name.length());
        if(!name.isEmpty()){ //name.length() > 0
            System.out.println("The first character in the name is = " + name.charAt(0));
            System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        }

        if(name.length() >= 3){ // name.length() > 2
            System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
            System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
        }

        /*
        HOW TO FIND IF NAME STARTS WITH LOWERCASE OR UPPERCASE A
        1. name.startsWith("A") || name.startsWith("a")
        2. name.toLowerCase().startsWith("a")
        3. name.toUpperCase().startsWith("A")
        4. name.charAt(0) == 'A' || name.charAt(0) == 'a'
        5. name.charAt(0) == 65 || name.charAt(0) == 97
        6. name.toLowerCase().charAt(0) == 'a'
        7. name.toLowerCase().charAt(0) == 97
        8. name.toUpperCase().charAt(0) == 'A'
        9. name.toUpperCase().charAt(0) == 65
         */

        if(!name.isEmpty()){
            if(name.toUpperCase().charAt(0) == 'A'){
                System.out.println("You are in the club");
            }
            else{
                System.out.println("Sorry, you are not in the club");
            }
        }
        else{
            System.out.println("The name is required!");
        }



        /*
        TASK-2
        Requirement:
        Write a program that asks user to enter their full address
        Check if city is Chicago (or chicago) in the address
        If city is Chicago, then print “You are in the club”
        If city is Des Plaines, then print “You are welcome to join to the club”
        If city is any other city, then print “Sorry, you will never be in the club”

        Test Data 1:
        2860 S River Rd Suite 350, Des Plaines, IL 60018

        Expected Output 1:
        You are welcome to join the club


        Test Data 2:
        3535 Abc St, Chicago, IL 12345

        Expected Output 2:
        You are in the club
         */
        ////////////////////TASK-2 SOLUTION///////////////////
        System.out.println("\n------------TASK-2------------\n");
        System.out.println("Please enter the address");
        String address = scanner.nextLine();

        if(address.isEmpty()){
            System.out.println("The address is required!");
        }
        else{
            if(address.toLowerCase().contains("chicago")){
                System.out.println("You are in the club");
            }
            else if(address.toUpperCase().contains("DES PLAINES")){
                System.out.println("You are welcome to join the club");
            }
            else{
                System.out.println("Sorry, you will never be in the club");
            }
        }




        /*
        TASK-3
        Requirement:
        Write a program that asks user to enter their colors, at least 4 colors
        Check If those colors contains “red” and “green”
        If “green” is listed in favorite colors, then print “Green is in the list”
        If “red” is listed in favorite colors, then print “Red is in the list”
        If both “green” and “red” are listed in favorite colors, then print “Green and red are in the list”
        If both “green” and “red” are not listed in favorite colors, then print “Green and red are not in the list”
         */
        ////////////////////TASK-3 SOLUTION///////////////////
        System.out.println("\n------------TASK-3------------\n");
        System.out.println("Hey user! Please enter 4 colors");
        String colors = scanner.nextLine().toLowerCase();

        if(!colors.isEmpty()){
            //Check if it has green or red or both
            if(colors.contains("red") && colors.contains("green")){
                System.out.println("Green and red are in the list");
            }
            else if(!colors.contains("red") || !colors.contains("green")){
                System.out.println("Green and red are not in the list");
            }
            else if(colors.contains("green")){
                System.out.println("Green is in the list");
            }
            else{
                System.out.println("Red is in the list");
            }
        }
        else{
            System.out.println("Well, you did not enter some colors");
        }






        /*
        TASK-4
        Requirement:
        Assume that you are given below String
        String str = "   Java is FUN   ";
        Create 3 new Strings and assign each word from str to those new Strings
        Finally print the results as below

        Expected output:
        The first word in the str is = java
        The second word in the str is = is
        The third word in the str is = fun

        NOTE:
        Make sure that you eliminate white spaces at the beginning and at the end of words in the str.
        Make sure that you converted all words to be in lower case in your results
         */
        ////////////////////TASK-4 SOLUTION///////////////////
        System.out.println("\n------------TASK-4------------\n");

        String str = "   Java is FUN   ";

        str = str.toLowerCase().trim(); // "java is fun"

        String s1 = str.substring(0, str.indexOf(' '));
        String s2 = str.substring(str.indexOf(' ')+1, str.lastIndexOf(' '));
        String s3 = str.substring(str.lastIndexOf(' ')+1);

        System.out.println("The first word in the str is = " + s1);
        System.out.println("The second word in the str is = " + s2);
        System.out.println("The third word in the str is = " + s3);
    }
}
