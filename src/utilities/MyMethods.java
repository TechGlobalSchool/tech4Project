package utilities;

public class MyMethods {

    // Write a method which going to find the max of 4 int numbers and prints it out ONLY
    public static void printMaxOf4(int n1, int n2, int n3, int n4) {
        System.out.println(Math.max(Math.max(Math.max(n1, n2), n3), n4));
    }

    // Write a method which going to find the max of 4 int numbers and RETURNS it
    public static int findMaxOf4(int n1, int n2, int n3, int n4) {
        return Math.max(Math.max(Math.max(n1, n2), n3), n4);
    }

    /*
    Requirement:
    Write a program that generates a
    random number between 0 and 50
    (both 0 and 50 are included)
    Print true if number is in between 10
    and 25 (10 and 25 included)
    Print false otherwise
     */

    public static void isNumberBetween10And25(int num) {
        System.out.println(num >= 10 && num <= 25);
    }

    /*
        Requirement:
        Write a program that generates a random number
        between 1 and 100 (both 1 and 100 are included)
        Find which quarter and half is number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        1st half is 1-50
        2nd half is 51-100
        Test data:
        34
        Expected result:
        34 is in the 1st half
        34 is in the 2nd quarter
         */

    public static void printHalfAndQuarter(int n){

        if (n <= 50){
            System.out.println(n + " is in the 1st half");

            if (n <= 25){
                System.out.println(n + " is in the 1st quarter");
            }else{
                System.out.println(n + " is in the 2nd quarter");
            }
        }else {
            System.out.println(n + " is in the 2nd half");

            if (n <= 75){
                System.out.println(n + " is in the 3rd quarter");
            }else{
                System.out.println(n + " is in the 4th quarter");
            }

        }
    }
}
