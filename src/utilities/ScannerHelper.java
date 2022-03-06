package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static String getANameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String getAStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }
}
