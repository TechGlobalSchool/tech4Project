package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        //Removing vowels
        String str = "Hello World";
        System.out.println("Before: " + str);

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("After: " + str);
        //Removing digits

        String str2 = "hello123world";
        str2 = str2.replaceAll("[^0-9]","");
        System.out.println(str2);

        /*Create a String as below:
        String str = “ abc 123 $#^ ”;
        Remove all special characters
        Expected output: abc123
         */

        String str3 = " aAc 123 $#^%  )(! ";
        System.out.println(str3.replaceAll("[^a-zA-Z0-9]",""));


    }
}
