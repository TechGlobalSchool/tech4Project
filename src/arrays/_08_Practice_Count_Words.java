package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        TASK-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
         */

        System.out.println("\n--------TASK-1--------\n");

        String s1 = "Today is Tuesday"; // {"Today", "is", "Tuesday"}

        int countSpace = 0;

        for (char c : s1.toCharArray()) {
            if(c == ' ') countSpace++;
        }

        System.out.println(countSpace+1);

        String[] words = s1.split(" ");
        System.out.println(words.length); // 3



        /*
        TASK-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        RESULT:
        2
         */

        System.out.println("\n--------TASK-2--------\n");

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        String[] words2 = s2.split(" "); //[Some, countries, I, visited, were, Argentina,, Belgium, and, Malta]

        int countA = 0;
        for(String word : words2){
            if(word.toLowerCase().startsWith("a")) countA++;
        }

        System.out.println(countA);
    }
}
