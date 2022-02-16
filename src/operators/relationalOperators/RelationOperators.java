package operators.relationalOperators;

public class RelationOperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;    // a is EQUAL to b
        boolean isANotEqualToB = a != b; // a is NOT EQUAL TO b

        System.out.println("a = b : " + isAEqualToB);       // false
        System.out.println("a != b : " + isANotEqualToB);   // true

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isASmallerOrEqualThanB = a <= b;

        System.out.println("a > b : " + isAGreaterThanB);           //false
        System.out.println("a < b : " + isASmallerThanB);           //true
        System.out.println("a >= b : " + isAGreaterOrEqualThanB);   //false
        System.out.println("a <= b : " + isASmallerOrEqualThanB);   //true


        int x = 3;
        int y = 5;
        int z = 9;

        boolean bool = x + y == --z; // 3 + 5 = 9 - 1
//        bool = x + y + 1 == z;       // 3 + 5 + 1 = 9

        System.out.println("Naim's question: " + x + (y == --z));
        //Naim's question: 3false
    }
}
