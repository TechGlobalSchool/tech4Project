package exceptions;

public class Try_Catch_Finally_Blocks {
    public static void main(String[] args) {

        try{
            System.out.println(3 / 1); // 3
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("This is finally block here");
        }

        System.out.println("End of the program!");
    }
}
