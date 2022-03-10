package loops.forLoop;

public class PrintEachCharFromAString {
    public static void main(String[] args) {
        /*
        Write a Java program to print each character of given String in a separate line:

            String str = “TechGlobal School”;

        Expected output:
        T
        e
        c
        .
        .
        .
        o
        o
        l

        firstChar = charAt(0)
        lastChar = charAt(str.length())
         */
        String str = "TechGlobal School";

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }
}
