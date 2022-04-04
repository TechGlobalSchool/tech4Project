package homeworks;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        /*
        Requirement:
        Write a program to find the first duplicated String in a String array, ignore 
        cases. It should print "There is no duplicates" if there are no duplicate 
        elements.
        NOTE: Make your code dynamic that works for any given String array.
        
        Test data 1:
        String[] words = {"Z", "abc", "z", "123", "#", "abc };
         
        Expected output 1:
        Z
        Test data 2:
        String[] words = {"xyz", "java", "abc"};
         
        Expected output 2:
        There is no duplicates
        Test data 3:
        String[] words = {"a", "b", "B", "XYZ", "123"};
         
        Expected output 2:
        b
         */
        System.out.println("\nTASK-2\n");

        String[] words = {"Z", "abc", "z", "123", "#", "abc"};

        boolean isDuplicateFound = false;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    isDuplicateFound = true;
                    break;
                }
            }
            if (isDuplicateFound) break;
        }
        if (!isDuplicateFound) System.out.println("There is no duplicates");


        /*
        Requirement:
        Write a program to find the all duplicates in an int array. It
        should print "There is no duplicates" if there are no
        duplicate elements.
        NOTE: Make your code dynamic that works for any given
        int array.
        Test data 1:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        Expected output 1:
        0
        -7
        Test data 2:
        int[] numbers = {1, 2, 5, 0, 7};

        Expected output 2:
        There is no duplicates
         */

        System.out.println("\nTASK3\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        String s = "";
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !s.contains(numbers[i] + "")) {
                    s += numbers[i] + "\n";
                }
            }
        }

        System.out.println((s.isEmpty()) ? "There is no duplicates" : s);

        /*
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !duplicates.contains(numbers[i])){
                    duplicates.add(numbers[i]);
                }
            }
        }

        if (duplicates.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer duplicate : duplicates) System.out.println(duplicate);
         */

        
        /*
        Requirement:
        Write a program to reverse elements in an array, then 
        print array.
        NOTE: Make your code dynamic that works for any 
        given array.
        Test data 1:
        String[] words1 = {"abc", "foo", "bar"};
         
        Expected output 1:
        [bar, foo, abc]
        Test data 2:
        String[] words2 = {"java", "python", "ruby"};
         
        Expected output 2:
        [ruby, python, java]
         */
        System.out.println("\nTASK5\n");
        String[] words2 = {"java", "python", "ruby"};
//        String[] reverseWords2 = new String[words2.length];// [ruby, python, java]
//
//
//
//        for (int i = 0; i < words2.length; i++) {
//            reverseWords2[i] = words2[words2.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(reverseWords2));

        System.out.print("[");
        for (int i = words2.length - 1; i >= 0; i--) System.out.print((i == 0) ? words2[i] : words2[i] + ", ");
        System.out.print("]");

        /*
        Requirement:
        Write a program to reverse each word in a given String
        NOTE: Make your code dynamic that works for any
        given String.
        Test data 1:
        String str = “Java is fun”;

        Expected output 1:
        avaJ si nuf

        Test data 2:
        String str = “Today is a fun day”;

        Expected output 2:
        yadoT si a nuf yad
         */

        System.out.println("\nTASK6\n");

        String str = "Java is fun";

//        String[] w = str.split(" ");
//
//        for (int i = 0; i < w.length; i++) {
//            //w[i] --> Java
//            String currentReverseW = "";
//            for (int j = w[i].length() - 1; j >= 0 ; j--) {
//                currentReverseW += "" + w[i].charAt(j);
//            }
//            // currentReverseW --> avaJ
//            w[i] = currentReverseW;
//        }
//        // w -> [avaJ, si, nuf]
//
//        for (int i = 0; i < w.length; i++) {
//            System.out.print((i == w.length - 1) ? w[i]: w[i] + " ");
//        }

    }
}
