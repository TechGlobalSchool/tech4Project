package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an ArrayList called numbers that stores below numbers,

        10
        12
        13
        8
        9
        15

        Print the list

        RESULT:
        [10, 12, 13, 8, 9, 15]
         */

        System.out.println("\n--------TASK-1-----------\n");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);


        /*
        TASK-2
        Count how many odd numbers you have in the list and print the result

        RESULT:
        Odds = 3
         */

        System.out.println("\n-------TASK-2-for each loop ---------\n");

        int countOdds = 0;

        for (Integer number : numbers) {
            if(number % 2 == 1) countOdds++;
        }

        System.out.println("Odds = " + countOdds);

        System.out.println("\n-------TASK-2-fori loop ---------\n");
        countOdds = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 1) countOdds++;
        }

        System.out.println("Odds = " + countOdds);

        /*
        Practices
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        /*
        TASK-3
        Create a List called colors that stores below elements
        Purple
        Yellow
        blue
        red
        Brown
        Black
        White

        And then print the list

        RESULT:
        [Purple, Yellow, blue, red, Brown, Black, White]
         */

        System.out.println("\n---------TASK 3----------\n");

        List<String> colors = new ArrayList<>();

        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("");
        colors.add(null);

        System.out.println(colors);

        /*
        TASK-4
        Count how many colors in the colors list are starting with uppercase

        RESULT:
        5
         */

        System.out.println("\n-------TASK-4-for each loop ---------\n");
        int countU = 0;

        for (String color : colors) {
            if(Character.isUpperCase(color.charAt(0))) countU++;
        }

        System.out.println(countU);


        System.out.println("\n-------TASK-4-fori loop ---------\n");
        countU = 0;

        for (int i = 0; i < colors.size(); i++) {
           if(Character.isUpperCase(colors.get(i).charAt(0))) countU++;
        }

        System.out.println(countU);


        /*
        Practices
        Lowercases
        nulls
        empties
        That has length of 4 at least
        That has length of even or odd
        That has a or A
         */
    }
}
