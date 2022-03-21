package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = s.next();
        String rWord = "";

        //civic
        //01234
        if (!word.isEmpty()){
            // 4, 3, 2, 1, 0
            for (int i = word.length() - 1; i >= 0; i--) rWord += word.charAt(i);
            if (word.equals(rWord)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");

        }else{
            System.out.println("This word does not have 1 or more characters");
        }

    }
}
