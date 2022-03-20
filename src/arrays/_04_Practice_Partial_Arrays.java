package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an array to store below numbers - numbers
        10, -3, -7, 0, 0, 7, 22

        Print all elements one by one in separate lines using FOR EACH LOOP

        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */

        System.out.println("\n---------TASK-1----------\n");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for (int number : numbers) {
            System.out.println(number);
        }


        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */

        System.out.println("\n---------TASK-2-for each loop----------\n");

        int sum1 = 0;

        for (int number : numbers) { // 10, -3, -7, 0, 0, 7, 22
            sum1 += number;
        }

        System.out.println(sum1); // 29

        System.out.println("\n---------TASK-2-for i loop----------\n");

        int sum2 = 0;
        for (int i = 0; i < 7; i++) { // numbers[0] numbers[1] numbers[2]
            sum2 += numbers[i];
        }

        System.out.println(sum2); // 29


        /*
        TASK-3
        Find the sum of first 3 elements in the array

        RESULT:
        0

        numbers[0]
        numbers[1]
        numbers[2]
        // 10, -3, -7, 0, 0, 7, 22
         */

        System.out.println("\n---------TASK-3----------\n");
        int sumOfFirst3 = 0;

        for (int i = 0; i < 3; i++) {
           sumOfFirst3 += numbers[i];
        }

        System.out.println(sumOfFirst3);


        /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
         */
        System.out.println("\n---------TASK-4----------\n");
        int sumOfLast5 = 0;
        for (int i = numbers.length-1; i >= numbers.length-5; i--) { // numbers[6] numbers[5] numbers[4] numbers[3] numbers[2]
            sumOfLast5 += numbers[i];
        }

        System.out.println(sumOfLast5);



        /*
        TASK-5
        Find the product of last 4 elements in the array but exclude zero if there are any
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        154
         */
        System.out.println("\n---------TASK-5----------\n");
        int productOfLast4 = 1;
        for (int i = 3; i < numbers.length; i++) {
            int number = numbers[i];
            if(number != 0) productOfLast4 *= number;
        }

        System.out.println(productOfLast4);


        /*
        TASK-6
        Check your collection and print true if one of the element is 0
        Print false if none of the elements is zero
        // 0, 10, -3, -7, 0, 0, 7, 22

        RESULT:
        true
         */

        boolean hasZero = false;

        for (int number : numbers) {
            if(number == 0) {
                hasZero = true;
                break;
            }
        }

        System.out.println(hasZero);

    }
}
