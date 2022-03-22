package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        /*
        Requirement:
        -Create a String array that stores cartoon cats
        below
        Garfield, Tom, Sylvester, Azrael

        THEN:
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
        if it contains both, then print true
        if it does not contain both, print false

        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false
         */
        System.out.println("\nTASK6\n");

        /*
        1. create a String and store data, create 2 flags(container) for checking
        2. Print the entire array sorted lexicographically
        3. Then, check if it contains Garfield and Felix
        -if it contains both, then print true
        -if it does not contain both, print false
         */

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
//        String[] cats = new String[4];
//        cats[0] = "Garfield";
//        cats[1] = "Tom";              2nd way
//        cats[2] = "Sylvester";
//        cats[3] = "Azrael";

        boolean isGarfieldExisting = false;
        boolean isFelixExisting = false;

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        for (String cat : cats) {
            if (cat.equals("Garfield")) isGarfieldExisting = true;
            else if (cat.equals("Felix")) isFelixExisting = true;
        }

        System.out.println(isFelixExisting && isGarfieldExisting);


        /*
        Requirement:
        -Create a String array that stores objects below
        Pen, notebook, Book, paper, bag, pencil, Ruler

        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring
        cases

        Expected Result:
        [Pen, notebook, Book, paper, bag, pencil, Ruler]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 4
        Elements starting with B or P = 5
        Elements having ”book” or “pen”= 4
         */

        System.out.println("\nTASK9\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int upper = 0;
        int lower = 0;
        int countBP = 0;
        int bookPen = 0;

        System.out.println(Arrays.toString(objects));

        for (String object : objects) {
            if (CharacterHelper.isUppercase(object.charAt(0))) upper++;  // Character.isUpperCase() you can use this too
            else if (Character.isLowerCase(object.charAt(0)))lower++;

            if (object.toLowerCase().charAt(0) == 'b' || object.toLowerCase().startsWith("p")) countBP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) bookPen++;
        }
        System.out.println("Elements starts with uppercase = " + upper +
                "\nElements starts with lowercase = " + lower +
                "\nElements starting with B or P = " + countBP +
                "\nElements having ”book” or “pen”= " +bookPen);


        /*
        Requirement:
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0

        THEN:
        -Print both arrays
        –Then, create a new array called that will take
        greatest of same index from first 2 arrays
        -Print third array as well

        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2
         */
        System.out.println("\nTASK11\n");

        /*
        1.Create 2 int arrays that stores numbers below
            First -> 5, 8, 13, 1, 2
            Second -> 9, 3, 67, 1, 0, 2 ,9

            Third -> 9, 8, 67, 1, 2, 2, 9
        2.Print both arrays
        3.Create a new array called that will take
        greatest of same index from first 2 arrays
        4.Print 3rd array
         */

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0, 2 ,9};

        int[] third = new int[Math.max(first.length, second.length)]; // change this

        for (int i = 0; i < third.length; i++) {
            /*
            i ->        0, 1, 2,  3, 4, 5, 6

            First ->    5, 8, 13, 1, 2
            Second ->   9, 3, 67, 1, 0, 2 ,9

            Third ->    9, 8, 67, 1, 2, 2, 9
             */
            if (i < Math.min(first.length, second.length)){
                third[i] = Math.max(first[i], second[i]);
            }else if(first.length > second.length){
                third[i] = first[i]; // getting the rest
            }else{
                third[i] = second[i];// getting the rest
            }

        }

        System.out.println("1st array is = " + Arrays.toString(first) +
                "\n2nd array is = " + Arrays.toString(second) +
                "\n3rd array is = " + Arrays.toString(third));


    }
}
