package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a list to store below data
        cities

        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev

        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Brugge, Kiev]
         */

        String[] cities1 = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> citiesList = new LinkedList<>();
        Collections.addAll(citiesList, cities1);

        System.out.println(citiesList);
        citiesList.removeIf(element -> element.equals("Dallas"));
        citiesList.remove("Miami");
        System.out.println(citiesList);
    }
}
