package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        String str = "I   am      learning     Java      ";
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        int[] numbers = {10, -13, 15, 12, 70, 5, 8, 57};


        System.out.println("TASK 5 = " + removeDuplicateElements(words));
        System.out.println("TASK 6 = " + removeExtraSpaces(str));
        System.out.println("TASK 7 = " + Arrays.toString(add(arr1, arr2)));
        System.out.println("TASK 8 = " + findClosestTo10(numbers));
    }

    /*
    Requirement:
    Write a method removeDuplicateElements() that takes an 
    ArrayList of String as an argument, and returns it back with 
    removed duplicates
    Test data 1:
    ["java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"]
    Expected output 1:
    ["java", "C#", "ruby", "JAVA",  "C++"]
     */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> words) {
        ArrayList<String> withoutDup = new ArrayList<>(); // ["java", "C#", "ruby", "JAVA", "C++"]
        for (String w : words) if (!withoutDup.contains(w)) withoutDup.add(w);
        return withoutDup;
    }

    /*
    Requirement:
    Write a method removeExtraSpaces() that takes a String as an
    argument, and returns a String with removed extra spaces
    Test data 1:
    String str = “I   am      learning     Java      ”;
    Expected output 1:
    I am learning Java
     */

    public static String removeExtraSpaces(String s) {
        //first way
       /* String[] sArr = s.trim().split(" ");
        StringBuilder sentence = new StringBuilder();
        for (String el : sArr) {
            if (!el.isEmpty()) sentence.append(el).append(" ");
        }
        return sentence.substring(0, sentence.length()-1);*/

        //second way
        //String str = “I   am      learning     Java      ”;
        StringBuilder sentence = new StringBuilder(); // I am
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) sentence.append(s.charAt(i));
            else if (s.charAt(i) == ' ' && sentence.charAt(sentence.length() - 1) != ' ') sentence.append(" ");
        }
        return sentence.toString();
    }

    /*
    Requirement:
    Write a method add() that takes 2 int[] arrays as arguments and
    returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};
    Expected output 1:
    [9, 3, 2, 7, 5, 10]
     */
    public static int[] add(int[] n1, int[] n2){

//        n1[0] += n2[0];
//        n1[1] += n2[1];
//        n1[2] += n2[2];
        for (int i = 0; i < Math.min(n1.length, n2.length); i++) {
            if (n1.length > n2.length) n1[i] += n2[i];
            else n2[i] += n1[i];
        }

        return (n1.length > n2.length) ? n1: n2;
    }

    /*
    Requirement:
    Write a method findClosestTo10() that takes an int[] array
    as an argument, and returns the closest element to 10
    from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
    8
     */
    public static int findClosestTo10(int[] arr){
        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) if (arr[i] != 10 && Math.abs(10 - arr[i]) < Math.abs(10 - closest)) closest = arr[i];
        return closest;
    }
}
