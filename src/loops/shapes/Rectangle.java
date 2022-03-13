package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle

        * * * * * *
        *         *
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *


         */

        System.out.println("* * * * * *"); //if (i == 1 || i == 8)
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");

        for (int i = 1; i <= 25; i++) {
            if (i == 1 || i == 25) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }
    }
}
