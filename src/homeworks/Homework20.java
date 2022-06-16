package homeworks;

import java.util.*;

public class Homework20 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        System.out.println(Arrays.deepToString(numberAndSquare(nums)));

//        int[][] multArr1 = new int[2][];
//        System.out.println(Arrays.deepToString(multArr1));
//        int[][] multArr2 = new int[3][];
//        System.out.println(Arrays.deepToString(multArr2));

//        String sentence = "This is a sentence";
//        System.out.println(reverseSentence(sentence));
//
//        String[] strArr = {"123Java", "#$%is", "fun"};
//        System.out.println(Arrays.toString(removeArraySpecialsDigits(strArr)));

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("java","java", "is", "fun"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Java", "C#", "Python"));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"));

//        System.out.println(removeAndReturnCommons(l1, l2));
        System.out.println(noXInVariables(list));

    }

    public static int[][] numberAndSquare(int[] nums) {
        // [1, 2, 3] --> nums
        // [[1, 1], [2, 4], [3, 9]]
        int[][] numsSquare = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
////            int[] numAndSquare = {nums[i], nums[i] * nums[i]};
//            numsSquare[i] = new int[]{nums[i], nums[i] * nums[i]};
            numsSquare[i][0] = nums[i];
            numsSquare[i][1] = nums[i] * nums[i];
        }
        return numsSquare;
    }

    public static String reverseSentence(String sentence) {
        // sentence -> "This is a sentence"
        if (!sentence.trim().contains(" ")) return "There is not enough words!";

        StringBuilder sb = new StringBuilder();
        // sentence.trim().split("\\s+") --> ["This", "is", "a", "sentence"] --> "Sentence a is this"
        String[] sentenceArr = sentence.trim().split("\\s+");
        for (int i = sentenceArr.length - 1; i >= 0; i--) {
            sb.append(sentenceArr[i].toLowerCase() + " ");
        }

        return sb.substring(0, 1).toUpperCase() + sb.substring(1).trim();
    }

    public static String[] removeArraySpecialsDigits(String[] arrs) {
        // arrs -> ["123Java", "#$%is", "fun"]
        // arrs -> ["Java", "is", "fun"]

        // String pool --> "123Java", "#$%is", "fun", "Java"

        for (int i = 0; i < arrs.length; i++) {
//            StringBuilder sb = new StringBuilder();
//            for (char character : arrs[i].toCharArray()) if (Character.isLetter(character)) sb.append(character);
//            arrs[i] = sb.toString();
            arrs[i] = arrs[i].replaceAll("[^a-zA-Z]", "");
        }
        return arrs;
    }

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> l1, ArrayList<String> l2){
        ArrayList<String> duplicates = new ArrayList<>();

        for (String s1 : l1) {
            for (String s2 : l2) {
                if (s1.equals(s2) && !duplicates.contains(s1)) duplicates.add(s1);
            }
        }

        return duplicates;
    }

    public static ArrayList<String> noXInVariables(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {

            String noXElement = list.get(i).replaceAll("[xX]", "");

            if (noXElement.isEmpty()) list.remove(i--);
            else list.set(i, noXElement);
        }



        return list;
    }
}
