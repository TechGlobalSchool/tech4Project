package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {

        char c = '9';
        boolean b = Character.isDigit(c);
        System.out.println(b); // true

        System.out.println(Character.isDigit('9')); // true

        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.isUpperCase('B')); // true

        System.out.println(Character.isLowerCase('G')); // false
        System.out.println(Character.isLowerCase('h')); // true

        System.out.println(Character.isLetter('l')); // true
        System.out.println(Character.isLetter('Z')); // true

        System.out.println(Character.isLetterOrDigit('5')); // true
        System.out.println(Character.isLetterOrDigit('t')); // true
        System.out.println(Character.isLetterOrDigit(' ')); // false

        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isSpaceChar(' ')); // true


        char c2 = '$';

        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2)); // true


        char c3 = 'A';

        String s = "AEOUIaeiou";

        System.out.println(s.contains(String.valueOf(c3))); // true

        char c4 = 'a';
        boolean isC4Vowel = false;
        int sum = 0;
        int product = 1;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (c4 == s.charAt(i)) {
                isC4Vowel = true;
                break;
            }
        }

        if(isC4Vowel) System.out.println("c4 is Vowel");
        else System.out.println("c4 is not Vowel");
    }
}
