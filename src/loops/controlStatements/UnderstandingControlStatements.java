package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*
        Write a program that prints all the number bt 1 to 25
        But skip the numbers that can be divided by 10
        Now, do not print any number that is more than 15
         */

        for (int i = 1; i <= 25; i++) {
            if(i % 10 != 0) {
                System.out.println(i);
            }
            if(i == 15) {
                break;
            }
        }

        //using continue control statement to skip numbers that can be divided by 10
        for (int i = 1; i <= 25; i++) { // 16 17 18 1
            if(i % 10 == 0) {
                continue;
            }
            else {
                System.out.println(i);
            }
            if(i == 15) {
                break;
            }
        }

        System.out.println("End of the program");
    }
}
