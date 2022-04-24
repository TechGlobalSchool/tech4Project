package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        //Second greatest = 7
        //Second smallest = 3

        //TreeSet -> [1, 3, 5, 7, 10]
        ArrayList<Integer> uniquesList = new ArrayList<>(new TreeSet<>(numbers));
        System.out.println(uniquesList.get(uniquesList.size()-2)); // 7
        System.out.println(uniquesList.get(1)); // 3

    }
}
