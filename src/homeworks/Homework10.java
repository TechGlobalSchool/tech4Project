package homeworks;

public class Homework10 {
    public static void main(String[] args) {


        System.out.println("\nTASK1\n");

        /*
        Assume that you are given a String of any length. First check if it
        has at least length of 1. If the length is zero, then print “Length is
        zero”
         If it has length more than zero, then find:
        -The length of the String
        -First char in the String
        -Last char in the String
        -Check if the String contains any vowel letters
            -if it has any vowel, then print “This String has vowel”
            -Else, print “This String does not have vowel”
        Vowels = a, e, i, u, o
         */

        String s = "";

        if (s.isEmpty()){ // s.length() == 0 | s.length() < 1
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + s.length());
            System.out.println("First char is = " + s.charAt(0));
            System.out.println("Last char is = " + s.charAt(s.length() - 1));

            if (s.toLowerCase().contains("a") || s.toLowerCase().contains("e") || s.toLowerCase().contains("i")
            || s.toLowerCase().contains("o") || s.toLowerCase().contains("u")){
                System.out.println("This String has vowel");
            }else{
                System.out.println("This String does not have vowel");
            }
        }

    }
}
