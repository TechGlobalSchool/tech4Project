package homeworks;

import java.nio.file.WatchEvent;

public class Homework01 {
    public static void main(String[] args) {

        /*
        TASK-1
        -Find the binary representation of below words

        GIT
        APPIUM
                    128  64  32  16  8  4  2  1
        G -> 71   -> 0   1   0   0   0  1  1  1
        I -> 73   -> 0   1   0   0   1  0  0  1
        T -> 84   -> 0   1   0   1   0  1  0  0

        GIT -> 01000111-01001001-01010100

        A -> 65   -> 0   1   0   0   0  0  0  1
        P -> 80   -> 0   1   0   1   0  0  0  0
        P -> 80   -> 0   1   0   1   0  0  0  0
        I -> 73   -> 0   1   0   0   1  0  0  1
        U -> 85   -> 0   1   0   1   0  1  0  1
        M -> 77   -> 0   1   0   0   1  1  0  1

        APPIUM -> 01000001-01010000-01010000-01001001-01010101-01001101
         */


        /*
        TASK-2
        -Find the decimal values of given binary code below and their matching letters in ASCII

        01001101 -> 77  -> M
        01101000 -> 104 -> h
        01111001 -> 121 -> y
        01010011 -> 83  -> S
        01101100 -> 108 -> l
         */


        /*
        TASK-3
        -Write a program that prints below sentences
        -Double quotations must be displayed in
        your console when you run the code
        -Every line below must be printed with
        separate println statements

        I start to practice "JAVA" today, and I like it.
        The secret of getting ahead is getting started.
        "Don't limit yourself."
        Invest in your dreams. Grind now. Shine later.
        It’s not the load that breaks you down, it’s the way you carry it.
        The hard days are what make you stronger.
        You can waste your lives drawing lines. Or you can live your life crossing them.
         */
        System.out.println("\n------------TASK-3------------\n");

        System.out.println("I start to practice \"JAVA\" today, and I like it.");
        System.out.println("The secret of getting ahead is getting started.");
        System.out.println("\"Don't limit yourself.\"");
        System.out.println("Invest in your dreams. Grind now. Shine later.");
        System.out.println("It’s not the load that breaks you down, it’s the way you carry it.");
        System.out.println("The hard days are what make you stronger.");
        System.out.println("You can waste your lives drawing lines. Or you can live your life crossing them.");


        /*
        TASK-4
        -Write a program that prints the whole below text in ONLY 1 println statement (you can
        use escape sequences to provide line or insert a tab)

            Java is easy to write and easy to run—this is
        the foundational strength of Java and why many
        developers program in it. When you write Java
        once, you can run it almost anywhere at any time.

            Java can be used to create complete
        applications that can run on a single computer or
        be distributed across servers and clients in a
        network.

            As a result, you can use it to easily build
        mobile applications or run-on desktop applications
        that use different operating systems and servers,
        such as Linux or Windows.
         */

        System.out.println("\n------------TASK-4------------\n");

        System.out.println("\tJava is easy to write and easy to run—this is\n" +
                "the foundational strength of Java and why many\n" +
                "developers program in it. When you write Java\n" +
                "once, you can run it almost anywhere at any time.\n\n" +
                "\tJava can be used to create complete\n" +
                "applications that can run on a single computer or\n" +
                "be distributed across servers and clients in a\n" +
                "network.\n\n" +
                "\tAs a result, you can use it to easily build\n" +
                "mobile applications or run-on desktop applications\n" +
                "that use different operating systems and servers,\n" +
                "such as Linux or Windows.");

        /*
        TASK-5
        -Write a program that stores below information with proper data types and
        print all variables with separate println statements

        myAge                       int
        myFavoriteNumber            int
        myHeight                    double
        myWeight                    double
        myFavoriteCharacter         'X'
         */

        System.out.println("\n------------TASK-5------------\n");

        //dataType variableName = dataValue;

        int myAge = 21;
        int myFavoriteNumber = 7;
        double myHeight = 180.4;
        double myWeight = 184.23;
        char myFavoriteCharacter = 'X';

        System.out.println(myAge);
        System.out.println(myFavoriteNumber);
        System.out.println(myHeight);
        System.out.println(myWeight);
        System.out.println(myFavoriteCharacter);
    }
}
