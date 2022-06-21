package homeworks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework22 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(fibonacciSeries1(7)));
//
//        System.out.println(fibonacciSeries2(2));
//        System.out.println(fibonacciSeries2Recursion(9));
//        System.out.println(fibonacciSeries2Way2(2));

        int[] a = {1, 4, 2, 2, 1};
//        int[] b = {2, 3, 5};
//        System.out.println(Arrays.toString(findUniques(a, b)));

//        System.out.println(isPowerOf3(243));
        System.out.println(firstDuplicate(a));
    }

    /*
    Requirement:
    -Create a method called fibonacciSeries1()
    -This method will take an int argument as n, and it will
    return n series of Fibonacci numbers as an int
    array.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
     */
    public static int[] fibonacciSeries1(int n) {
        /*
          int[] fib;
            if (n >= 0)fib = new int[n];
            else fib = new int[0];
         */
        int[] fib = new int[n];

        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

//        fib[2] = fib[1] + fib[0];
//        fib[3] = fib[2] + fib[1];
//        fib[4] = fib[3] + fib[2];

        // n = 4 ==> [0, 1, 1, 2]

        for (int i = 0; i < n - 2; i++) {
            // n = 4
            // i = 0 => 3rd number is found
            // i = 1 => 4th number is found
            fib[i + 2] = fib[i + 1] + fib[i];
        }

        return fib;
    }

    public static int[] fibonacciSeries1Abe(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = n1;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr;
    }

    /*
    Requirement:
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will
    return the nth series of Fibonacci number as an int.

    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
     */
    public static int fibonacciSeries2(int n) {
        return fibonacciSeries1(n)[n - 1];
    }

    public static int fibonacciSeries2Way2(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 1;
        for (int i = 1; i < n - 1; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n2;
    }

    public static int fibonacciSeries2Recursion(int n) {
        if (n <= 1) return n;
        return fibonacciSeries2Recursion(n - 1) + fibonacciSeries2Recursion(n - 2);
    }

    /*
    Requirement:
    -Create a method called findUniques()
    -This method will take 2 int array argument and it will return
    an int array which has only the unique values from both given
    arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values
    from the other array.
     */
    public static int[] findUniques(int[] a, int[] b) {

        Set<Integer> duplicates = new HashSet<>();
        for (int first : a) {
            for (int second : b) {
                if (first == second) duplicates.add(first);
            }
        }

        Set<Integer> nonDuplicates = new HashSet<>();

        for (int i : a) if (!duplicates.contains(i)) nonDuplicates.add(i);
        for (int i : b) if (!duplicates.contains(i)) nonDuplicates.add(i);

//        int[] nonDupArr = new int[nonDuplicates.size()];
//        int index = 0;
//        for (Integer nonDuplicate : nonDuplicates) nonDupArr[index++] = nonDuplicate;

//        int[] nonDupArr = nonDuplicates.stream().mapToInt(i->i).toArray();
// OR
//        int[] nonDupArr = list.stream().mapToInt(Integer::intValue).toArray();

        return nonDuplicates.stream().mapToInt(i -> i).toArray();
    }

    /*
    Requirement:
    -Create a method called isPowerOf3()
    -This method will take an int argument and it will
    return true if given int argument is equal to 3
    power of the X. Otherwise, it will return false.
    Numbers that are power of 3 = 1, 3, 9, 27, 81, 243....
     */

    public static boolean isPowerOf3(int number){
        // 27.0
        // 27 / 3 = 9
        // 9 / 3 = 3
        // 3 / 3 = 1.0

        // 15
        // 15 / 3 = 5
        // 5 / 3 = 1
        if (number < 1 ) return false;
        double doubleNum = number;
        while (doubleNum % 3 == 0){
            doubleNum /= 3;
        }
        return doubleNum == 1.0;
    }

    /*
    Requirement:
    -Create a method called firstDuplicate()
    -This method will take an int array argument, and it will
    return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
     */
    // 1, 1, 2, 2, 3, 3, 4 ,5, 6, 7, 1, 1

    public static int firstDuplicate(int[] nums){
        int[] dup = {-1, Integer.MAX_VALUE};

        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j] && j - i < dup[1]){
                    dup[1] = j - i;
                    dup[0] = nums[i];
                }
        return dup[0];
    }

}
