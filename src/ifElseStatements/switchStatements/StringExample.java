package ifElseStatements.switchStatements;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, tell me the greeting for the current time");
        String greeting = scan.nextLine();


        switch (greeting){
            case "Good morning!":
                System.out.println("Then, it is morning");
                break;
            case "Good afternoon!":
                System.out.println("Then, it is afternoon");
                break;
            case "Good evening!":
                System.out.println("Then, it is evening");
                break;
            default:
                System.out.println("Well, I need to study more");
        }


        System.out.println("\n\nEnd of the program!");
    }
}
