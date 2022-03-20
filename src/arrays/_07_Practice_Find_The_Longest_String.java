package arrays;

public class _07_Practice_Find_The_Longest_String {

    public static void main(String[] args) {
        /*
        Find the string that has the most characters and print it
        ASSUME ALL THE STRINGS HAS DIFFERENT LENGTHS

        RESULT:
        yellow
         */

        String[] colors = {"red", "blue", "yellow", "white"};

        String longest = colors[0];

        for (String color : colors) {
            if(color.length() > longest.length()) longest = color;
        }

        System.out.println(longest);
    }
}
