package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        /*
        1. create a new txt file called shoppingList
        2. Write all items below
        Ice-cream
        Fruits
        Pen
        Paper
        Milk
         */

        File file = new File("shoppingList.txt");

        try{
            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-Cream\n");
            fileWriter.write("Fruits\n");
            fileWriter.write("Pen\n");
            fileWriter.write("Paper\n");
            fileWriter.write("Milk");
            fileWriter.close();
            Thread.sleep(1000);


            //How to read information from a file
            Scanner scanner = new Scanner(file);

            /*
            for (int i = 1; scanner.hasNextLine(); i++) {
                Thread.sleep(1000);
                System.out.println("Item " + i + " = " + scanner.nextLine());
            }
             */

            int index = 1;
            while(scanner.hasNextLine()){
                System.out.println("Item " + index++ + " = " + scanner.nextLine());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            file.delete();
        }

        System.out.println("End of the program!");
    }
}
