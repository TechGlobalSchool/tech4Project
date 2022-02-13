package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int number1 = 9;
        int number2 = 3;

        number1 = 5;


        // addition
        int sum = number1 + number2; // 8

        // subtraction
        int sub = number1 - number2; // 2

        // multiplication
        int times = number1 * number2; // 15

        //division
        int div = number1 / number2;  // 5 / 3 = 1.666666...

        //remainder
        int remainder = number1 % number2; // 5 - (3 * 1) = 2

        System.out.println("addition is = " + sum);
        System.out.println("subtraction is = " + sub);
        System.out.println("multiplication is = " + times);
        System.out.println("division is = " + div);
        System.out.println("remainder is = " + remainder);
    }
}
