package mathClass;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        /*
        Find the min and max of given 3 numbers, write
        down the Pseudo code and print min and max with
        proper messages.


        NOTE: Declare and Assign all of them in one single line
        x = 4, y = 67, z = -54
         */

//        int x = 4, y = 67, z = -54;
//
//        Math.max(x, y); // 67 1st step
//

        System.out.println("Max of every number is = " +
                Math.max(Math.max(4, 67), -54)); // 67, -54

        System.out.println("Min of every number is = " +
                Math.min(
                        Math.min(4, 67), -54)
         );



        System.out.println("Hello DATA");


    }
}
