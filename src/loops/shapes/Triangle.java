package loops.shapes;

public class Triangle {
    public static void main(String[] args) {
        /*
        A
        AA
        AAA
        AAAA
        AAAAA
        AAAAAA
    15
         */

        for (int i = 1; i <= 100; i++) { // i = 3
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }


        /*
        A
        AA
        AAA



         */
    }
}
