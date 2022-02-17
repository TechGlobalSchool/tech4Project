package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random = Math.random(); // 0.0----0.9999

        int random0And10Included = (int) (Math.random() * 11); // 0.000 - 10.88456

        System.out.println(random);
        System.out.println(random0And10Included);

        // create a random number between 0 - 20  included take that as an int

    }
}
