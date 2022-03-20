package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */

        System.out.println("\n---------TASK-1----------\n");
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));


        /*
        TASK-2
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom


        [element1, element2 ..................  elementX]
        0          1       2 ................   length-1
         */

        System.out.println("\n---------TASK-2----------\n");

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length-1]);


        /*
        TASK-3
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names starts with A

        EXPECTED:
        2
         */

        System.out.println("\n---------TASK-3 for each loop----------\n");

        int countA = 0;

        for (String student : students) {
            //if(student.startsWith("A")) countA++;
            if(student.charAt(0) == 'A') countA++;
        }

        System.out.println(countA);

        System.out.println("\n---------TASK-3 fori loop----------\n");

        int countA2= 0;
        for (int i = 0; i < students.length; i++) {
            //if(students[i].startsWith("A")) countA2++;
            if(students[i].charAt(0) == 'A') countA2++;
        }

        System.out.println(countA2);



        /*
        TASK-4
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names contains a-A or e-E

        EXPECTED:
        5
         */

        System.out.println("\n---------TASK-4 for each loop----------\n");

        int countAorE = 0;

        for (String student : students) {
            //if(student.contains("A") || student.contains("E") || student.contains("a") || student.contains("e")) countAorE++;
            student = student.toLowerCase();
            if(student.contains("a") || student.contains("e")) countAorE++;
        }

        System.out.println(countAorE);

        System.out.println("\n---------TASK-4 fori loop----------\n");

        int countAorE2 = 0;

        for (int i = 0; i < students.length; i++) {
            if(students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E")) countAorE2++;
        }

        System.out.println(countAorE2);

        /*
        TASK-5
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters 5,6,7,8,9,.....

        EXPECTED:
        3
         */

        System.out.println("\n---------TASK-5 for each loop----------\n");
        int countLength5 = 0;

        for (String student : students) {
            if(student.length() >= 5) countLength5++;
        }

        System.out.println(countLength5);

        /*
        TASK-6
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        EXPECTED:
        false
         */

        boolean hasJennifer = false;

        for (String student : students) {
            if (student.equals("Jennifer")) {
                hasJennifer = true;
                break;
            }
        }

        System.out.println(hasJennifer); // false

//[Jennifer, Adam, Alex, James, John, Jordan, Lionel, Tom]
//Second way is not always good considering performance but would always work
        int countJennifer = 0;

        for (String student : students) {
            if(student.equalsIgnoreCase("Jennifer")) countJennifer++;
        }

        System.out.println(countJennifer > 0);




        /*
        MORE PRACTICE
        Count how many names starts with J or j
        Count how many names starts or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letter
         */
    }
}
