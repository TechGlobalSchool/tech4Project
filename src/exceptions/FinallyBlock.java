package exceptions;

import java.util.ArrayList;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            ArrayList<String> objects = new ArrayList<>();
            objects.add("Computer");
            objects.add("Mouse");
            objects.add("MousePad");

            for (String object : objects) {
                objects.remove(object); // ConcurrentModificationException
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //It is not handling the exception but still runs a block of code even though there is an exception
            System.out.println("Here is the report!!!! We report the exception here!!!");
        }

        System.out.println("End of the program");
    }
}
