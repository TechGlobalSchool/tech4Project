package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java"; // [J, a, v, a]

        char[] chars = s.toCharArray();

        System.out.println(Arrays.toString(chars)); // [J, a, v, a]

        int countA = 0;

        for (char element : chars) {
            if(element == 'a') countA++;
        }

        System.out.println(countA);

        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o]
    }
}
