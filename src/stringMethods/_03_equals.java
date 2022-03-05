package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
        /*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison is case-sensitive
        -It is non-static, and we call it with another String object
        -It is a return type and returns a boolean
        -It takes a String as an argument
         */

        System.out.println("Melda".equals("Melda")); // true
        System.out.println("melda".equals("Melda")); // false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3)); // true

        System.out.println("\n-------PRACTICES--------\n");
        String str1 = "Hello";
        String str2 = str1; // str2 = "Hello"

        boolean b = !(str1.equals(str2)); // false

        System.out.println(b); // false


        System.out.println(!("abc".concat("xyz").equals("abcx" + "yz")));
        /*
        "abcxyz".equals("abcxyz")   -> !true -> false

        int i = (5 + 2) * 3 ->
         */


    }
}
