package methods;

import utilities.MyMethods;

public class TestingMyMethods {
    public static void main(String[] args) {

        int num1 = 2, num2 = 6, num3 = 3, num4 = 9;

        // write a program which is going to print the max of 4 numbers
        System.out.println(Math.max(Math.max(Math.max(num1, num2), num3), num4));

        // Same thing with the print out method
        MyMethods.printMaxOf4(num1, num2, num3, num4);

        // Same thing with the return method
        System.out.println(MyMethods.findMaxOf4(num1, num2, num3, num4));


        // write a program which is finding the abs difference between max and num1
        Math.abs(Math.max(Math.max(Math.max(num1, num2), num3), num4) - num1); // first way

        Math.abs(MyMethods.findMaxOf4(num1, num2, num3, num4) - num1);          // second way
    }
}
