package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    /*
    TASK
    Create a new txt file called objects
    Write below data in it,
        Computer
        Phone
        Table
        Chair
        Mouse
        Screen
        Remote
    Print objects that has r or R as a let
    EXPECTED OUTPUT
    Computer
    Chair
    Screen
    Remote
    */

    public static void main(String[] args) {
        File file = new File("objects.txt");

        try{
            FileWriter fileWriter = new FileWriter("objects.txt");
            fileWriter.write("Computer\n");
            fileWriter.write("Phone\n");
            fileWriter.write("Table\n");
            fileWriter.write("Chair\n");
            fileWriter.write("Mouse\n");
            fileWriter.write("Screen\n");
            fileWriter.write("Remote\n");
            fileWriter.close();

            Scanner reader = new Scanner(file);

            /*
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote
             */
            while(reader.hasNextLine()){
                String next = reader.nextLine();
                if(next.toLowerCase().contains("r")) System.out.println(next);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            file.delete();
        }

        System.out.println("End of the program");
    }
}
