package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {
        /*
        Write a Java program to count total number of “o” letter in the given String below:

            String str = “TechGlobal School”;

        Expected output:
        3
         */

        String str = "TechGlobal SCHOOL";

        int count = 0;

        for(int i = 0; i < str.length(); i++){
           if(str.toLowerCase().charAt(i) == 'o') count++;
        }

        System.out.println(count); // 3
    }
}
