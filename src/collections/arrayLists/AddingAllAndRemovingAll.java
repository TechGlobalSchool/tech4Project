package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print the list

        RESULT:
        German cars = [BMW, Mercedes, Volkswagen]
         */

        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);

         /*
        TASK-2
        Create an ArrayList of japaneseCars and add below items
        Honda
        Toyota
        Lexus

        Then print the list

        RESULT:
        Japanese cars = [Honda, Toyota, Lexus]
         */

        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");
        System.out.println("Japanese cars = " + japaneseCars);

        /*
        TASK-3
        Create an ArrayList of luxuryCars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar

        Then print the list

        RESULT:
        Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
         */
        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);


        System.out.println("\n--------Put all together--------\n");
        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory); // []

        //Adding all german cars to the inventory collection
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);

        //Adding all luxury cars to the inventory collection
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);


        //Adding all japanese cars to the inventory collection
        inventory.addAll(japaneseCars);
        System.out.println("Inventory after adding japanese cars = " + inventory);


        //Removing all japanese cars from inventory
        inventory.removeAll(japaneseCars);
        System.out.println("Inventory after removing japanese cars = " + inventory);


        /*
        Remove Tesla and BMW

         */

        ArrayList<String> carsTobeRemoved = new ArrayList<>();
        carsTobeRemoved.add("BMW");
        carsTobeRemoved.add("Tesla");

        inventory.removeAll(carsTobeRemoved);
    }
}
