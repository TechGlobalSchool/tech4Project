package operators.incrementAndDecrementOperators;

public class PreDecrementAndPostDecrement {
    public static void main(String[] args) {

        int a = 5;

        System.out.println(a--); // 5 // a -= 1 -> a = a - 1
        System.out.println(a);   // 4

        System.out.println(--a); // 3
        System.out.println(a--); // 3
        System.out.println(a);   // 2
    }
}
