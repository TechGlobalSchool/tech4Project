package exercises;

public class WhiteBoardQuestions {
    public static void main(String[] args) {

        // fibonacci  10 numbers from fibonacci

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        String s = "";

        for (int i = 0; i < 10; i++) {
            //store the num    +
            s += n1 + " - ";

            // get the third    +
            n3 = n1 + n2;

            // change n1 and n2 for the next time
            n1 = n2;
            n2 = n3;

        }
        // 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 -
        System.out.println(s.substring(0, s.length() - 3));


        // finding max and second max from an array
        System.out.println("\nfinding max and second max from an array\n");


        int[] nums = {4, 5, 64, 345, 36, 74, 32};

        /*
        1. 2 containers for max and second max
        2. find the max with loop
        3. find the second max with loop(if it is not the max and  bigger than the rest it is second max)
         */

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) if (max < num) max = num;
        for (int num : nums) if (num != max && secondMax < num) secondMax = num;
        System.out.println(max);
        System.out.println(secondMax);

        // palindrome

        System.out.println("\npalindrome\n");

        String word = "Civic";
        String rWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {// 4, 3, 2, 1, 0
            rWord += word.charAt(i) + "";
        }
        System.out.println(rWord.equals(word));

        //fizzbazz --> 4 conditions (1 to 16 both included)
        //both by 3 and 5 divided it is "fizzbazz"
        //by 3 it is "bazz"
        //by 5 it is "fizz"
        //by NONE it is number itself

        System.out.println("\nfizzbazz\n");

        for (int i = 1; i <= 16; i++) {
            if (i % 15 == 0) System.out.println("fizzbazz");
            else if (i % 5 == 0) System.out.println("fizz");
            else if (i % 3 == 0) System.out.println("bazz");
            else System.out.println(i);
        }

        //foobar

        System.out.println("\nfoobar\n");

        for (int i = 1; i <= 16; i++) {
            if (i % 6 == 0) System.out.println("foobar");
            else if (i % 2 == 0) System.out.println("foo");
            else if (i % 3 == 0) System.out.println("bar");
            else System.out.println(i);
        }

        /*
             METHOD-1 countPositives
             Write a method that takes an int array argument and returns the
             total occurrences of positive elements in the array as an int
             TEST DATA:
             [7, -3, -7, 0, 2, 0, 7, 10, 2, 1]
             EXPECTED OUTPUT:
             6

         */


    }

    public static int countPositives(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) counter++;
        }
        return counter;
    }



      /*
         METHOD-1 countLetters
         Write a method that takes a char array argument and returns the total occurrences of letter elements in the array as an int
         TEST DATA:
         ['a', '2', ' ', 'r', '#', 'B', '8']
         EXPECTED OUTPUT:
         3
          */

    public static int countLetters(char[] chars) {
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) counter++;
        }
        return counter;
    }


}
