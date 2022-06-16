package homeworks;

import java.util.Arrays;

public class Homework21 {
    public static void main(String[] args) {
        String s = "ab110c0945d";
//        System.out.println(findSumNumbersKalysSolution(s));
//        System.out.println(findSumNumbers(s));;
//        System.out.println(findBiggestNumber(s));
        System.out.println(countSequenceOfCharacters("abbcca"));
    }

    /*
    Requirement:
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return
    an int which is the sum of all numbers presented in the String.
    NOTE: If there are no numbers represented in the String,
    return 0.
    Test Data 1: “abc$”
    Expected Result 1: 0
    Test Data 2: “a1b4c  6#”
    Expected Result 2: 11
    Test Data 3: “ab110c045d”
    Expected Result 3: 155
    Test Data 4: “525”
    Expected Result 4: 525
     */

    public static int findSumNumbersKalysSolution(String s) {
        int sum = 0;
        String currentNum = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                currentNum += s.charAt(i) + "";
                if (i < s.length() - 1 && !Character.isDigit(s.charAt(i + 1))) {
                    sum += Integer.parseInt(currentNum);
                    currentNum = "";
                }
            }
        }
        return sum;
    }

    public static int findSumNumbers(String s) {
        int sum = 0;
//        Test Data 3: "ab110c045ddd"
        s = "0" + s;
//        Test Data 3: " 110 045 "
        for (String num : s.trim().split("[^0-9]+")) sum += Integer.parseInt(num);
        return sum;
    }

    /*
    Requirement:
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will
    return an int which is the number presented in the
    String.
    NOTE: If there are no numbers represented in the String,
    return 0.
    Test Data 1: “abc$”
    Expected Result 1: 0
    Test Data 2: “a1b4c  6#”
    Expected Result 2: 6
    Test Data 3: “ab110c045d”
    Expected Result 3: 110
    Test Data 4: “525”
    Expected Result 4: 525
     */

    public static int findBiggestNumber(String s) {
        int max = Integer.MIN_VALUE;
        s = "0" + s;
        for (String num : s.trim().split("[^0-9]+")) if (Integer.parseInt(num) > max) max = Integer.parseInt(num);
        return max;
    }

    /*
    Requirement:
    -Create a method called
    countSequenceOfCharacters()
    -This method will take a String argument and it will
    return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “abc”
    Expected Result 2: “1a1b1c”
    Test Data 3: “abbcca”
    Expected Result 3: “1a2b2c1a”
    Test Data 4: “aaAAa”
    Expected Result 4: “2a2A1a”
     */

    public static String countSequenceOfCharacters(String s) {
        StringBuilder count = new StringBuilder(" ");

        //“abbcca”
        // " 1a2b"
        for (char c : s.toCharArray()) {
            if (count.charAt(count.length() - 1) != c) count.append("1" + c);
            else count.replace(count.length() - 2, count.length() - 1,
                    (Integer.parseInt(count.charAt(count.length() - 2) + "") + 1) + "");
        }
        return count.toString().trim();
    }

}
