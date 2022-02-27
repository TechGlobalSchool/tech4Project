package homeworks;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        Scanner

        next()              -> ONLY 1 word
        nextLine()
        nextInt()
        nextDouble()
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scan.nextInt();

        System.out.println("The age entered is = " + age);

        System.out.println("Please enter your name");
        String name = scan.next();
        System.out.println("The name entered is = " + name);

        System.out.println("Enter an address!");
        String address = scan.nextLine(); //Full line-row
        System.out.println("The address entered is = " + address); // 2860 S River Rd

    }
}
