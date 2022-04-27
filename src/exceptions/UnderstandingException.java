package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {
        /*
        Unchecked exceptions are the ones you get when you run a program
        Unchecked exceptions = Runtime exceptions
         */

        String name = "John"; // 0, 1, 2, 3

        //How to handle the exception
        try{
            System.out.println(name.charAt(2)); // StringIndexOutOfBoundsException
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("An exception is here!!!!!");
        }

        System.out.println("End of the program!");

    }
}
