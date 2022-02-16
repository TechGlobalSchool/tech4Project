package mathClass;

public class FindMin {
    public static void main(String[] args) {

        int x = 45;
        int y = 12;

        int z = 65;
        int a = 123;
        int b = -123;

        int minOfXY = Math.min(x ,y); // x, y --> 45, 12
        int minOfZA = Math.min(z, a); // z, a --> 65, 123

        int minOfZAB = Math.min(minOfZA, b); // za, b --> 65, -123
        int minOfEvery = Math.min(minOfXY, minOfZAB);

        System.out.println(minOfEvery);

    }
}
