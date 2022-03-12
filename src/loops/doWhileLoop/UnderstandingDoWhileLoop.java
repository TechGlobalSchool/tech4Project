package loops.doWhileLoop;

import java.util.Random;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {

        boolean b = false;


        while(b){
            System.out.println("true");
            b = false;
        }

        System.out.println("End of the program");


        boolean b2 = false;

        do{
            System.out.println("true");
        }while(b2);
    }
}
