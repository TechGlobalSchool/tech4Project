package operators.arithmeticOperators;

public class Division {
    public static void main(String[] args) {

        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double division = num1 / num2;
        double divisionByInt = num1 / num3;
        double divisionByDouble = num4 / num2;

        System.out.println("num1 / num2 = " + (15.0 / 3.0));            // double / double
        System.out.println("num1 / num3 = " + (num1 / num3));       // double / int
        System.out.println("num4 / num2 = " + (num4 + num2));    // int / double
                                            // 10 + 3
    }
}
