package projects;

public class Project03 {
    public static void main(String[] args) {

        /*
        TASK-3
        -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
        included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
        task.
        Test data: Assume below numbers are generated
        Random number 1 = 43
        Random number 2 = 7
        Random number 3 = 30
        Expected result:
        Lowest number is = 7
        Middle number is = 30
        Greatest number is = 43
         */

        System.out.println("\nTASK3\n");

        int num1 = (int)(Math.random() * 50) + 1;
        int num2 = (int)(Math.random() * 50) + 1;
        int num3 = (int)(Math.random() * 50) + 1;

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Lowest number is = " + min);
        if (num1 != max && num1 != min){
            System.out.println("Middle number is = " + num1);
        }else if (num2 != max && num2 != min){
            System.out.println("Middle number is = " + num2);
        }else{
            System.out.println("Middle number is = " + num3);
        }
        System.out.println("Greatest number is = " + max);

        /*
        TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
        NOTE: You need to use ASCII table and casting for this task

        Test data 1: Assume you are given 5
        char c = ‘5’;

        Expected result 1:
        Invalid character detected!!!

        Test data 2: Assume you are given a
        char c = ‘a’;

        Expected result 2:
        The letter is lowercase
        Test data 3: Assume you are given R
        char c = ‘R’;
         */
        System.out.println("\nTASK4\n");
        char c = '5';

        if (c >= 'a' && c <= 'z'){
            System.out.println("The letter is lowercase");
        }else if (c >= 'A' && c <= 'Z'){
            System.out.println("The letter is uppercase");
        }else{
            System.out.println("Invalid character detected!!!");
        }

        /*
        TASK-5 (Find if given char is vowel or consonant)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, I, o, u, A, E, I, O, U
        NOTE: You need to use ASCII table and casting for this example

        Test data 1: Assume you are given #
        char c = ‘#’;
        Expected result 1:
        Invalid character detected!!!

        Test data 2: Assume you are given E
        char c = ‘E’;
        Expected result 2:
        The letter is vowel

        Test data 3: Assume you are given R
        char c = ‘R’;
        Expected result 3:
        The letter is consonant
         */

//        if (c <= 64 || (c >= 91 && c <= 96) || c > 122){ // <-- special & number --> cInt >= 48 && cInt <= 57
//            System.out.println("Invalid character detected!!!");
//        } else {
//            switch (c) { //vowel
//                case 97: // a --> can put 97 or 'a'
//                case 101: // e
//                case 105: // i
//                case 111: // o
//                case 117: // u
//                case 65: // A
//                case 69: // E
//                case 73: // I
//                case 79: // O
//                case 85: // U
//                    System.out.println("The letter is vowel");
//                    break; // W/O break; the program will continue print out even after a match has been made
//                default: // consonant
//                    System.out.println("The letter is consonant");
//            }
//
//        }

        System.out.println("\nTASK5\n");

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            // EVERYTHING IN HERE IS LETTER


            switch (c){
                case 'a': // 97
                case 101: // e
                case 105: // i
                case 111: // o
                case 117: // u
                case 65: // A
                case 69: // E
                case 73: // I
                case 79: // O
                case 85: // U
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }

        }else {
            System.out.println("Invalid character detected!!!");
        }

        /*
        TASK-6 (Find if given char is special character or not)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
        NOTE: You need to use ASCII table and casting for this example

        Test data 1: Assume you are given 8
        char c = ‘8’;

        Expected result 1:
        Invalid character detected!!!
         */

//        boolean isLetterOrDigit = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
//
//        boolean isSpecial = !(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9');
//

        System.out.println("\nTASK6\n");

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
            //ALL LETTERS ARE HERE (Lower case and upper case)
            //ALL DIGITS ARE HERE
            System.out.println("Invalid character detected!!!");
        }else{
            // ALL SPECIAL CHARACTERS ARE HERE
            System.out.println("Special character is = " + c);
        }

//        char beyond127 = 64000;
//        System.out.println(beyond127);


    }
}
