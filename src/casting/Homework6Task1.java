package casting;

public class Homework6Task1 {
    public static void main(String[] args) {
        /*
        Requirement:
        Convert given Strings below to int data types and find
        their sum, product, division, subtraction and
        remainder.
        NOTE: Scanner is not needed for this task!
        String s1 = “5”, s2 = “10”;
        Expected results:
        -Sum of 5 and 10 is = 15
        -Product of 5 and 10 is = 50
        -Division of 5 and 10 is = 0
        -Subtraction of 5 and 10 is = -5
        -Remainder of 5 and 10 is = 5
        NOTE: expected results should exactly match!!!
         */

        String s1 = "5", s2 = "10"; // "5" and "10" as texts

        int s1NumValue = Integer.parseInt(s1), s2NumValue = Integer.parseInt(s2); // 5 and 10 as numbers

        System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (s1NumValue + s2NumValue));
        System.out.println("Product of " + s1 + " and " + s2 + " is = " + (s1NumValue * s2NumValue));
        System.out.println("Division of " + s1 + " and " + s2 + " is = " + (s1NumValue / s2NumValue));
        System.out.println("Subtraction of " + s1 + " and " + s2 + " is = " + (s1NumValue - s2NumValue));
        System.out.println("Remainder of " + s1 + " and " + s2 + " is = " + (s1NumValue % s2NumValue));

    }
}
