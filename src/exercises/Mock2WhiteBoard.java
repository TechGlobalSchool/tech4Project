package exercises;

public class Mock2WhiteBoard {
    // Count words
    // Palindrome
    // codingbat arrays1/sum2

    public static void main(String[] args) {
        String pal = "kayak";
        String sentence = "Java is fun but hard";
        System.out.println("This sentence has " + countWords(sentence) + " words.");
        System.out.println("This sentence has " + countWordsWithSplit(sentence) + " words.");
        System.out.println(isPalindrome(pal));

    }

    public static int countWords(String s) {
        int spaces = 1;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == ' ') spaces++;
        return spaces;
    }

    public static int countWordsWithSplit(String s) {
        //Java is fun but hard
        return s.split(" ").length;
    }

    public static boolean isPalindrome(String s) {
        String rS = "";
        for (int i = 0; i < s.length(); i++) {
            rS += s.charAt(s.length() - 1 - i);
            //s.length() - 1, s.length() - 2,s.length() - 3
        }
        return  s.equals(rS);
    }
}

