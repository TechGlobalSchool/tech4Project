package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        /*
        Write a Java program to print “Hello” 5 times

        Expected:
        Hello
        Hello
        Hello
        Hello
        Hello
         */

        /*
        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
        }
         */


        //age becomes 35 if(age == 35)
        int year = 2022;

        for(int i = 10; i <= 35; i++){ // post-increment
            System.out.println("The age is  = " + i + " in " + year);
            year++;
        }

        System.out.println("End of the program!");
    }
}
