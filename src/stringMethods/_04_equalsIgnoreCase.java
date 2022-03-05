package stringMethods;

public class _04_equalsIgnoreCase {
    public static void main(String[] args) {
        /*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison is case-insensitive
        -It is non-static, and we call it with another String object
        -It is a return type and returns a boolean
        -It takes a String as an argument
         */


        System.out.println("Hello".equals("hello")); //false
        System.out.println("Hello".equalsIgnoreCase("hello")); // true
        System.out.println("Hello".equalsIgnoreCase(" hello")); // false

        String s1 = "Good";
        String s2 = "GOOD";

        boolean b = s1.equalsIgnoreCase(s2); // true
        System.out.println(b);
    }
}
