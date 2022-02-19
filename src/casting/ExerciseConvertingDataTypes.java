package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {

        /*
        Write a program which will take two numbers as a STRING and get the avg of them
        and print it out

        Input:
        String num1 = "23";
        String num2 = "25";

        Output:
        24
         */

        String num1 = "23"; // cannot put letters
        String num2 = "25";

        int num1Int = Integer.valueOf(num1); // String  --> Integer --> int
        int num2Int = Integer.parseInt(num2); // String --> int

        Integer num1Integer = Integer.valueOf(num1); // String --> Integer
        Integer num2Integer = Integer.parseInt(num2); // String --> int --> Integer

        System.out.println("Avg with int is = " + ((num1Int + num2Int) / 2));
        System.out.println("Avg with Integer is = " + ((num1Integer + num2Integer) / 2));


        /*
        Assume David is going to save  $390 to buy a bicycle.
        David can save only $15.60 per day. How many days later,
        David can save $390 and buy the bicycle.

        Requirement:
        Write a java program to solve this problem given above

        Input:
        String save = "390";
        String day = "15.60";

        Expected Output:
        25
         */

        String save = "390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println((int)(saveDouble / dayDouble));

    }
}
