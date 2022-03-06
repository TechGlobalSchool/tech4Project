package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
        String name2 = "Alona";

        System.out.println(StringHelper.getMiddle(name1)); // yl
        System.out.println(StringHelper.getMiddle(name2)); // o
        System.out.println(StringHelper.getMiddle("Kaly")); // al
        System.out.println(StringHelper.getMiddle("Guluzar")); // u
        System.out.println(StringHelper.getMiddle("Alexandr")); // xa

    }
}
