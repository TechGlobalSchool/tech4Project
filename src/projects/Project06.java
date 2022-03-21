package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("\nTASK2\n");

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = s.next();
        String rWord = "";

        //civic
        //01234
        if (!word.isEmpty()){
            // 4, 3, 2, 1, 0
            // 1st way
            for (int i = word.length() - 1; i >= 0; i--) rWord += word.charAt(i);
            // 2nd way
            //for (int i = 0; i < word.length(); i++) rWord += word.charAt(word.length() - 1 - i);

            if (word.equals(rWord)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");

        }else{
            System.out.println("This word does not have 1 or more characters");
        }

        /*
        TASK-4
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the
        numbers divided by 2, “Bar” for the numbers divided by 3 and “FooBar” for
        the numbers divided by both 2 and 3.

        Test data:
        6

        Expected output:
        1
        Foo
        Bar
        Foo
        5
        FooBar
         */
        System.out.println("\nTASK4\n");

        /*
        1. scanner +
        2. ask a number and store it +
        3. cover 4 conditions inside fori loop
         */

        System.out.println("Please enter a number");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 3 == 0) System.out.println("Bar");
            else if (i % 2 ==0) System.out.println("Foo");
            else System.out.println(i);
        }

    }
}
