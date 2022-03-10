package loops.forLoop;

public class PrintNumbersDivisibleBy5 {
    /*
    Write a Java program to check numbers from 1 to 50 (50 is included) and print all the numbers that can be divided by 5

    Expected output:
    5
    10
    15
    .
    .
    .
    40
    45
    50
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i % 5 == 0) System.out.println(i);
        }
    }
}
