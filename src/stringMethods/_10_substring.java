package stringMethods;

public class _10_substring {
    public static void main(String[] args) {
        /*
        Method Task: They are used to extract a substring from a larger string
        -They are non-static, and we call them with objects
        -They are return type, and they return another string
        -There are 2 overloaded substring methods
            1. substring(int beginIndex)
               -This method takes begin index as an argument, and it extracts a substring starting from given index
               to the end
            2. substring(int beginIndex, int endIndex)
               -This method will take 2 args to define which index to start and which index to stop to extract
               a substring
               NOTE: beginIndex is inclusive but endIndex is exclusive
               NOTE: if your beginIndex is equal to endIndex, then it will return empty string
               NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException
         */

        String result = "About 3,520,000,000 results (0.82 seconds)";

        String num = result.substring(6, 19); //3,520,000,000

        System.out.println(num);

        // Use the substring method to get "(0.82 seconds)"
        System.out.println(result.substring(28, 42)); //   (0.82 seconds)
        System.out.println(result.substring(28, result.length())); //   (0.82 seconds)
        System.out.println(result.substring(28)); //   (0.82 seconds)

        System.out.println("\n-------BE CREATIVE-------\n");
        System.out.println(result.substring(result.indexOf('(')));
        System.out.println(result.substring(result.lastIndexOf('(')));
        System.out.println(result.substring(result.length()-14));
        System.out.println(result.substring(result.indexOf("results")+8));


        String name = "Lionel";

        System.out.println(name.substring(3, 4)); // "n" name.charAt(3)
    }
}
