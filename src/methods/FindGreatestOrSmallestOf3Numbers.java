package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {

       //Math.max(5, 1, 5); // compiler error

        int max = MathHelper.maxOfThree(5, 2, 6);

        System.out.println("Max of three numbers  = " + max);

        MathHelper.maxOfThree(1.1, 1.2, 1.3); // 1.3


        byte b1 = (byte)(Math.random()*10);
        byte b2 = (byte)(Math.random()*10);
        byte b3 = (byte)(Math.random()*10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3 = " + b3);

        System.out.println(MathHelper.minOfThree(b1, b2, b3)); //
    }
}
