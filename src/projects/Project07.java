package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {


    /*
    TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. Complete task using sort() method.
    Test data:
    [10, 5, 6, 7, 8, 5, 15, 15]
    Expected output:
    Second Smallest = 6
    Second Greatest = 10
     */

    public static void findSecondGreatestAndSmallestWithSort(int[] nums){
        //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(nums);

        //[5, 5, 6, 7, 8, 10, 15, 15]
        // max = nums[nums.length - 1]
        // min = nums[0]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0]){
                System.out.println(nums[i]);
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] != nums[nums.length - 1]){
                System.out.println(nums[i]);
                break;
            }
        }



    }

    /*
    TASK-4 - findSecondGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find
        the second greatest and second smallest elements from the array and print
        them. DO NOT sort the array and complete task without sorting.
        Test data:
        [10, 5, 6, 7, 8, 5, 15, 15]
        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */

    
    /*
    TASK-6 findMostRepeatedElementInAnArray() method 
    Write a method that takes a String array. Find the most repeated element 
    and print it.
    
    Test data:
    ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]
    
    Expected output:
    pen
     */
    
    public static void findMostRepeatedElementInAnArray(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }

    
    public static void main(String[] args) {
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        String[] words2 = {"a", "a", "b", "c"}; // a counted 2 times in this array
        String[] words3 = {"abc", "ABC", "ab", "ab", "abc", "ab"}; // ab counted 3 times in this array
        int[] nums = {10, 5, 6, 7, 8, 5, 15, 15};


        findMostRepeatedElementInAnArray(words);
        findMostRepeatedElementInAnArray(words2);
        findMostRepeatedElementInAnArray(words3);
        findMostRepeatedElementInAnArray(new String[]{"x", "y", "z", "y"});
        findSecondGreatestAndSmallestWithSort(nums);

    }
}
