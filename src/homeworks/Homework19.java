package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework19 {

    public static void main(String[] args) {
        int[] arr = {5 , 0, 6};

        System.out.println(middleInt(1, 5 , 9));
        System.out.println(Arrays.toString(arrFactorial(arr)));
        System.out.println(Arrays.toString(categorizeCharacters("abc123123!@#!@#")));
    }


    /*
    Requirement:
    -Create a method called middleInt()
    -This method will take three int arguments and it will return the middle
    int.
    Test Data 1: 1, 1, 1
    Expected Result 1: 1
    Test Data 2: 1, 2, 2
    Expected Result 2: 2
    Test Data 3: 5, 5, 8
    Expected Result 3: 5
    Test Data 4: 5, 3, 5
    Expected Result 4: 5
    Test Data 4: -1, 25, 10
    Expected Result 4: 10
     */

    public static int middleInt(int n1, int n2, int n3){
        int max = Math.max(Math.max(n1, n2), n3);
        int min = Math.min(Math.min(n1, n2), n3);

        int[] nums = {n1, n2, n3};

        Arrays.sort(nums);

        return nums[1];
    }

    /*
    Requirement:
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the
    array with every number replaced with their factorials.
    NOTE: Assume length will always be more than zero.
    NOTE: 0! is equals to 1
    Test Data 1: [1, 2, 3, 4]
    Expected Result 1: [1, 2, 6, 24]
    Test Data 2: [0, 2, 4 , 1]
    Expected Result 2: [1, 2, 24, 1]
    Test Data 3:[5 , 0, 6]
    Expected Result 3: [120, 1, 720]
     */

    public static int[] arrFactorial(int[] numbers){
        // [1, 2, 3, 4]
        // 1 * 2 * 3 * 4
        for (int i = 0; i < numbers.length; i++) {
            int factorial = 1;
            for (int j = 2; j <= numbers[i]; j++) factorial *= j;
            numbers[i] = factorial;
        }

        // [1, 2, 6, 24]
        return numbers;
    }


    /*
    Requirement:
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as
    letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.
    Test Data 1: “     ”
    Expected Result 3: [ , , ]
    Test Data 2: “abc123$#%”
    Expected Result 2: [abc, 123, $#%]
    Test Data 3: “12ab$%3c%”
    Expected Result 3: [abc, 123, $%%]
     */

    public static String[] categorizeCharacters(String str){
        String[] catg = {"", "", ""};

        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) catg[0] += character + "";
            else if (Character.isDigit(character)) catg[1] += character + "";
            else catg[2] += character + "";
        }

        return catg;
    }


//    public static String[] categorizeCharacters2(String str){
//        List<String> catg = new ArrayList<>();
//
//        for (char character : str.toCharArray()) {
//            if (Character.isLetter(character)) catg. character + "";
//            else if (Character.isDigit(character)) catg[1] += character + "";
//            else catg[2] += character + "";
//        }
//
//        return catg;
//    }
}
