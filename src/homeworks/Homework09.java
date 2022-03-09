package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {

        String str = ScannerHelper.getAStringFromUser().toLowerCase();

        if(str.contains("red") && str.contains("green")) System.out.println("Both here");
        else if(str.contains("red")) System.out.println("Red here");
        else if(str.contains("green")) System.out.println("Green here");
        else System.out.println("None here");

    }
}
