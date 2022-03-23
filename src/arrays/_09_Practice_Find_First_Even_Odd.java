package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*
        First even = 0
        First odd = 5
         */

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;

        for (int number : numbers) {
            if(number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First Even = " + number);
            }
            else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("First Odd = " + number);
            }

            if(isFirstEvenFound && isFirstOddFound) break;
        }

        if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");
    }
}
