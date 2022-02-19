package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random = Math.random(); // 0.0----0.9999

        int random0And10Included = (int) (Math.random() * 11); // 0.000 - 10.88456

        System.out.println(random);
        System.out.println(random0And10Included);

        // create a random number between 0 - 20  included take that as an int

        int random0And20Included = (int) (Math.random() * 21);

        System.out.println(random0And20Included);

        // create a random number between 10 - 20  included take that as an int
        int random10And20Included = (int) (Math.random() * 11) + 10;  // 10 - 20

        System.out.println(random10And20Included);


        //create a random number between 103 - 346  included take that as an int
        // get the difference --> 346 - 103 = 243 add + 1
        // multiply it by 243 + 1 = 244
        // add the starting point to the equation
        // random * (end point - start point + 1) + start point  --> included

        int random103And346Included =103 + (int) (Math.random() * 244);

        System.out.println(random103And346Included);

        // create a random number between -50 / 50  included take that as an int
        // random * (end point - start point + 1) + start point  --> included
        // (random * (101)) - 50)

        int random_50And50Included = (int) (Math.random() * 101) - 50;
        System.out.println(random_50And50Included);

       
    }
}
