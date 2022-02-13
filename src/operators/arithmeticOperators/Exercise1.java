package operators.arithmeticOperators;

public class Exercise1 {
    public static void main(String[] args) {
        // create 2 int variables one bigger than the other
        // then do the 5 arithmetic operations for them

        int bigNum = 21; // 20,21,...,24
        int smallNum = 4;

        System.out.println("Addition = " + (bigNum + smallNum));
        System.out.println("Subtraction = " + (bigNum - smallNum));
        System.out.println("Multiplication = " + (bigNum * smallNum));
        System.out.println("Division = " + (bigNum / smallNum));
        System.out.println("Remainder = " + (bigNum % smallNum));
    }
}
