package utilities;

public class CharacterHelper {

    /*
    TASK-1
    -Create a method called isSpace()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is space, return false if the given char is not a space
     */

    public static boolean isSpace(char c){
        return c == ' '; // or 32 in the ASCII Table
    }

    /*
    TASK-2
    -Create a method called isDigit()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a digit, return false if the given char is not a digit
    NOTE: Digits are represented from 48 to 57 in the ASCII Table
     */
    public static boolean isDigit(char c){
        return c >= 48 && c <= 57; //or c >= '0' && c <= '9'
    }

    /*TASK-3
    -Create a method called isUppercase()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is an uppercase letter, return false if the given char is not an uppercase letter
    NOTE: Uppercase letters are represented from 65 to 90 in the ASCII Table

     */
    public static boolean isUppercase(char c){
        return c >= 65 && c <= 90; // c >= 'A' && c <= 'Z'
    }
    /*
        TASK-4
    -Create a method called isLowercase()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a lowercase letter, return false if the given char is not a lowercase letter
    NOTE: Lowercase letters are represented from 97 to 122 in the ASCII Table
     */

    public static boolean isLowercase(char c){
        return c >= 97 && c <= 122; // c >= 'a' && c <= 'z'
    }

    /*
    TASK-5
    -Create a method called isLetter()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a letter, return false if the given char is not a letter
    NOTE: Letters are represented from 65 to 90 and from 97 to 122 in the ASCII Table
     */

    public static boolean isLetter(char c){
        //return c >= 65 && c <= 97 || c >= 97 && c <= 122; //we already defined this above.
        return isUppercase(c) || isLowercase(c);
    }

    /*
    TASK-6
    -Create a method called isVowel()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a vowel letter, return false if the given char is not a vowel letter
    NOTE: Vowel letters are A,E,O,U,I,a,e,o,u,i
     */
    public static boolean isVowel(char c){
        return c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I'
                || c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o';

    }
    /*
    TASK-7
    -Create a method called isConsonant()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a consonant letter, return false if the given char
    is not a consonant letter
    NOTE: Consonant letters are any number represented from 65 to 90 and from 97 to 122 in the ASCII
    Table but not vowels (A,E,O,U,I,a,e,o,u,i) or specials etc.
     */

    public static boolean isConsonant(char c){
        return isLetter(c) && !isVowel(c);
    }


}
