package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {
        /*
        Create an int array to store 1, 5, 7, 9, 10
        Then, print the array
         */

        System.out.println("\n-------int array-------\n");
        int[] arr = {1, 5, 7, 9, 10, 10}; // null is not allowed as it is a primitive array
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]); // 7


        /*
        Create a String array to store cities as below
        Tokyo
        Berlin
        Oslo
        Denver
        null
        null
        Then, print the array
         */
        System.out.println("\n-------String array-------\n");
        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));



        /*
        List: ArrayList - Vector - LinkedList
         */
        System.out.println("\n-------String ArrayList-------\n");
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        cities2.add("Tokyo");

        System.out.println(cities2);
        System.out.println(cities2.get(3)); // Denver


        System.out.println("\n-------String Vector-------\n");
        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println("Name at index of 5 = " + names.get(5));


        System.out.println("\n-------String LinkedList-------\n");
        LinkedList<String> objects1  = new LinkedList<>();
        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());
        System.out.println(objects1);
        System.out.println(objects1.get(2)); // Airpods
        System.out.println(objects1.stream().filter(Objects::isNull).count()); // 4
    }
}
